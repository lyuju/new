package l_ftp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileClient extends JFrame {

	List<FileTransfer> files;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JTextField tIp;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileClient frame = new FileClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FileClient() {
		setTitle("\uD30C\uC77C \uD074\uB77C\uC774\uC5B8\uD2B8 \uC804\uC1A1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);

		/*
		 * for(int i=0;i<10;i++) { panel_1.add(new FileTransfer()); }
		 */

	
	/*try {
		InetAddress addr = InetAddress.getLocalHost();
		getTIp().setText(addr.getHostAddress());
	}catch(Exception ex){
		
	}*/
}
	public void fileChooser() {
		JFileChooser fc = new JFileChooser();// 파일추저 자체가 하나하나의 쓰레드
		fc.setMultiSelectionEnabled(true);
		int flag = fc.showOpenDialog(FileClient.this);
		int a=0;
		if (flag == a) {
			
			File[] tempFiles = fc.getSelectedFiles();
			files = new ArrayList<FileTransfer>();
			for (File f : tempFiles) {
				FileTransfer ft = new FileTransfer(f.getPath());// 파일트랜스퍼시작
				files.add(ft);
				panel_1.add(ft);
				panel_1.updateUI();
 
			}
		}

	}

	public void send() {
		// 전송할 파일의 목록과 파일의 크기를 Data에 담아서 서버전달
		Data data = new Data();
		ObjectInputStream ois;
		
		
		for (FileTransfer ft : files) {
			File f = new File(ft.getFileName().getText());//데이터에다가 주는파일
			data.fileName.add(f.getName());//파일명만 가지고 간다.
			data.fileSize.add(ft.fileSize);
			
		}
		Socket socket = null;
		try {
			socket = new Socket(tIp.getText(), 5555);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(data);
			oos.flush();
		} catch (Exception e1) {

			e1.printStackTrace();
		}

		// 서버가 전달한 port번호를 사용하여 서버에 추가접속
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			for (FileTransfer ft : files) {
				Data temp = (Data)ois.readObject();
				ft.ip=getTIp().getText();
				ft.port = temp.port;//스레드가 시작되면서 파일을 송신 파일트랜스퍼의 포트번호를 성장하고 스레드 시작
				Thread t = new Thread(ft);
				t.join();
				t.start();
				panel_1.removeAll();
				panel_1.updateUI();
			}
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getTIp());
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uD30C\uC77C\uC120\uD0DD");// 파일선택
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fileChooser();
				}
			});
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC804\uC1A1");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					send();
				}
			});
		}
		return btnNewButton_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(480, 2));
			scrollPane.setViewportView(getPanel_1());
		}
		return scrollPane;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(480, 80));
		}
		return panel_1;
	}

	private JTextField getTIp() {
		if (tIp == null) {
			tIp = new JTextField();
			tIp.setColumns(10);
		}
		return tIp;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC11C\uBC84\uC5F0\uACB0");//서버연결                                                           
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
		}
		return btnNewButton_2;
	}
}

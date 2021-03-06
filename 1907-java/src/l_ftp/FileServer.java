package l_ftp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class FileServer extends JFrame implements Runnable {

	static int port = 6000;// 6000~50000까지
	ServerSocket server;

	List<FileTransferReceive> files = new ArrayList<FileTransferReceive>();
	boolean threadflag = true;

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileServer frame = new FileServer();
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
	public FileServer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 432);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.NORTH);
		contentPane.add(getScrollPane_1(), BorderLayout.CENTER);
	}

	@Override
	public void run() {
		threadflag = true;
		try {
			server = new ServerSocket(5555);
		} catch (IOException e) {

			e.printStackTrace();
		}

		while (threadflag) {
			try {
				Socket s = server.accept();
				ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
				Data data = (Data) ois.readObject();

				for (int i = 0; i < data.fileName.size(); i++) {
					FileServer.port++;
					if (FileServer.port > 50000)
						FileServer.port = 6000;
					FileTransferReceive st = new FileTransferReceive(FileServer.port, data.fileName.get(i),
							data.fileSize.get(i));

					files.add(st);
					panel.add(st);

					Data sendData = new Data();
					sendData.port = FileServer.port;
					//text.Area.append(FileServer.)
					oos.writeObject(sendData);
					
				}
				panel.updateUI();
				ois.close();
				oos.close();
				Thread.sleep(1000);
				panel.removeAll();
				panel.updateUI();
				
			} catch (Exception ex) {

			}

		}

	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}

	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uC11C\uBC84");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}

	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC11C\uBC84 \uC2DC\uC791");// 서버시작
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Thread t = new Thread(FileServer.this);
					t.start();

				}
			});
		}
		return mntmNewMenuItem;
	}

	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC11C\uBC84 \uC911\uC9C0");
		}
		return mntmNewMenuItem_1;
	}

	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC885\uB8CC");
		}
		return mntmNewMenuItem_2;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setPreferredSize(new Dimension(2, 150));
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getPanel());
		}
		return scrollPane_1;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(480, 80));
		}
		return panel;
	}

}

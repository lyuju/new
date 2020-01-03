package l_ftp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FileTransferReceive extends JPanel implements Runnable {
	long fileSize;
    
	int port;
	FileOutputStream fos;
	Socket socket;
	InputStream is;
	private JLabel fileName;
	private JProgressBar progressBar;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public FileTransferReceive() {
		setPreferredSize(new Dimension(470, 70));
		setLayout(null);
		add(getFileName());
		add(getProgressBar());
		add(getStatus());
		add(getBtnNewButton());

	}

	public FileTransferReceive(int port,String file,long fileSize) {
		this();
        this.port = port;
        this.fileSize=fileSize;
		
        getFileName().setText(file);
        getStatus().setText("0/"+fileSize);
        /*File f = new File(file);
		fileSize = f.length();
		long a = fileSize / 1000;
		getStatus().setText("0/" + a);*/
		try {
			System.out.println(port+"서버 OPEN");
			Thread t = new Thread(this);
			t.start();
		}catch(Exception ex) {
			
		}

	}
	

	@Override
	public void run() {
		// 지정된 파일을 FileInputStream으로 읽어서
		// Socket의 DataOutputStream으로 전송
		byte[] readData = new byte[4096]; // 4kb만 읽어서 전송
		int readSize = 0;
		long readTotSize = 0;
		getProgressBar().setValue(0);
		try {
			ServerSocket ss = new ServerSocket(port);
			socket=ss.accept();
			File dir = new File("c:/Temp");
			if(!dir.exists())dir.mkdir();//c드라이브에 temp라는 경로가 없다면 경로를 생성
			
			fos=new FileOutputStream("c:/Temp/"+getFileName().getText());
			is=socket.getInputStream();
			while ((readSize = is.read(readData)) != -1) {
				readTotSize += readSize;
				getStatus().setText(readTotSize + "/" + fileSize);
				getProgressBar().setValue((int) ((double) readTotSize / fileSize * 100));
				
				fos.write(readData,0,readSize);
			}
				
            fos.flush();
            
            fos.close();
            is.close();
		} catch (Exception ex) {

		}

	}
	
	public void delete() {
		fileSize=0;
		port=0;
		
		setVisible(false);
		
	}

	private JLabel getFileName() {
		if (fileName == null) {
			fileName = new JLabel("\uD30C\uC77C\uBA85 \uD45C\uC2DC");
			fileName.setBounds(12, 7, 77, 15);
		}
		return fileName;
	}

	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setBounds(12, 29, 376, 13);
		}
		return progressBar;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC804\uC1A1 \uC9C4\uD589 \uC0C1\uD0DC");
			status.setBounds(369, 44, 87, 15);
		}
		return status;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCDE8\uC18C");// 취소
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					delete();
				}
			});
			btnNewButton.setFont(new Font("굴림", Font.PLAIN, 8));
			btnNewButton.setBounds(401, 23, 57, 19);
		}
		return btnNewButton;
	}
}

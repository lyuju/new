package l_ftp;

import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FileTransfer extends JPanel implements Runnable {
	long fileSize;
	int port; // ���� ������ �ϱ����� port
	String ip;
	private JLabel fileName;
	private JProgressBar progressBar;
	private JLabel status;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public FileTransfer() {
		setPreferredSize(new Dimension(470, 70));
		setLayout(null);
		add(getFileName());
		add(getProgressBar());
		add(getStatus());
		add(getBtnNewButton());

	}

	public FileTransfer(String file) {

		this();
		getFileName().setText(file);
		File f = new File(file);
		fileSize = f.length();
		// long a = fileSize / 1000;
		getStatus().setText("0/" + fileSize);

	}

	@Override
	public void run() {
		// ������ ������ FileInputStream���� �о
		// Socket�� DataOutputStream���� ����
		byte[] readData = new byte[4096]; // 4kb�� �о ����
		int readSize = 0;
		long readTotSize = 0;
		getProgressBar().setValue(0);
		try {
			Socket socket = new Socket(ip, port);
			OutputStream os = socket.getOutputStream();
			FileInputStream fis = new FileInputStream(getFileName().getText());
			while ((readSize = fis.read(readData)) != -1) {
				readTotSize += readSize;
				getStatus().setText(readTotSize + "/" + fileSize);
				getProgressBar().setValue((int) ((double) readTotSize / fileSize * 100));
				os.write(readData, 0, readSize);

			}
			os.flush();
		} catch (Exception ex) {

		}
	}

	public void delete() {
		fileSize=0;
		port=0;
		ip=null;
		setVisible(false);
		
	}

	public JLabel getFileName() {
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

	public JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC804\uC1A1 \uC9C4\uD589 \uC0C1\uD0DC");
			status.setBounds(369, 44, 87, 15);
		}
		return status;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCDE8\uC18C");// ���
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					delete();
				}
			});
			btnNewButton.setFont(new Font("����", Font.PLAIN, 8));
			btnNewButton.setBounds(401, 23, 57, 19);
		}
		return btnNewButton;
	}
}

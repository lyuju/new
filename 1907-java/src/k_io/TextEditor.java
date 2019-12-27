package k_io;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TextEditor extends JInternalFrame {
	String fileName;
	private JLabel status;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	boolean modifyFlag = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextEditor frame = new TextEditor();
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
	public TextEditor() {
		super("noname", true, true, true, true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().add(getStatus(), BorderLayout.SOUTH);
		getContentPane().add(getScrollPane_1(), BorderLayout.CENTER);

	}

	public TextEditor(String fileName) {
		this();
		this.fileName = fileName;
		setTitle(fileName);
		load();

	}

	public void load() {
		try {
			FileReader fr = new FileReader(fileName);
			char[] data = new char[100];
			int readData = 0;// 읽은데이터의 크기
			textArea.setText("");
			while ((readData = fr.read(data)) != -1) {
				String temp = new String(data, 0, readData);
				textArea.append(temp);
			}
			fr.close();
		} catch (Exception ex) {

		}

	}

	public boolean save() {
		boolean b = true;
		if(!modifyFlag) return b;
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(textArea.getText());
			fw.flush();
			fw.close();
			setTitle(fileName);

		} catch (Exception ex) {
			b = false;
		}
		return b;
	}

	public JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setBackground(new Color(220, 20, 60));
			status.setOpaque(true);
			status.setPreferredSize(new Dimension(0, 24));
			status.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return status;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea_1());
		}
		return scrollPane;
	}

	private JTextArea getTextArea_1() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent ev) {
					
					if (ev.getKeyCode() != KeyEvent.VK_SHIFT && ev.getKeyCode() != KeyEvent.VK_ALT
							&& ev.getKeyCode() != KeyEvent.VK_CONTROL && ev.getKeyCode() != KeyEvent.VK_HOME
							&& ev.getKeyCode() != KeyEvent.VK_END && ev.getKeyCode() != KeyEvent.VK_PAGE_UP
							&& ev.getKeyCode() != KeyEvent.VK_PAGE_DOWN) {
						modifyFlag = true;
						if(fileName==null) {
							setTitle("noname(*)");
						}else {
						setTitle(fileName + "(*)");
						}
					}

				}
			});
		}
		return textArea;
	
}
}

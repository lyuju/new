package k_io;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

public class FileExam2 extends JFrame {
	
	
	static String idCheck="\\w{4,10}";
	static String pwdCheck="[\\w!$]{4,10}";
	static String nameCheck="[��-��]{2,20}";
	static String phoneCheck="\\d{2,3}-\\d{3,4}-\\d{4}";

	private JDesktopPane contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileExam2 frame = new FileExam2();
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
	public FileExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JDesktopPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 434, 21);
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
			menuBar.add(getMnNewMenu_2());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uD30C\uC77C\uBCF5\uC0AC");//���Ϻ���
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FileCopy a = new FileCopy();
					contentPane.add(a);
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("\uD30C\uC77C\uD3B8\uC9D1");
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getMntmNewMenuItem_1());
			mnNewMenu_1.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uBD88\uB7EC\uC624\uAE30");//�ҷ�����
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JFileChooser fc = new JFileChooser();
					int flag = fc.showOpenDialog(FileExam2.this);
					
					if(flag==JFileChooser.APPROVE_OPTION) {
						String fileName = fc.getSelectedFile().getPath();
					TextEditor panel = new TextEditor(fileName);
					contentPane.add(panel);
					panel.toFront();
					}
					
					
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC800\uC7A5\uD558\uAE30");//�����ϱ�
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					JInternalFrame frame = contentPane.getSelectedFrame();
					if(frame instanceof TextEditor) {
						TextEditor te = (TextEditor)frame;
						//���θ�����Ѱ�쿣 TextEditor�� fileName�� null
						if(te.fileName == null) {
							JFileChooser fc = new JFileChooser();
							int flag = fc.showSaveDialog(FileExam2.this);
							if(flag==JFileChooser.APPROVE_OPTION) {
								te.fileName = fc.getSelectedFile().getPath();
								te.setTitle(te.fileName);
							}else {
								te.getStatus().setText("���� ������ ����Ͽ����ϴ�.");
								return;
							}
							
						}
						
						
						
						
						
						boolean b =te.save();
						if(b) {
							te.getStatus().setText("������ ���������� �����");
						}else {
							te.getStatus().setText("������ �߻���");
						}
						
						
						
					}
					
					
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("\uC0C8\uB85C\uB9CC\uB4E4\uAE30");//���θ����
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TextEditor panel = new TextEditor();
					contentPane.add(panel);
					panel.toFront();
					
					
					
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JMenu getMnNewMenu_2() {
		if (mnNewMenu_2 == null) {
			mnNewMenu_2 = new JMenu("\uD68C\uC6D0\uAD00\uB9AC");
			mnNewMenu_2.add(getMntmNewMenuItem_4());
			mnNewMenu_2.add(getMntmNewMenuItem_5());
			mnNewMenu_2.add(getMntmNewMenuItem_6());
		}
		return mnNewMenu_2;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("\uD68C\uC6D0\uC785\uB825");//ȸ���Է�
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberInput a = new MemberInput();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("\uD68C\uC6D0\uC870\uD68C");//ȸ����ȸ
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberSearch a = new MemberSearch();
					contentPane.add(a);
					a.toFront();
					
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("\uC218\uC815/\uC0AD\uC81C");//����,����
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberModify a = new MemberModify();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_6;
	}
}

package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	
	public String lcId;//로그인값을 필드에 저장후 다른프레임에 전달하기위한 필드
	public Date logIn;//로그인값을 필드에 저장후 다른프레임에 전달하기위한 필드

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField cId;
	private JTextField cPwd;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JSeparator separator_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_7;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 332);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getCId());
		contentPane.add(getCPwd());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getSeparator_1());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getStatus());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Login");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 156, 50);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(244, 164, 96));
			separator.setBackground(new Color(244, 164, 96));
			separator.setBounds(22, 70, 360, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(22, 102, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_2.setBounds(22, 142, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setBounds(91, 99, 116, 21);
			cId.setColumns(10);
		}
		return cId;
	}
	private JTextField getCPwd() {
		if (cPwd == null) {
			cPwd = new JTextField();
			cPwd.setBounds(91, 139, 116, 21);
			cPwd.setColumns(10);
		}
		return cPwd;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					char user = 'u';//DB의 어드민 체크가 char타입이기때문에 
					char admin = 'a';
				
					UserDao dao = new UserDao();
					lcId = cId.getText();//텍스트필드에 얻은 값을 필드에저장
					String uPwd = cPwd.getText();
					char r = dao.login(lcId, uPwd);
					if(r==user) {//유저아이디면
					
					
						//로그인시간, 아이디 전달-------------------
						logIn = new Date();
						UserMain um = new UserMain(lcId,logIn);//로그인 값전달
						
					
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
						um.lIn.setText(sdf.format(logIn));//유저메인창의 로그인상태 셋팅
						um.cId.setText(lcId);//유저메인창의 로그인상태 셋팅
						setVisible(false);		
						//-----------------------------------
					}else if(r==admin){//관리자 아이디면
						AdminMain am = new AdminMain();
						setVisible(false);						
						
					}else {
						status.setText("정보를 확인해주세요");
					}
				}
			});
			btnNewButton.setBounds(246, 98, 97, 59);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Go");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserCreate uc = new UserCreate();
					dispose();
				}
			});
			btnNewButton_1.setBounds(333, 206, 49, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Go");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FindId fi = new FindId();
					setVisible(false);
				}
			});
			btnNewButton_2.setBounds(333, 253, 49, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC544\uC774\uB514\uAC00 \uC5C6\uC73C\uC2E0\uAC00\uC694?");
			lblNewLabel_3.setBounds(165, 210, 156, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC544\uC774\uB514\uB97C \uC783\uC5B4\uBC84\uB9AC\uC168\uB098\uC694?");
			lblNewLabel_4.setBounds(165, 257, 156, 15);
		}
		return lblNewLabel_4;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(244, 164, 96));
			separator_1.setBackground(new Color(244, 164, 96));
			separator_1.setBounds(22, 192, 360, 2);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setIcon(new ImageIcon(Login.class.getResource("/semiIcon/\uD68C\uC6D0\uAC00\uC7853.png")));
			lblNewLabel_6.setBounds(104, 243, 49, 49);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setIcon(new ImageIcon(Login.class.getResource("/semiIcon/\uD68C\uC6D0\uAC00\uC7853.png")));
			lblNewLabel_5.setBounds(104, 192, 49, 51);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Back");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FirstFrame ff = new FirstFrame();
					dispose();
				}
			});
			btnNewButton_3.setBounds(293, 29, 72, 23);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setIcon(new ImageIcon(Login.class.getResource("/semiIcon/home.PNG")));
			lblNewLabel_7.setBounds(210, 10, 72, 50);
		}
		return lblNewLabel_7;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(Color.ORANGE);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(22, 169, 360, 15);
		}
		return status;
	}
}

package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UserCreate extends JFrame {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	ButtonGroup group = new ButtonGroup();
	ButtonGroup group2 = new ButtonGroup();
	UserDao dao = new UserDao();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField cId;
	private JTextField cPwd;
	private JTextField cName;
	private JTextField cPhone;
	private JTextField cBirth;
	private JTextField cDate;
	private JRadioButton cMail;
	private JRadioButton cFemail;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_8;
	private JLabel status;
	private JSeparator separator_1;
	private JTextField cEmail;
	private JLabel label;
	private JRadioButton cUser;
	private JRadioButton cAdmin;
	private JLabel label_1;
	private JButton btnNewButton_2;
	private JLabel status2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCreate frame = new UserCreate();
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
	public UserCreate() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				Login l = new Login();
				l.setVisible(true);
			}
		});
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 295, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getCId());
		contentPane.add(getCPwd());
		contentPane.add(getCName());
		contentPane.add(getCPhone());
		contentPane.add(getCBirth());
		contentPane.add(getCDate());
		contentPane.add(getCEmail());
		contentPane.add(getCMail());
		contentPane.add(getCFemail());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getStatus());
		contentPane.add(getSeparator_1());
		contentPane.add(getLabel());
		contentPane.add(getCUser());
		contentPane.add(getCAdmin());
		contentPane.add(getLabel_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getStatus2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uAC00\uC785");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 165, 48);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 68, 247, 7);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(22, 116, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_2.setBounds(22, 159, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC774\uB984");
			lblNewLabel_3.setBounds(22, 184, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_4.setBounds(22, 209, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
			lblNewLabel_5.setBounds(22, 234, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC131\uBCC4");
			lblNewLabel_6.setBounds(22, 284, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uAC00\uC785\uC77C");
			lblNewLabel_7.setBounds(22, 309, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setBounds(91, 113, 92, 21);
			cId.setColumns(10);
		}
		return cId;
	}
	private JTextField getCPwd() {
		if (cPwd == null) {
			cPwd = new JTextField();
			cPwd.setEnabled(false);
			cPwd.setBounds(91, 156, 156, 21);
			cPwd.setColumns(10);
		}
		return cPwd;
	}
	private JTextField getCName() {
		if (cName == null) {
			cName = new JTextField();
			cName.setEnabled(false);
			cName.setBounds(91, 181, 156, 21);
			cName.setColumns(10);
		}
		return cName;
	}
	private JTextField getCPhone() {
		if (cPhone == null) {
			cPhone = new JTextField();
			cPhone.setEnabled(false);
			cPhone.setBounds(91, 206, 156, 21);
			cPhone.setColumns(10);
		}
		return cPhone;
	}
	private JTextField getCBirth() {
		if (cBirth == null) {
			cBirth = new JTextField();
			cBirth.setEnabled(false);
			cBirth.setBounds(91, 231, 156, 21);
			cBirth.setColumns(10);
		}
		return cBirth;
	}
	private JTextField getCDate() {
		if (cDate == null) {
			cDate = new JTextField();
			cDate.setHorizontalAlignment(SwingConstants.CENTER);
			cDate.setEnabled(false);
			cDate.setBounds(91, 306, 156, 21);
			cDate.setColumns(10);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date da = new Date();
			cDate.setText(sdf.format(da));
		}
		return cDate;
	}
	private JRadioButton getCMail() {
		if (cMail == null) {
			cMail = new JRadioButton("\uB0A8");
			cMail.setBackground(new Color(255, 255, 255));
			cMail.setBounds(101, 280, 42, 23);
			cMail.setSelected(true);
		}
		return cMail;
	}
	private JRadioButton getCFemail() {
		if (cFemail == null) {
			cFemail = new JRadioButton("\uC5EC");
			cFemail.setBackground(new Color(255, 255, 255));
			cFemail.setBounds(155, 280, 42, 23);
			group.add(cFemail);
		}
		return cFemail;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC00\uC785");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						String uId = cId.getText();//아이디
						String uPwd = cPwd.getText();//패스워드
						String uMail = cEmail.getText();//이메일
						Date uBirth = sdf.parse(cBirth.getText());//생년월일
						String uPhone = cPhone.getText();//전화번호
						String uGender ="";//성별체크
						Date uDate = sdf.parse(cDate.getText());//가입날짜
						String uAdmin = "";//관리자 체크
						String uName = cName.getText();//이름
						if(cUser.isSelected()) {
							uAdmin ="u";//유저이다
						}else if(cAdmin.isSelected()) {
							uAdmin = "a";//관리자이다
						}
						if(cMail.isSelected()) {
							uGender = "남";
						}else if(cFemail.isSelected()) {
							uGender = "여";
						}
						UserVo vo = new UserVo();//dao의 insert 매개변수를 던지기위한
						vo.setcId(uId);
						vo.setcPwd(uPwd);
						vo.setcEmail(uMail);
						vo.setcBirth(uBirth);
						vo.setcPhone(uPhone);
						vo.setcGender(uGender);
						vo.setcDate(uDate);
						vo.setIs_Admin(uAdmin);
						vo.setcName(uName);
						int r = dao.insert(vo);
						if(r>0) {
							status.setText("회원가입이 완료 되었습니다 로그인 해주세요");
						}else {
							status.setText("회원 가입중 오류 발생");
						}
					}catch(Exception ex) {
						System.out.println("오류");
					}
				}
			});
			btnNewButton.setBounds(91, 350, 63, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Login");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login log = new Login();
					dispose();
				}
			});
			btnNewButton_1.setBounds(173, 416, 74, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uB85C\uADF8\uC778 \uD558\uB7EC \uAC00\uAE30 >>");
			lblNewLabel_8.setBounds(55, 420, 116, 15);
		}
		return lblNewLabel_8;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(new Color(255, 127, 80));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 391, 235, 15);
		}
		return status;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 384, 247, 2);
		}
		return separator_1;
	}
	private JTextField getCEmail() {
		if (cEmail == null) {
			cEmail = new JTextField();
			cEmail.setEnabled(false);
			cEmail.setColumns(10);
			cEmail.setBounds(91, 257, 156, 21);
		}
		return cEmail;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC774\uBA54\uC77C");
			label.setBounds(22, 260, 57, 15);
		}
		return label;
	}
	private JRadioButton getCUser() {
		if (cUser == null) {
			cUser = new JRadioButton("\uD68C\uC6D0");
			cUser.setBackground(Color.WHITE);
			cUser.setBounds(93, 87, 53, 23);
			group2.add(cUser);
			cUser.setSelected(true);
		}
		return cUser;
	}
	private JRadioButton getCAdmin() {
		if (cAdmin == null) {
			cAdmin = new JRadioButton("\uAD00\uB9AC\uC790");
			cAdmin.setEnabled(false);
			cAdmin.setBackground(Color.WHITE);
			cAdmin.setBounds(144, 87, 61, 23);
			group2.add(cAdmin);
		}
		return cAdmin;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC720\uD615");
			label_1.setBounds(22, 91, 57, 15);
		}
		return label_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC870\uD68C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = cId.getText();//dao의 매개변수로 던져줄 입력값을위한 변수선언
					String a  = dao.idCheck(find);//dao에게 매개변수던져주고 a에 담음
					
					
					if(a == null) {//a가 db에 없다면 텍스트필드 모두 활성화
						status2.setText("아이디 사용가능");
						cPwd.setEnabled(true);
						cName.setEnabled(true);
						cPhone.setEnabled(true);
						cBirth.setEnabled(true);
						cEmail.setEnabled(true);
					}else if(a != null){//a가 db에 있다면 아이디필드 제외 모두 빌활성화
						status2.setText("아이디"+find+"가 중복되었습니다");
						cPwd.setEnabled(false);
						cName.setEnabled(false);
						cPhone.setEnabled(false);
						cBirth.setEnabled(false);
						cEmail.setEnabled(false);
					}
				}
			});
			btnNewButton_2.setBounds(184, 112, 63, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus2() {
		if (status2 == null) {
			status2 = new JLabel("");
			status2.setForeground(new Color(255, 140, 0));
			status2.setHorizontalAlignment(SwingConstants.CENTER);
			status2.setBounds(32, 137, 215, 15);
		}
		return status2;
	}
}

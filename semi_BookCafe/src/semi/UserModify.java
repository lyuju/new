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
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class UserModify extends JFrame {
	
	ButtonGroup group = new ButtonGroup();
	UserDao dao = new UserDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public String lcId;//전달받고 전달하기위한 필드
	public Date logIn;
	public UserVo vos;

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
	public JTextField cId;
	public JTextField cPwd;
	public JTextField cName;
	public JTextField cPhone;
	public JTextField cBirth;
	public JTextField cDate;
	public JRadioButton cMail;
	public JRadioButton cFemail;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel status;
	private JSeparator separator_1;
	private JLabel label;
	private JLabel label_1;
	private JButton btnMenu;
	public JTextField cEmail;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModify frame = new UserModify();
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
	public UserModify() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 367, 471);
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
		contentPane.add(getCMail());
		contentPane.add(getCFemail());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getStatus());
		contentPane.add(getSeparator_1());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getBtnMenu());
		contentPane.add(getCEmail());
		contentPane.add(getLabel_2());
	}
	
	public UserModify(UserVo vo ,String id,Date login) {//현재상태 받아오기
		this();
		this.lcId = id;
		this.logIn = login;
		this.vos = vo;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC815\uBCF4 \uC218\uC815");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 171, 48);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 75, 327, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(67, 97, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_2.setBounds(67, 122, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC774\uB984");
			lblNewLabel_3.setBounds(67, 147, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_4.setBounds(67, 172, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
			lblNewLabel_5.setBounds(67, 197, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC131\uBCC4");
			lblNewLabel_6.setBounds(67, 250, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uAC00\uC785\uC77C");
			lblNewLabel_7.setBounds(67, 275, 57, 15);
		}
		return lblNewLabel_7;
	}
	public JTextField getCId() {
		if (cId == null) {
			cId = new JTextField();
			cId.setEnabled(false);
			cId.setBounds(147, 94, 116, 21);
			cId.setColumns(10);
		}
		return cId;
	}
	public JTextField getCPwd() {
		if (cPwd == null) {
			cPwd = new JTextField();
			cPwd.setBounds(147, 119, 116, 21);
			cPwd.setColumns(10);
		}
		return cPwd;
	}
	public JTextField getCName() {
		if (cName == null) {
			cName = new JTextField();
			cName.setBounds(147, 144, 116, 21);
			cName.setColumns(10);
		}
		return cName;
	}
	public JTextField getCPhone() {
		if (cPhone == null) {
			cPhone = new JTextField();
			cPhone.setBounds(147, 169, 116, 21);
			cPhone.setColumns(10);
		}
		return cPhone;
	}
	public JTextField getCBirth() {
		if (cBirth == null) {
			cBirth = new JTextField();
			cBirth.setBounds(147, 194, 116, 21);
			cBirth.setColumns(10);
		}
		return cBirth;
	}
	public JTextField getCDate() {
		if (cDate == null) {
			cDate = new JTextField();
			cDate.setEnabled(false);
			cDate.setBounds(147, 272, 116, 21);
			cDate.setColumns(10);
		}
		return cDate;
	}
	public JRadioButton getCMail() {
		if (cMail == null) {
			cMail = new JRadioButton("\uB0A8");
			cMail.setBackground(new Color(255, 255, 255));
			cMail.setBounds(157, 246, 42, 23);
			group.add(cMail);
		}
		return cMail;
	}
	public JRadioButton getCFemail() {
		if (cFemail == null) {
			cFemail = new JRadioButton("\uC5EC");
			cFemail.setBackground(new Color(255, 255, 255));
			cFemail.setBounds(221, 246, 42, 23);
			group.add(cFemail);
		}
		return cFemail;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String uId = cId.getText();
						String uPwd = cPwd.getText();
						String uMail = cEmail.getText();
						Date uBirth = sdf.parse(cBirth.getText());
						String uPhone = cPhone.getText();
						String uGender ="";
						Date uDate = sdf.parse(cDate.getText());
						String uName = cName.getText();
					
						if(cMail.isSelected()) {
							uGender = "남";
						}else if(cFemail.isSelected()) {
							uGender = "여";
						}
						UserVo vo = new UserVo();
						vo.setcId(uId);
						vo.setcPwd(uPwd);
						vo.setcEmail(uMail);
						vo.setcBirth(uBirth);
						vo.setcPhone(uPhone);
						vo.setcGender(uGender);
						vo.setcDate(uDate);
						vo.setcName(uName);
						int r = dao.modify(vo);
						if(r>0) {
							status.setText("수정이 완료되었습니다");
						}else {
							status.setText("수정중 오류발생");
						}
						
					}catch(Exception ex) {
						
					}
				}
			});
			btnNewButton.setBounds(148, 315, 63, 33);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModifyCheck2 um = new UserModifyCheck2(vos,lcId,logIn);//뒤로갈때도 현재상태를 넘겨줘야함
					UserDao dao = new UserDao();
					vos = dao.checkAndsearch(lcId);
					dispose();
				}
			});
			btnNewButton_1.setBounds(267, 28, 63, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(new Color(255, 140, 0));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 370, 327, 15);
		}
		return status;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 358, 327, 2);
		}
		return separator_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(UserModify.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(183, 14, 72, 50);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uCD08\uAE30\uD654\uBA74 \uC73C\uB85C \uAC00\uAE30 >>");
			label_1.setBounds(123, 404, 138, 15);
		}
		return label_1;
	}
	private JButton getBtnMenu() {
		if (btnMenu == null) {
			btnMenu = new JButton("MENU");
			btnMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					UserMain um = new UserMain(lcId,logIn);
					um.cId.setText(lcId);
					SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					um.lIn.setText(sdf2.format(logIn));
				}
			});
			btnMenu.setBounds(265, 400, 74, 23);
		}
		return btnMenu;
	}
	public JTextField getCEmail() {
		if (cEmail == null) {
			cEmail = new JTextField();
			cEmail.setColumns(10);
			cEmail.setBounds(147, 220, 116, 21);
		}
		return cEmail;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC774\uBA54\uC77C");
			label_2.setBounds(67, 223, 57, 15);
		}
		return label_2;
	}
}

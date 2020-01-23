package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class UserMain extends JFrame {
	
	public String lcId;//다른 프레임으로 전달하기위한 필드
	 public Date logIn;
	 Date logOut;

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	public JLabel cId;
	public JLabel lIn;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JSeparator separator_1;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_9;
	private JLabel label;
	private JLabel label_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMain frame = new UserMain();
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
	public UserMain() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getCId());
		contentPane.add(getLIn());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getStatus());
	}
	
	public UserMain(String id , Date da) {//다른창이동후에 다시 돌아왔을때 상태창을 띄워주기위한 생성자 생성
		this();
		this.lcId = id;
		this.logIn = da;
		
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Main");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 106, 45);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 65, 410, 2);
		}
		return separator;
	}
	public JLabel getCId() {
		if (cId == null) {
			cId = new JLabel("\uD68C\uC6D0 \uC774\uB984");
			cId.setBounds(316, 10, 106, 15);
		}
		return cId;
	}
	public JLabel getLIn() {
		if (lIn == null) {
			lIn = new JLabel("\uC785\uC7A5 \uC2DC\uAC04");
			lIn.setBounds(316, 35, 106, 15);
		}
		return lIn;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC74C\uC2DD \uC8FC\uBB38");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(21, 227, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB3C4\uC11C \uAC80\uC0C9");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					GuestSearch bc = new GuestSearch();
					bc.setVisible(true);
				}
			});
			btnNewButton_1.setBounds(156, 227, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC815\uBCF4 \uC218\uC815");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModifyCheck um = new UserModifyCheck(lcId,logIn);//회원정보 수정창으로 상태값 전달
					um.toFront();
				}
			});
			btnNewButton_2.setBounds(289, 227, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setIcon(new ImageIcon(UserMain.class.getResource("/semiIcon/\uC74C\uC2DD3.png")));
			lblNewLabel_6.setBounds(21, 113, 113, 113);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setIcon(new ImageIcon(UserMain.class.getResource("/semiIcon/\uCC452.png")));
			lblNewLabel_7.setBounds(146, 120, 106, 98);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setIcon(new ImageIcon(UserMain.class.getResource("/semiIcon/\uC815\uBCF4 \uC218\uC8153.png")));
			lblNewLabel_8.setBounds(257, 95, 153, 122);
		}
		return lblNewLabel_8;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 273, 410, 2);
		}
		return separator_1;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Logout");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					logOut = new Date();//로그아웃시간 필드에저장
					
					LoginLogVo lvo = new LoginLogVo(lcId,logIn,logOut);//ldao에 던지기위한 lvo생성 / 필드에 저장된값을 던짐
					LoginLogDao ldao = new LoginLogDao();
					int r = ldao.insert(lvo);//로그인아이디,로그인시간,로그아웃시간,사용시간을 db에 저장
					
					if(r>0) {
						setVisible(false);
						
						UserPrice up = new UserPrice(lcId);//영수증 출력
						Login log = new Login();//아무것도 던져주지않고 새로운 로그인창띄움
						up.toFront();
						
						
					}else {
						status.setText("로그아웃중에 오류발생");
					}
				}
			});
			btnNewButton_3.setBounds(325, 293, 97, 23);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setIcon(new ImageIcon(UserMain.class.getResource("/semiIcon/\uB85C\uADF8\uC544\uC6C31.png")));
			lblNewLabel_9.setBounds(268, 285, 45, 39);
		}
		return lblNewLabel_9;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("ID         :");
			label.setBounds(253, 10, 57, 15);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uC2DC\uC791\uC2DC\uAC04:");
			label_1.setBounds(253, 35, 57, 15);
		}
		return label_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setForeground(new Color(255, 140, 0));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 297, 241, 15);
		}
		return status;
	}
}

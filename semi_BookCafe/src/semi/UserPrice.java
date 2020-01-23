package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UserPrice extends JFrame {
	
	LoginLogDao ldao;
	LoginLogVo ovo; 
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	public String lcId; //전달받기위한 필드

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel cUId;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton;
	private JLabel lblNewLabel_7;
	private JSeparator separator_1;
	private JLabel cLogin;
	private JLabel cLogout;
	private JLabel cTime;
	private JLabel ctot;
	private JLabel cPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPrice frame = new UserPrice();
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
	public UserPrice() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getCUId());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getSeparator_1());
		contentPane.add(getCLogin());
		contentPane.add(getCLogout());
		contentPane.add(getCTime());
		contentPane.add(getCtot());
		contentPane.add(getCPrice());
	}
	public UserPrice(String id) {//창떠지면 바로 입력될수있게 생성자에 실행문 작성
		this();
		this.lcId = id;
		
		this.ldao = new LoginLogDao();
		this.ovo = this.ldao.logOut(lcId);	
		this.cUId.setText(ovo.getcId()+"님");
		this.cLogin.setText(sdf.format(ovo.getlIn()));
		this.cLogout.setText(sdf.format(ovo.getlOut()));
		this.cTime.setText(String.valueOf(ovo.getlTime()));
		this.ctot.setText(String.valueOf(ovo.getTotTime()));
		
		LoginLogVo vo = this.ldao.price();
		int p = 0;
		System.out.println(ovo.getlTime());
		if(ovo.getlTime()<= 120){
			p = vo.getInitprice();
		}else if(ovo.getlTime()>120) {
			double i = Math.ceil((ovo.getlTime()-120)/(double)60);
			
				p =	(int)(vo.getInitprice()+(vo.getAddprice()*i));
			
		}
		
		this.cPrice.setText(String.valueOf(p));
		LoginLogDao dao = new LoginLogDao();
		dao.inputPrice(p,lcId,ovo.getlTime());
		
		
	
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACB0\uC81C \uAE08\uC561");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(22, 10, 172, 43);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 61, 265, 2);
		}
		return separator;
	}
	private JLabel getCUId() {
		if (cUId == null) {
			cUId = new JLabel("??");
			cUId.setHorizontalAlignment(SwingConstants.CENTER);
			cUId.setBounds(12, 73, 265, 15);
		}
		return cUId;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uB85C\uADF8\uC778 \uC2DC\uAC04");
			lblNewLabel_2.setBounds(12, 102, 71, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB85C\uADF8\uC544\uC6C3 \uC2DC\uAC04");
			lblNewLabel_3.setBounds(12, 137, 82, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uAE08\uC77C \uC774\uC6A9\uC2DC\uAC04");
			lblNewLabel_4.setBounds(12, 177, 82, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uCD1D \uC774\uC6A9\uC2DC\uAC04");
			lblNewLabel_5.setBounds(12, 219, 82, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uACB0\uC81C \uAE08\uC561");
			lblNewLabel_6.setBounds(12, 259, 82, 15);
		}
		return lblNewLabel_6;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uB2EB\uAE30");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnNewButton.setBounds(106, 285, 71, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uC774\uC6A9\uD574 \uC8FC\uC154\uC11C \uAC10\uC0AC\uD569\uB2C8\uB2E4.");
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setBounds(12, 330, 265, 23);
		}
		return lblNewLabel_7;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 318, 265, 2);
		}
		return separator_1;
	}
	private JLabel getCLogin() {
		if (cLogin == null) {
			cLogin = new JLabel("??");
			cLogin.setHorizontalAlignment(SwingConstants.CENTER);
			cLogin.setBounds(106, 102, 171, 15);
		}
		return cLogin;
	}
	private JLabel getCLogout() {
		if (cLogout == null) {
			cLogout = new JLabel("??");
			cLogout.setHorizontalAlignment(SwingConstants.CENTER);
			cLogout.setBounds(96, 137, 181, 15);
		}
		return cLogout;
	}
	private JLabel getCTime() {
		if (cTime == null) {
			cTime = new JLabel("??");
			cTime.setHorizontalAlignment(SwingConstants.CENTER);
			cTime.setBounds(96, 177, 181, 15);
		}
		return cTime;
	}
	private JLabel getCtot() {
		if (ctot == null) {
			ctot = new JLabel("??");
			ctot.setHorizontalAlignment(SwingConstants.CENTER);
			ctot.setBounds(96, 219, 181, 15);
		}
		return ctot;
	}
	private JLabel getCPrice() {
		if (cPrice == null) {
			cPrice = new JLabel("??");
			cPrice.setHorizontalAlignment(SwingConstants.CENTER);
			cPrice.setBounds(96, 259, 181, 15);
		}
		return cPrice;
	}
}

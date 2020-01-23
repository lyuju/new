package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DeleteFinish extends JFrame {

	public String lcId;//???��????�? ???��?�? ???��??기�???? ????
	public Date logIn;
	LoginLogDao ldao;
	LoginLogVo ovo;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel label;
	private JButton btnNewButton;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	public JLabel cPrice;
	public JLabel ctot;
	public JLabel cTime;
	public JLabel cLogout;
	public JLabel cLogin;
	public JLabel cUid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteFinish frame = new DeleteFinish();
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
	public DeleteFinish() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getCPrice());
		contentPane.add(getCtot());
		contentPane.add(getCTime());
		contentPane.add(getCLogout());
		contentPane.add(getCLogin());
		contentPane.add(getCUid());
	}
	
	public DeleteFinish(String id,Date logIn) {
		this();
		this.lcId = id;
		this.logIn = logIn;
		
		
		
		//�?그�???? ???��?? ????창�?? ?��?��????�??? �??��?�???----------------------------------------------
		
		this.ldao = new LoginLogDao();
		this.ovo = this.ldao.logOut(lcId);	//?????? �?그기�?
		this.cUid.setText(ovo.getcId()+"??");
		this.cLogin.setText(sdf.format(ovo.getlIn()));
		this.cLogout.setText(sdf.format(ovo.getlOut()));
		this.cTime.setText(String.valueOf(ovo.getlTime()));
		this.ctot.setText(String.valueOf(ovo.getTotTime()));
		
		LoginLogVo vo = this.ldao.price();
		int p = 0;
		System.out.println(ovo.getlTime());
		if(ovo.getlTime()<= 120){//�?�? ?��?
			p = vo.getInitprice();
		}else if(ovo.getlTime()>120) {
			double i = Math.ceil((ovo.getlTime()-120)/(double)60);
			
				p =	(int)(vo.getInitprice()+(vo.getAddprice()*i));
			
		}
		
		this.cPrice.setText(String.valueOf(p));
		LoginLogDao dao = new LoginLogDao();
		dao.inputPrice(p,lcId,ovo.getlTime());//�?격�?? db?? ????
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC0AD\uC81C\uAC00 \uC644\uB8CC\uB418\uC5C8\uC2B5\uB2C8\uB2E4.");
			lblNewLabel.setBounds(87, 10, 138, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(DeleteFinish.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(100, 221, 72, 50);
		}
		return label;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Home >>");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login log = new Login();//????�? ???? �?그�?�창 ?��??????
					setVisible(false);
				}
			});
			btnNewButton.setBounds(90, 281, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("로그인시간:");
			label_1.setBounds(24, 60, 80, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("로그아웃시간:");
			label_2.setBounds(24, 91, 109, 15);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("금일사용시간");
			label_3.setBounds(24, 122, 109, 15);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("총사용시간");
			label_4.setBounds(24, 154, 93, 15);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("사용요금 총액:");
			label_5.setBounds(24, 184, 93, 15);
		}
		return label_5;
	}
	private JLabel getCPrice() {
		if (cPrice == null) {
			cPrice = new JLabel("??");
			cPrice.setBounds(114, 184, 165, 15);
		}
		return cPrice;
	}
	private JLabel getCtot() {
		if (ctot == null) {
			ctot = new JLabel("??");
			ctot.setBounds(114, 154, 165, 15);
		}
		return ctot;
	}
	private JLabel getCTime() {
		if (cTime == null) {
			cTime = new JLabel("??");
			cTime.setBounds(114, 122, 165, 15);
		}
		return cTime;
	}
	private JLabel getCLogout() {
		if (cLogout == null) {
			cLogout = new JLabel("??");
			cLogout.setBounds(114, 91, 165, 15);
		}
		return cLogout;
	}
	private JLabel getCLogin() {
		if (cLogin == null) {
			cLogin = new JLabel("??");
			cLogin.setBounds(114, 60, 165, 15);
		}
		return cLogin;
	}
	private JLabel getCUid() {
		if (cUid == null) {
			cUid = new JLabel("??");
			cUid.setHorizontalAlignment(SwingConstants.CENTER);
			cUid.setBounds(67, 35, 158, 15);
		}
		return cUid;
	}
}

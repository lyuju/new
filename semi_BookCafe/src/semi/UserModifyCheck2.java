package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class UserModifyCheck2 extends JFrame {
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public UserVo vos;//占쏙옙占쏙옙占쏙옙占쏙옙占쌍곤옙 占쏙옙占쏙옙 占쌨깍옙占쏙옙占쏙옙 占십드에占쏙옙占쏙옙
	public String lcId;
	 public Date logIn;
	 Date logOut;//占쏙옙占쏙옙占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙 占십울옙占쏙옙 占싸그아울옙占시곤옙

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JButton button;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModifyCheck2 frame = new UserModifyCheck2();
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
	public UserModifyCheck2() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 359, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getButton());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getStatus());
	}
	
	public UserModifyCheck2(String id,Date login) {//占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙
		this();
		this.lcId = id;
		this.logIn = login;
	}
	public UserModifyCheck2(UserVo vos,String id,Date login) {
		this();
		this.vos = vos;
		this.lcId = id;
		this.logIn = login;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uC815\uBCF4 \uC218\uC815");
			label.setFont(new Font("타占쏙옙占쏙옙_占쌍뱄옙占쏙옙 B", Font.BOLD, 35));
			label.setBounds(12, 10, 164, 50);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setIcon(new ImageIcon(UserModifyCheck2.class.getResource("/semiIcon/home.PNG")));
			label_1.setBounds(188, 10, 72, 50);
		}
		return label_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModifyCheck um = new UserModifyCheck(vos,lcId,logIn);
					UserDao dao = new UserDao();
					vos = dao.checkAndsearch(lcId);
					dispose();
				}
			});
			button.setBounds(268, 29, 72, 23);
		}
		return button;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 70, 328, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(UserModifyCheck2.class.getResource("/semiIcon/\uC218\uC8152.PNG")));
			lblNewLabel.setBounds(45, 90, 95, 103);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UserModify um = new UserModify(vos,lcId,logIn); //占쏙옙占쏙옙창占쏙옙 占쏙옙占쏙옙鳴占쏙옙占�
					//占쏙옙占쏙옙창占쏙옙 占쌔쏙옙트占십드에 占쏙옙占쏙옙占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙占싱듸옙占쏙옙 vos占쏙옙 占쏙옙占쏙옙창占쏙옙 占쌔쏙옙트占십드에 占시뤄옙占쌕곤옙占쏙옙
					um.cId.setText(vos.getcId());//占쏙옙占싱듸옙
					um.cPwd.setText(vos.getcPwd());//占쏙옙橘占싫�
					um.cEmail.setText(vos.getcEmail());//占싱몌옙占쏙옙
					um.cBirth.setText(sdf.format(vos.getcBirth()));//占쏙옙占쏙옙占쏙옙占�
					um.cPhone.setText(vos.getcPhone());//占쏙옙화占쏙옙호
					um.cDate.setText(sdf.format(vos.getcDate()));//占쏙옙占쏙옙占쏙옙짜
					um.cName.setText(vos.getcName());//占싱몌옙
					char gen =vos.getcGender().charAt(0);//占쏙옙占쏙옙
					if(gen=='남') {
						um.cMail.setSelected(true);
					}else if(gen=='여') {
						um.cFemail.setSelected(true);
					}
					dispose();
				}
			});
			btnNewButton.setBounds(55, 204, 78, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(UserModifyCheck2.class.getResource("/semiIcon/\uC0AD\uC81C2.png")));
			lblNewLabel_1.setBounds(201, 90, 96, 103);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = vos.getcId();
					UserDao dao = new UserDao();
					int r = dao.delete(find);//member占쏙옙占싱븝옙 占쏙옙占쏙옙
					if(r>0) {
						
						//占쏙옙占쏙옙占쏙옙 占싸그아울옙 占쏙옙킴--------------------------------------
						logOut = new Date();//占쏙옙占쏙옙챨占� 占싸그아울옙占십드에 占쏙옙占�
						
						LoginLogVo lvo = new LoginLogVo(lcId,logIn,logOut);//log 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 lvo
						LoginLogDao ldao = new LoginLogDao();//log占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 ldao
						int lr = ldao.insert(lvo);//LoginLog占쏙옙占싱븝옙占쏙옙 占쌉뤄옙
						
						if(lr>0) {
							
							
							//占싸그아울옙 占쏙옙킨占쏙옙 占쏙옙占쏙옙창占쏙옙 占쏙옙占쏙옙耆챨占쏙옙占� 占싼뤄옙占쌕곤옙占쏙옙----------------------------------------------
//							LoginLogVo ovo = ldao.logOut(lcId);
							//占쏙옙占쏙옙창 占쏙옙占쏙옙鳴占쏙옙占�----------------------------------------------------------------------------
							
							setVisible(false);
							DeleteFinish df = new DeleteFinish(lcId,logIn);	//占쏙옙占쏙옙占싹뤄옙창占쏙옙 占신곤옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌍몌옙 占쏙옙占쏙옙
							
//							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//							df.cUid.setText(ovo.getcId());
//							df.cLogin.setText(sdf.format(ovo.getlIn()));
//							df.cLogout.setText(sdf.format(ovo.getlOut()));
//							df.cTime.setText(ovo.getlTime()+"");
							
							
						}else {
							status.setText("占싸그아울옙占쌩울옙 占쏙옙占쏙옙占쌩삼옙");
						}
					}else {
						status.setText("占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쌩삼옙");
					}
				}
			});
			btnNewButton_1.setBounds(222, 204, 72, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(new Color(255, 140, 0));
			status.setBounds(55, 253, 236, 15);
		}
		return status;
	}
}

package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class MemberInsert extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JComboBox tGrade;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInsert frame = new MemberInsert();
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
	public MemberInsert() {
		super("회원입력", true, true, true, true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTGrade());
		getContentPane().add(getBtnNewButton());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(83, 10, 242, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD559\uBC88");
			lblNewLabel_1.setBounds(24, 62, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(24, 97, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uD559\uC77C");
			lblNewLabel_3.setBounds(24, 144, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD559\uB144");
			lblNewLabel_4.setBounds(24, 184, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(67, 59, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(67, 94, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setText("2020-01-15");
			trDate.setBounds(67, 141, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JComboBox getTGrade() {
		if (tGrade == null) {
			tGrade = new JComboBox();
			tGrade.setModel(new DefaultComboBoxModel(new String[] {" 1 \uD559\uB144", " 2 \uD559\uB144", " 3 \uD559\uB144", " 4 \uD559\uB144", " 5 \uD559\uB144", " 6 \uD559\uB144", " 7 \uD559\uB144", " 8 \uD559\uB144", " 9 \uD559\uB144", " 10 \uD559\uB144"}));
			tGrade.setBounds(67, 181, 70, 21);
		}
		return tGrade;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uB825");//입력
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					MemberDao dao = new MemberDao();
					MemberVo vo = new MemberVo();
					try {
					vo.setmId(tmId.getText());
					vo.setmName(tmName.getText());
					vo.setrDate(sdf.parse(trDate.getText()));
					vo.setGrade(tGrade.getSelectedIndex()-1);
					
					
					
					int cnt = dao.insert(vo);
					if(cnt>0) System.out.println("입력 성공");
					else System.out.println("입력중 오류발생");
					
					
					}catch(Exception ex) {
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					/*String mId =textField.getText();
					String mname =textField_1.getText();
					String date = textField_2.getText();
					String grade= comboBox.getSelectedItem().toString();
					System.out.println(mId);
					System.out.println(grade);
					Connection conn= DBConn.getConn();
					try {
						String sql="insert into member(MID,MNAME,RDATE,GRADE)" +
					"values(?,?,?,?)";
				    PreparedStatement pstmt = conn.prepareStatement(sql);
				    pstmt.setString(1,mId);
				    pstmt.setString(2,mname);
				    pstmt.setString(3,date);
				    pstmt.setString(4,grade);
				    
				    conn.setAutoCommit(false);
					int cnt = pstmt.executeUpdate();
					if(cnt>0) {
						conn.commit();
						System.out.println("정상 입력");
					}else {
						conn.rollback();
						System.out.println("입력중 오류");
					}
					pstmt.close();
					conn.close();
						
					}catch(Exception ex){
						ex.printStackTrace();
					}*/
				}
			});
			btnNewButton.setBounds(110, 221, 97, 23);
		}
		return btnNewButton;
	}
}

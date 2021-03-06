package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class MemberDelete extends JInternalFrame {
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
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberDelete frame = new MemberDelete();
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
	public MemberDelete() {
		super("회원삭제", true, true, true, true);
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
		getContentPane().add(getBtnNewButton_1());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD \uC815\uBCF4 \uC0AD\uC81C");
			lblNewLabel.setBounds(117, 20, 208, 29);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(26, 73, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uC0DD\uBA85");
			lblNewLabel_2.setBounds(26, 115, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uD559\uC77C");
			lblNewLabel_3.setBounds(26, 152, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD559\uB144");
			lblNewLabel_4.setBounds(26, 180, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(93, 70, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(93, 112, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(93, 149, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JComboBox getTGrade() {
		if (tGrade == null) {
			tGrade = new JComboBox();
			tGrade.setModel(new DefaultComboBoxModel(new String[] {" 1 \uD559\uB144", " 2 \uD559\uB144", " 3 \uD559\uB144", " 4 \uD559\uB144", " 5 \uD559\uB144", " 6 \uD559\uB144", " 7 \uD559\uB144", " 8 \uD559\uB144", " 9 \uD559\uB144", " 10 \uD559\uB144"}));
			tGrade.setBounds(103, 177, 70, 21);
		}
		return tGrade;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC0AD\uC81C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String mId = tmId.getText();
					MemberDao dao = new MemberDao();
					int cnt = dao.delete(mId);
					
					if(cnt>0) System.out.println("삭제 성공");
					else System.out.println("삭제중 오류발생");
					
					tmName.setText("");
					trDate.setText("");
					tGrade.setSelectedIndex(0);
					tmId.requestFocus();
					tmId.selectAll();
					
				}
			});
			btnNewButton.setBounds(76, 223, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uAC80\uC0C9");//검색
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					MemberDao dao = new MemberDao();
					String mId = tmId.getText();
					
					MemberVo vo = dao.search(mId);
					tmId.setText(vo.getmId());
					tmName.setText(vo.getmName());
					trDate.setText(sdf.format(vo.getrDate()));
					tGrade.setSelectedIndex(vo.getGrade()-1);
					
				}
			});
			btnNewButton_1.setBounds(244, 69, 97, 23);
		}
		return btnNewButton_1;
	}
}

package m_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import oracle.sql.DATE;

public class MemberUpdate extends JInternalFrame {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JComboBox tgrade;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberUpdate frame = new MemberUpdate();
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
	public MemberUpdate() {
		super("회원검색", true, true, true, true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTgrade());
		getContentPane().add(getBtnNewButton_1());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uC0DD \uC815\uBCF4 \uC218\uC815");
			lblNewLabel.setBounds(119, 22, 126, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(24, 70, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uC0DD\uBA85");
			lblNewLabel_2.setBounds(24, 111, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uD559\uC77C");
			lblNewLabel_3.setBounds(24, 158, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD559\uB144");
			lblNewLabel_4.setBounds(24, 198, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");//수정
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberDao dao = new MemberDao();
					String mId = tmId.getText();
					//List<MemberVo> list = new ArrayList<MemberVo>();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String mName =tmName.getText();
					try {
						Date abDate = sdf.parse(trDate.getText());
						int grade = tgrade.getSelectedIndex();
						MemberVo vo = new MemberVo(mId, mName, abDate, grade+1);
						//list.add(vo);
						dao.update(vo);	
						
					} catch (ParseException e1) {
						
						e1.printStackTrace();
					}
				}
			});
			btnNewButton.setBounds(52, 238, 97, 23);
		}
		return btnNewButton;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(88, 67, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(88, 108, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(93, 155, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JComboBox getTgrade() {
		if (tgrade == null) {
			tgrade = new JComboBox();
			tgrade.setModel(new DefaultComboBoxModel(new String[] {" 1 \uD559\uB144", " 2 \uD559\uB144", " 3 \uD559\uB144", " 4 \uD559\uB144", " 5 \uD559\uB144", " 6 \uD559\uB144", " 7 \uD559\uB144", " 8 \uD559\uB144", " 9 \uD559\uB144", " 10 \uD559\uB144"}));
			tgrade.setBounds(93, 195, 97, 21);
		}
		return tgrade;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uAC80\uC0C9");//검색
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String mId = tmId.getText();
				    MemberDao dao = new MemberDao();
				    MemberVo vo = dao.search(mId);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					tmName.setText( vo.getmName());
					trDate.setText( sdf.format(vo.getrDate()) );
					tgrade.setSelectedIndex(vo.getGrade()-1);
					
					
					
				}
			});
			btnNewButton_1.setBounds(253, 66, 97, 23);
		}
		return btnNewButton_1;
	}
}

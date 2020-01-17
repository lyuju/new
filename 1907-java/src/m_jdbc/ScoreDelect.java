package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ScoreDelect extends JInternalFrame {
	Connection conn = DBConn.getConn();
	ScoreDao dao = new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JTextField tSco;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField tSubj;
	private JLabel lblNewLabel_6;
	private JTextField tSer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreDelect frame = new ScoreDelect();
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
	public ScoreDelect() {
		super("성적수정", true, true, true, true);
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent arg0) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTSco());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getTSubj());
		getContentPane().add(getLblNewLabel_6());
		getContentPane().add(getTSer());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC0AD\uC81C");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(120, 20, 117, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_1.setBounds(25, 69, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(25, 94, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC751\uC2DC\uC77C");
			lblNewLabel_3.setBounds(25, 135, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uACFC\uBAA9");
			lblNewLabel_4.setBounds(25, 160, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC810\uC218");
			lblNewLabel_5.setBounds(25, 185, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(92, 66, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(92, 91, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(92, 132, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
	private JTextField getTSco() {
		if (tSco == null) {
			tSco = new JTextField();
			tSco.setBounds(92, 182, 116, 21);
			tSco.setColumns(10);
		}
		return tSco;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC0AD\uC81C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int serial = Integer.parseInt(tSer.getText());
					int cnt = dao.delete(serial);
					
					if(cnt>0) System.out.println("자료 삭제");
					else System.out.println("자료 삭제중 오류 발생");
					
					
					
				}
			});
			btnNewButton.setBounds(92, 218, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC870\uD68C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int serial = Integer.parseInt(tSer.getText());
					ScoreVo vo = dao.search(serial);
					if (vo == null) {
						System.out.println("자료가없습니다");
					} else {
						tmId.setText(vo.getId());
						tmName.setText(vo.getmName());
						trDate.setText(sdf.format(vo.getRdate()));
						tSubj.setText(vo.getSub());
						tSco.setText(vo.getSco() + "");

					}
				}
			});
			btnNewButton_1.setBounds(251, 65, 97, 23);
		}
		return btnNewButton_1;
	}
	private JTextField getTSubj() {
		if (tSubj == null) {
			tSubj = new JTextField();
			tSubj.setBounds(92, 157, 116, 21);
			tSubj.setColumns(10);
		}
		return tSubj;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC2DC\uB9AC\uC5BC");
			lblNewLabel_6.setBounds(232, 20, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JTextField getTSer() {
		if (tSer == null) {
			tSer = new JTextField();
			tSer.setBounds(268, 31, 116, 21);
			tSer.setColumns(10);
		}
		return tSer;
	}
}

package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class Scroemodify extends JInternalFrame {
	Connection conn = DBConn.getConn();
	ScoreDao dao = new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private JLabel lblNewLabel;
	private JLabel a;
	private JLabel as;
	private JLabel add;
	private JLabel adds;
	private JLabel dee;
	private JTextField tmId;
	private JTextField tmName;
	private JTextField trDate;
	private JTextField tSubj;
	private JTextField tSco;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField tSEr;
	private JLabel ffe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scroemodify frame = new Scroemodify();
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
	public Scroemodify() {
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
		getContentPane().add(getA());
		getContentPane().add(getAs());
		getContentPane().add(getAdd());
		getContentPane().add(getAdds());
		getContentPane().add(getDee());
		getContentPane().add(getTmId());
		getContentPane().add(getTmName());
		getContentPane().add(getTrDate());
		getContentPane().add(getTSubj());
		getContentPane().add(getTSco());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getTSEr());
		getContentPane().add(getFfe());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC218\uC815");
			lblNewLabel.setBounds(30, 22, 57, 15);
		}
		return lblNewLabel;
	}

	private JLabel getA() {
		if (a == null) {
			a = new JLabel("\uC544\uC774\uB514");
			a.setBounds(30, 60, 57, 15);
		}
		return a;
	}

	private JLabel getAs() {
		if (as == null) {
			as = new JLabel("\uC131\uBA85");
			as.setBounds(30, 85, 57, 15);
		}
		return as;
	}

	private JLabel getAdd() {
		if (add == null) {
			add = new JLabel("\uC751\uC2DC\uC77C");
			add.setBounds(30, 129, 57, 15);
		}
		return add;
	}

	private JLabel getAdds() {
		if (adds == null) {
			adds = new JLabel("\uACFC\uBAA9");
			adds.setBounds(30, 154, 57, 15);
		}
		return adds;
	}

	private JLabel getDee() {
		if (dee == null) {
			dee = new JLabel("\uC810\uC218");
			dee.setBounds(30, 185, 57, 15);
		}
		return dee;
	}

	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setEnabled(false);
			tmId.setBounds(101, 57, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}

	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setEnabled(false);
			tmName.setBounds(99, 82, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}

	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(101, 126, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}

	private JTextField getTSubj() {
		if (tSubj == null) {
			tSubj = new JTextField();
			tSubj.setBounds(101, 151, 116, 21);
			tSubj.setColumns(10);
		}
		return tSubj;
	}

	private JTextField getTSco() {
		if (tSco == null) {
			tSco = new JTextField();
			tSco.setBounds(101, 182, 116, 21);
			tSco.setColumns(10);
		}
		return tSco;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//ScoreDao dao = new ScoreDao();
					int serial = Integer.parseInt(tSEr.getText());
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
			btnNewButton.setBounds(244, 60, 97, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					ScoreVo vo = new ScoreVo();
					vo.setSerial( Integer.parseInt(tSEr.getText()));
					vo.setRdate(sdf.parse(trDate.getText()));
					vo.setSub(tSubj.getText());
					vo.setSco(Integer.parseInt(tSco.getText()));
					int cnt = dao.update(vo);
					if(cnt>0) System.out.println("정상 수정");
					else System.out.println("수정중 오류 발생");
					}catch(Exception ex) {
						
					}
				}
			});
			btnNewButton_1.setBounds(101, 213, 97, 23);
		}
		return btnNewButton_1;
	}

	private JTextField getTSEr() {
		if (tSEr == null) {
			tSEr = new JTextField();
			tSEr.setBounds(244, 19, 116, 21);
			tSEr.setColumns(10);
		}
		return tSEr;
	}

	private JLabel getFfe() {
		if (ffe == null) {
			ffe = new JLabel("\uC2DC\uB9AC\uC5BC");
			ffe.setBounds(160, 22, 57, 15);
		}
		return ffe;
	}
}

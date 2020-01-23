package semi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class BookDelete extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton button;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tmName;
	private JTextField tauthor;
	private JTextField tcompany;
	private JTextField tea;
	private JTextField tprice;
	private JButton btnNewButton;
	private JSeparator separator_1;
	private JLabel status;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDelete frame = new BookDelete();
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
	public BookDelete() {

		setVisible(true);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 370, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getButton());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTmName());
		contentPane.add(getTauthor());
		contentPane.add(getTcompany());
		contentPane.add(getTea());
		contentPane.add(getTprice());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSeparator_1());
		contentPane.add(getStatus());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_6());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB3C4\uC11C \uC0AD\uC81C");
			lblNewLabel.setFont(new Font("타占쏙옙占쏙옙_占쌍뱄옙占쏙옙 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 170, 48);
		}
		return lblNewLabel;
	}

	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back"); // 占쏙옙占쏙옙화占쏙옙
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
					
				}
			});
			button.setBounds(270, 29, 72, 23);
		}
		
		
		return button;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 69, 330, 2);
		}
		return separator;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uB3C4\uC11C \uBA85");
			lblNewLabel_1.setBounds(63, 81, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC800\uC790");
			lblNewLabel_2.setBounds(63, 106, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD9C\uD310\uC0AC");
			lblNewLabel_3.setBounds(63, 131, 57, 15);
		}
		return lblNewLabel_3;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uBCF4\uC720 \uAC1C\uC218");
			lblNewLabel_4.setBounds(63, 156, 57, 15);
		}
		return lblNewLabel_4;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uAD6C\uC785\uAC00\uACA9");
			lblNewLabel_5.setBounds(63, 181, 57, 15);
		}
		return lblNewLabel_5;
	}

	private JTextField getTmName() {
		if (tmName == null) {
			tmName = new JTextField();
			tmName.setBounds(132, 78, 116, 21);
			tmName.setColumns(10);
		}
		return tmName;
	}

	private JTextField getTauthor() {
		if (tauthor == null) {
			tauthor = new JTextField();
			tauthor.setBounds(132, 103, 116, 21);
			tauthor.setColumns(10);
		}
		return tauthor;
	}

	private JTextField getTcompany() {
		if (tcompany == null) {
			tcompany = new JTextField();
			tcompany.setBounds(132, 128, 116, 21);
			tcompany.setColumns(10);
		}
		return tcompany;
	}

	private JTextField getTea() {
		if (tea == null) {
			tea = new JTextField();
			tea.setBounds(132, 153, 116, 21);
			tea.setColumns(10);
		}
		return tea;
	}

	private JTextField getTprice() {
		if (tprice == null) {
			tprice = new JTextField();
			tprice.setBounds(132, 178, 116, 21);
			tprice.setColumns(10);
		}
		return tprice;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC0AD\uC81C");// 占쏙옙占쏙옙占싹기를 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String mName = tmName.getText();
					BookDao dao = new BookDao();
					int cnt = dao.delete(mName);

					if (cnt > 0) {
						status.setText("占쌘료가 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙");
						JOptionPane.showMessageDialog(BookDelete.this, "占쏙옙占쏙옙 占쏙옙臼占쏙옙占� 占쏙옙占쏙옙占실억옙占쏙옙占싹댐옙.");
					} else
						status.setText("占쏙옙占쏙옙占쏙옙 占쌩삼옙占싹울옙占쏙옙占싹댐옙.");

					tmName.setText("");
					tauthor.setText("");
					tcompany.setText("");
					tea.setText("");
					tprice.setText("");
					tmName.requestFocus();
					tmName.selectAll();

				}
			});
			btnNewButton.setBounds(106, 212, 97, 23);
		}
		return btnNewButton;
	}

	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 245, 330, 2);
		}
		return separator_1;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC0AD\uC81C\uD560 \uB3C4\uC11C \uBA85\uC744 \uAC80\uC0C9\uD558\uC138\uC694");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 257, 330, 28);
		}
		return status;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uAC80\uC0C9");// 占싯삼옙占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					BookDao dao = new BookDao();
					String mName = tmName.getText();
					BookVo vo = dao.search(mName);

					if (vo == null) {
						status.setText("占쌘료가 占쏙옙占쏙옙占싹댐옙");
					} else {
						tmName.setText(vo.getmName());

						tauthor.setText(vo.getAuthor());
						tcompany.setText(vo.getCompany());
						tea.setText(Integer.toString(vo.getEa()));
						tprice.setText(Integer.toString(vo.getPrice()));
						status.setText("占쌘료를 占쏙옙占쏙옙占싹쇽옙占쏙옙");
					}

				}
			});
			btnNewButton_1.setBounds(270, 77, 72, 23);
		}
		return btnNewButton_1;
	}
	public JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setIcon(new ImageIcon(BookDelete.class.getResource("/semiIcon/home.PNG")));
			lblNewLabel_6.setBounds(194, 10, 63, 48);
		}
		return lblNewLabel_6;
	}
}

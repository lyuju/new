package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMain extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain frame = new AdminMain();
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
	public AdminMain() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 521);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getLabel());
		contentPane.add(getButton());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Manager Main");
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 348, 76);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 84, 626, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uC74C\uC2DD \uC8FC\uBB381.png")));
			lblNewLabel_1.setBounds(42, 288, 147, 123);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uD68C\uC6D0\uAD00\uB9AC1.png")));
			lblNewLabel_2.setBounds(47, 108, 124, 123);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCC45 \uAD00\uB9AC");
			lblNewLabel_3.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uCC45 \uC7AC\uACE0\uAD00\uB9AC3.png")));
			lblNewLabel_3.setBounds(250, 108, 124, 123);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uC74C\uC2DD \uC790\uC7AC\uAD00\uB9AC1.png")));
			lblNewLabel_4.setBounds(250, 288, 129, 123);
		}
		return lblNewLabel_4;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ManagerFrame mm = new ManagerFrame();
					mm.refresh();
				}
			});
			btnNewButton.setBounds(58, 241, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB3C4\uC11C\uAD00\uB9AC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					BookControl bc = new BookControl();
					bc.setVisible(true);
					
				}
			});
			btnNewButton_1.setBounds(263, 241, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC74C\uC2DD \uC8FC\uBB38 \uB0B4\uC5ED \uAD00\uB9AC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnNewButton_2.setBounds(42, 429, 147, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC74C\uC2DD \uC790\uC7AC \uAD00\uB9AC");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FoodSelect fs = new FoodSelect();
					fs.setVisible(true);
				}
			});
			btnNewButton_3.setBounds(250, 429, 127, 23);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC774\uC6A9\uC694\uAE08 \uAD00\uB9AC");
			lblNewLabel_5.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uC774\uC6A9\uC694\uAE081.png")));
			lblNewLabel_5.setBounds(449, 109, 147, 122);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uB9E4\uCD9C \uD604\uD669");
			lblNewLabel_6.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uB9E4\uCD9C\uAD00\uB9AC1.png")));
			lblNewLabel_6.setBounds(472, 274, 124, 138);
		}
		return lblNewLabel_6;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("\uB9E4\uCD9C \uAD00\uB9AC");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SalesManagment sm = new SalesManagment();
					sm.setVisible(true);
				}
			});
			btnNewButton_4.setBounds(472, 429, 97, 23);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("\uC774\uC6A9 \uC694\uAE08 \uAD00\uB9AC");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ChargeModify cm = new ChargeModify();
					cm.setVisible(true);
				}
			});
			btnNewButton_5.setBounds(459, 241, 124, 23);
		}
		return btnNewButton_5;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(AdminMain.class.getResource("/semiIcon/\uB85C\uADF8\uC544\uC6C31.png")));
			label.setBounds(574, 35, 45, 39);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Logout");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login lo = new Login();
					dispose();
				}
			});
			button.setBounds(472, 42, 97, 23);
		}
		return button;
	}
}

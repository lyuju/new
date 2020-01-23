package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ChargeModify extends JFrame {
	
	DecimalFormat df = new DecimalFormat("##,###,###");
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel label;
	private JButton btnBack;
	private JTextField txtAddModify;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField txtInitModify;
	private JLabel label_6;
	private JButton btnPriceModify;
	private JSeparator separator_2;
	private JLabel label_1;
	private JTextField txtInitPrice;
	private JSeparator separator_1;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField txtAddPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChargeModify frame = new ChargeModify();
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
	public ChargeModify() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 526, 239);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getPanel());
		contentPane.add(getPanel_1());
		contentPane.add(getLabel());
		contentPane.add(getBtnBack());
		
		SalesDao dao = new SalesDao();
		int[] result = dao.chargeSearch();

		txtInitPrice.setText(df.format(result[0]) + "");
		txtAddPrice.setText(df.format(result[1]) + "");
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC774\uC6A9 \uC694\uAE08 \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타占쏙옙占쏙옙_占쌍뱄옙占쏙옙 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 248, 50);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 70, 486, 2);
		}
		return separator;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(12, 83, 236, 106);
			panel.setLayout(null);
			panel.add(getLabel_1_1());
			panel.add(getTxtInitPrice());
			panel.add(getSeparator_1_1());
			panel.add(getLabel_2());
			panel.add(getLabel_3_1());
			panel.add(getTxtAddPrice());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(262, 83, 236, 106);
			panel_1.setLayout(null);
			panel_1.add(getTxtAddModify());
			panel_1.add(getLabel_4());
			panel_1.add(getLabel_5());
			panel_1.add(getTxtInitModify());
			panel_1.add(getLabel_6());
			panel_1.add(getBtnPriceModify());
			panel_1.add(getSeparator_2());
		}
		return panel_1;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(ChargeModify.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(323, 16, 72, 50);
		}
		return label;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnBack.setBounds(407, 30, 72, 23);
		}
		return btnBack;
	}
	private JTextField getTxtAddModify() {
		if (txtAddModify == null) {
			txtAddModify = new JTextField();
			txtAddModify.setColumns(10);
			txtAddModify.setBounds(94, 76, 116, 21);
		}
		return txtAddModify;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uCD94\uAC00 \uC694\uAE08");
			label_4.setBounds(25, 79, 57, 15);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uAE30\uBCF8 \uC694\uAE08");
			label_5.setBounds(25, 53, 57, 15);
		}
		return label_5;
	}
	private JTextField getTxtInitModify() {
		if (txtInitModify == null) {
			txtInitModify = new JTextField();
			txtInitModify.setColumns(10);
			txtInitModify.setBounds(94, 50, 116, 21);
		}
		return txtInitModify;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC218\uC815 \uC694\uAE08");
			label_6.setFont(new Font("Dialog", Font.BOLD, 15));
			label_6.setBounds(12, 10, 70, 21);
		}
		return label_6;
	}
	private JButton getBtnPriceModify() {
		if (btnPriceModify == null) {
			btnPriceModify = new JButton("\uAC00\uACA9 \uC218\uC815\uD558\uAE30");
			btnPriceModify.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (txtInitModify.equals("")) {
						JOptionPane.showInternalMessageDialog(null, "������ 媛�寃⑹�� ���ν�댁＜�몄��.");
					}

					try {
						int ipm = Integer.parseInt(txtInitModify.getText());
						int apm;
						
						if(txtAddModify.getText().equals("")) {
							apm = 0;
						}
						else {
							apm = Integer.parseInt(txtAddModify.getText());							
						}
						
						SalesDao dao = new SalesDao();
						int result = dao.chargeUpdate(ipm, apm);
						if (result > 0) {
							JOptionPane.showMessageDialog(null, "�댁�⑹��湲��� ���������듬����.");
							txtInitModify.setText("");
							txtAddModify.setText("");

							txtInitPrice.setText(df.format(ipm) + "");
							txtAddPrice.setText(df.format(apm) + "");
						} else {
							JOptionPane.showMessageDialog(null, "���� 以� �ㅻ� 諛���");
						}
					} catch (NumberFormatException nfex) {
						JOptionPane.showMessageDialog(null, "������ 媛�寃⑹�� 臾몄�� ���� 怨듬갚�� 議댁�ы�⑸����.");
					}
					
				}
			});
			btnPriceModify.setBounds(94, 11, 116, 23);
		}
		return btnPriceModify;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(new Color(255, 140, 0));
			separator_2.setBackground(new Color(255, 140, 0));
			separator_2.setBounds(12, 38, 214, 2);
		}
		return separator_2;
	}
	private JLabel getLabel_1_1() {
		if (label_1 == null) {
			label_1 = new JLabel("\uD604\uC7AC \uC694\uAE08");
			label_1.setFont(new Font("Dialog", Font.BOLD, 15));
			label_1.setBounds(12, 10, 70, 21);
		}
		return label_1;
	}
	private JTextField getTxtInitPrice() {
		if (txtInitPrice == null) {
			txtInitPrice = new JTextField();
			txtInitPrice.setEnabled(false);
			txtInitPrice.setColumns(10);
			txtInitPrice.setBounds(94, 50, 116, 21);
		}
		return txtInitPrice;
	}
	private JSeparator getSeparator_1_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 38, 214, 2);
		}
		return separator_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uAE30\uBCF8 \uC694\uAE08");
			label_2.setBounds(25, 53, 57, 15);
		}
		return label_2;
	}
	private JLabel getLabel_3_1() {
		if (label_3 == null) {
			label_3 = new JLabel("\uCD94\uAC00 \uC694\uAE08");
			label_3.setBounds(25, 79, 57, 15);
		}
		return label_3;
	}
	private JTextField getTxtAddPrice() {
		if (txtAddPrice == null) {
			txtAddPrice = new JTextField();
			txtAddPrice.setEnabled(false);
			txtAddPrice.setColumns(10);
			txtAddPrice.setBounds(94, 76, 116, 21);
		}
		return txtAddPrice;
	}
}

package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class FoodInsert extends JFrame {
	
	ButtonGroup group = new ButtonGroup();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel status;
	private JLabel lblNewLabel_2;
	private JTextField tfName;
	private JLabel lblNewLabel_3;
	private JTextField tInPrice;
	private JLabel lblNewLabel_4;
	private JTextField tSalPrice;
	private JLabel lblNewLabel_5;
	private JTextField tEa;
	private JButton btnAdd;
	private JButton btnBack;
	private JLabel label;
	private JRadioButton rSales;
	private JRadioButton rNoSales;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodInsert frame = new FoodInsert();
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
	public FoodInsert() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 361, 343);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getStatus());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfName());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTInPrice());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getTSalPrice());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTEa());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnBack());
		contentPane.add(getLabel());
		contentPane.add(getRSales());
		contentPane.add(getRNoSales());
		contentPane.add(getSeparator());
		contentPane.add(getSeparator_1());
		contentPane.add(getLabel_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC74C\uC2DD \uCD94\uAC00");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 167, 40);
		}
		return lblNewLabel;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC815\uBCF4\uB97C \uC785\uB825\uD558\uC138\uC694");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(255, 255, 255));
			status.setOpaque(true);
			status.setBounds(12, 267, 300, 29);
		}
		return status;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC74C\uC2DD \uC774\uB984");
			lblNewLabel_2.setBounds(49, 70, 57, 21);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(161, 70, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uACE0 \uAC00\uACA9");
			lblNewLabel_3.setBounds(49, 101, 57, 21);
		}
		return lblNewLabel_3;
	}
	private JTextField getTInPrice() {
		if (tInPrice == null) {
			tInPrice = new JTextField();
			tInPrice.setBounds(161, 101, 116, 21);
			tInPrice.setColumns(10);
		}
		return tInPrice;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD310\uB9E4 \uAC00\uACA9");
			lblNewLabel_4.setBounds(49, 132, 57, 21);
		}
		return lblNewLabel_4;
	}
	private JTextField getTSalPrice() {
		if (tSalPrice == null) {
			tSalPrice = new JTextField();
			tSalPrice.setBounds(161, 132, 116, 21);
			tSalPrice.setColumns(10);
		}
		return tSalPrice;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC218\uB7C9");
			lblNewLabel_5.setBounds(49, 163, 57, 21);
		}
		return lblNewLabel_5;
	}
	private JTextField getTEa() {
		if (tEa == null) {
			tEa = new JTextField();
			tEa.setBounds(161, 163, 116, 21);
			tEa.setColumns(10);
		}
		return tEa;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("\uCD94\uAC00");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						FoodDao dao = new FoodDao();
						FoodVo vo = new FoodVo();
						String s = ""; // 판매/ 미판매 버튼 선택
						if(rSales.isSelected()) {
							s = "Y";
						} else if(rNoSales.isSelected()) {
							s = "N";
						}
						vo.setfName(tfName.getText());
						vo.setInPrice(Integer.parseInt(tInPrice.getText()));
						vo.setSalPrice(Integer.parseInt(tSalPrice.getText()));
						vo.setfEa(Integer.parseInt(tEa.getText()));
						vo.setSales(s);
						
						int cnt = dao.Insert(vo);
						if(cnt>0) {
							status.setText("음식이 정상적으로 추가되었습니다.");
						} else {
							status.setText("정보 입력 중 오류 발생");
						}
						tfName.requestFocus();
						tfName.selectAll();
						tInPrice.setText("");
						tSalPrice.setText("");
						tEa.setText("");
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			btnAdd.setBounds(108, 221, 97, 23);
		}
		return btnAdd;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FoodSelect panel = new FoodSelect();
					panel.toFront();
					setVisible(false);
				}
			});
			btnBack.setBounds(256, 25, 77, 23);
		}
		return btnBack;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("\uD310\uB9E4 \uC720\uBB34");
			label.setBounds(49, 194, 57, 15);
		}
		return label;
	}
	private JRadioButton getRSales() {
		if (rSales == null) {
			rSales = new JRadioButton("\uD310\uB9E4");
			rSales.setBackground(new Color(255, 255, 255));
			rSales.setBounds(148, 192, 57, 23);
			rSales.setSelected(true);
			group.add(rSales);
		}
		return rSales;
	}
	private JRadioButton getRNoSales() {
		if (rNoSales == null) {
			rNoSales = new JRadioButton("\uBBF8\uD310\uB9E4");
			rNoSales.setBackground(new Color(255, 255, 255));
			rNoSales.setBounds(209, 190, 68, 23);
			group.add(rNoSales);
		}
		return rNoSales;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 57, 321, 2);
		}
		return separator;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 254, 321, 2);
		}
		return separator_1;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("New label");
			label_1.setIcon(new ImageIcon("C:\\Users\\JHTA\\Dropbox\\semi\\home.PNG"));
			label_1.setBounds(184, 0, 72, 50);
		}
		return label_1;
	}
}

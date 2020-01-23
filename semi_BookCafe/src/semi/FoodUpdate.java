package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class FoodUpdate extends JFrame {
	
	ButtonGroup group = new ButtonGroup();

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel status;
	private JLabel lblNewLabel_2;
	private JTextField tfNo;
	private JButton btnSearch;
	private JSeparator separator;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tfName;
	private JTextField tInPrice;
	private JTextField tSalPrice;
	private JButton btnUp;
	private JButton btnDelete;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JRadioButton rSales;
	private JRadioButton rNoSales;
	private JTextField tEa;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JLabel label;
	private JButton button;
	private JSeparator separator_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodUpdate frame = new FoodUpdate();
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
	public FoodUpdate() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 459, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getStatus());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTfNo());
		contentPane.add(getBtnSearch());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getTfName());
		contentPane.add(getTInPrice());
		contentPane.add(getTSalPrice());
		contentPane.add(getBtnUp());
		contentPane.add(getBtnDelete());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getRSales());
		contentPane.add(getRNoSales());
		contentPane.add(getTEa());
		contentPane.add(getSeparator_1());
		contentPane.add(getSeparator_2());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		contentPane.add(getSeparator_3());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC74C\uC2DD \uC218\uC815/\uC0AD\uC81C");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("타이포_쌍문동 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 263, 50);
		}
		return lblNewLabel;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC74C\uC2DD \uBC88\uD638\uB97C \uAC80\uC0C9\uD558\uC138\uC694");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(255, 255, 255));
			status.setOpaque(true);
			status.setBounds(12, 333, 419, 23);
		}
		return status;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC74C\uC2DD \uC774\uB984");
			lblNewLabel_2.setBounds(81, 134, 57, 21);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfNo() {
		if (tfNo == null) {
			tfNo = new JTextField();
			tfNo.setBounds(105, 91, 194, 21);
			tfNo.setColumns(10);
		}
		return tfNo;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("\uAC80\uC0C9");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FoodDao dao = new FoodDao();
					int fNo = Integer.parseInt(tfNo.getText());
					FoodVo vo = dao.Search(fNo);
					
					tfName.setText("");
					tInPrice.setText("");
					tSalPrice.setText("");
					tEa.setText("");
					
					if(vo == null) {
						status.setText("자료가 없습니다.");
					}else {
						tfName.setText(vo.getfName());
						tInPrice.setText(vo.getInPrice() + "");
						tSalPrice.setText(vo.getSalPrice() + "");
						tEa.setText(vo.getfEa() + "");
						status.setText("정보를 수정하세요~");
					}
				}
			});
			btnSearch.setBounds(311, 90, 97, 23);
		}
		return btnSearch;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 122, 418, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uACE0 \uAC00\uACA9");
			lblNewLabel_3.setBounds(81, 165, 57, 21);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uD310\uB9E4 \uAC00\uACA9");
			lblNewLabel_4.setBounds(81, 196, 57, 21);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC218\uB7C9");
			lblNewLabel_5.setBounds(81, 227, 57, 21);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(176, 134, 194, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JTextField getTInPrice() {
		if (tInPrice == null) {
			tInPrice = new JTextField();
			tInPrice.setBounds(176, 165, 194, 21);
			tInPrice.setColumns(10);
		}
		return tInPrice;
	}
	private JTextField getTSalPrice() {
		if (tSalPrice == null) {
			tSalPrice = new JTextField();
			tSalPrice.setBounds(176, 196, 194, 21);
			tSalPrice.setColumns(10);
		}
		return tSalPrice;
	}
	private JButton getBtnUp() {
		if (btnUp == null) {
			btnUp = new JButton("\uC218\uC815");
			btnUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FoodDao dao = new FoodDao();
					FoodVo vo = new FoodVo();
					String s = ""; // 판매/미판매 버튼 선택
					if(rSales.isSelected()) {
						s = "Y";
					} else if(rNoSales.isSelected()) {
						s = "N";
					}
					try {
						vo.setfNo(Integer.parseInt(tfNo.getText()));
						vo.setfName(tfName.getText());
						vo.setInPrice(Integer.parseInt(tInPrice.getText()));
						vo.setSalPrice(Integer.parseInt(tSalPrice.getText()));
						vo.setfEa(Integer.parseInt(tEa.getText()));
						vo.setSales(s);
						
						int cnt = dao.Update(vo);
						if(cnt>0) {
							status.setText("정상적으로 수정됨");
						} else {
							status.setText("수정 중 오류가 발생되었습니다.");
						}
						tfName.setText("");
						tInPrice.setText("");
						tSalPrice.setText("");
						tEa.setText("");
						
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			btnUp.setBounds(142, 283, 75, 23);
		}
		return btnUp;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("\uC0AD\uC81C");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FoodDao dao = new FoodDao();
					int fNo = Integer.parseInt(tfNo.getText());
					int cnt = dao.Delete(fNo); // 음식번호로 검색하여 데이터 삭제
					
					if(cnt>0) {
						status.setText("정보가 삭제되었습니다.");
					}else {
						status.setText("삭제중 오류가 발생되었습니다.");
					}
					tfName.setText("");
					tInPrice.setText("");
					tSalPrice.setText("");
					tEa.setText("");
				}
			});
			btnDelete.setBounds(241, 283, 75, 23);
		}
		return btnDelete;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uD310\uB9E4 \uC720\uBB34");
			lblNewLabel_6.setBounds(81, 258, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uC74C\uC2DD \uBC88\uD638");
			lblNewLabel_7.setBounds(24, 94, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JRadioButton getRSales() {
		if (rSales == null) {
			rSales = new JRadioButton("\uD310\uB9E4");
			rSales.setBackground(new Color(255, 255, 255));
			rSales.setBounds(190, 254, 57, 23);
			rSales.setSelected(true);
			group.add(rSales);
		}
		return rSales;
	}
	private JRadioButton getRNoSales() {
		if (rNoSales == null) {
			rNoSales = new JRadioButton("\uBBF8\uD310\uB9E4");
			rNoSales.setBackground(new Color(255, 255, 255));
			rNoSales.setBounds(271, 254, 75, 23);
			group.add(rNoSales);
		}
		return rNoSales;
	}
	private JTextField getTEa() {
		if (tEa == null) {
			tEa = new JTextField();
			tEa.setBounds(176, 227, 194, 21);
			tEa.setColumns(10);
		}
		return tEa;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 70, 418, 2);
		}
		return separator_1;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(new Color(255, 140, 0));
			separator_2.setBackground(new Color(255, 140, 0));
			separator_2.setBounds(12, 324, 419, -6);
		}
		return separator_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon("C:\\Users\\JHTA\\Dropbox\\semi\\home.PNG"));
			label.setBounds(274, 10, 72, 50);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FoodSelect panel = new FoodSelect();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(358, 30, 72, 23);
		}
		return button;
	}
	private JSeparator getSeparator_3() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
			separator_3.setForeground(new Color(255, 140, 0));
			separator_3.setBackground(new Color(255, 140, 0));
			separator_3.setBounds(12, 324, 419, 2);
		}
		return separator_3;
	}
}

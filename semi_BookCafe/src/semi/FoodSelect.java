package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class FoodSelect extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel;
	private JTextArea textArea;
	private JButton btnSearch;
	private JTextField tFind;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodSelect frame = new FoodSelect();
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
	public FoodSelect() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 669, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnSearch());
		contentPane.add(getTFind());
		contentPane.add(getBtnAdd());
		contentPane.add(getBtnUpdate());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLabel());
		contentPane.add(getButton());
		
		// ��硫� 泥��� ��硫� �ш� 紐⑸��� 諛�濡� ������
		FoodDao dao = new FoodDao();
		List<FoodVo> list = dao.list();
		
		for(FoodVo vo : list) {
			textArea.append(vo.toString());
		}
	}
	
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 113, 341, 223);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC74C\uC2DD \uC790\uC7AC \uAD00\uB9AC");
			lblNewLabel.setBackground(new Color(255, 255, 255));
			lblNewLabel.setOpaque(true);
			lblNewLabel.setFont(new Font("���댄��_��臾몃�� B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 248, 49);
		}
		return lblNewLabel;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			
			
		}
		return textArea;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("\uAC80\uC0C9");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // 寃��� ��������
					FoodDao dao = new FoodDao();
					String f = tFind.getText();
					List<FoodVo> list = dao.Select(f);
					
					textArea.setText("");
					for(FoodVo vo : list) {
						textArea.append(vo.toString());
					}
				}
			});
			btnSearch.setBounds(273, 80, 64, 23);
		}
		return btnSearch;
	}
	private JTextField getTFind() {
		if (tFind == null) {
			tFind = new JTextField();
			tFind.setBounds(35, 82, 225, 21);
			tFind.setColumns(10);
		}
		return tFind;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("\uC74C\uC2DD \uCD94\uAC00");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // 異�媛� 踰��쇱�� ��������
					FoodInsert panel = new FoodInsert();
					panel.toFront();
					setVisible(false);
				}
			});
			btnAdd.setBounds(520, 143, 97, 23);
		}
		return btnAdd;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("\uC74C\uC2DD \uC218\uC815/\uC0AD\uC81C");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // ����/���� 踰��쇱�� ��������
					FoodUpdate panel = new FoodUpdate();
					panel.toFront();
					setVisible(false);
				}
			});
			btnUpdate.setBounds(520, 242, 121, 23);
		}
		return btnUpdate;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 69, 629, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JHTA\\Dropbox\\semi\\\uC74C\uC2DD \uCD94\uAC001.png"));
			lblNewLabel_1.setBounds(365, 101, 139, 107);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\JHTA\\Dropbox\\semi\\\uC0AD\uC81C1.png"));
			lblNewLabel_2.setBounds(380, 218, 121, 101);
		}
		return lblNewLabel_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon("C:\\Users\\JHTA\\Dropbox\\semi\\home.PNG"));
			label.setBounds(429, 10, 72, 50);
		}
		return label;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { // back 踰��쇱�� �대┃����
					dispose();
				}
			});
			button.setBounds(529, 29, 72, 23);
		}
		return button;
	}
}

package k_io;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class ClientFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField txtJx;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JTextPane textPane;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_2;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientFrame frame = new ClientFrame();
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
	public ClientFrame() {
		setTitle("\uCC44\uD305 \uD074\uB77C\uC774\uC5B8\uD2B8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getTxtJx());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTextField_3());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getComboBox());
		contentPane.add(getTextField_2());
		contentPane.add(getBtnNewButton_3());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC11C\uBC84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(48, 7, 116, 21);
			textField.setColumns(10);

			try {
				InetAddress local = InetAddress.getLocalHost();
				textField.setText(local.getHostAddress());
			} catch (Exception ex) {

			}
			
			
			
			
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD3EC\uD2B8");
			lblNewLabel_1.setBounds(176, 10, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setText("4444");
			textField_1.setBounds(207, 7, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
			lblNewLabel_2.setBounds(12, 35, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTxtJx() {
		if (txtJx == null) {
			txtJx = new JTextField();
			txtJx.setText("jx");
			txtJx.setBounds(58, 32, 116, 21);
			txtJx.setColumns(10);
		}
		return txtJx;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC554\uD638");
			lblNewLabel_3.setBounds(186, 35, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setText("1234");
			textField_3.setBounds(217, 32, 116, 21);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC811\uC18D");
			btnNewButton.setBounds(342, 6, 63, 44);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC885\uB8CC");
			btnNewButton_1.setBounds(423, 6, 63, 44);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 76, 132, 201);
			scrollPane.setViewportView(getList());
			scrollPane.setColumnHeaderView(getLblNewLabel_4());
		}
		return scrollPane;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(156, 76, 307, 230);
			scrollPane_1.setViewportView(getTextPane());
			scrollPane_1.setColumnHeaderView(getLblNewLabel_5());
		}
		return scrollPane_1;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
		}
		return textPane;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC811\uC18D\uC790");
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uBA54\uC2DC\uC9C0");
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uD574\uC81C");
			btnNewButton_2.setBounds(12, 298, 97, 23);
		}
		return btnNewButton_2;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(12, 331, 97, 21);
			comboBox.addItem("Àü  Ã¼");
			comboBox.addItem("±Ó¼Ó¸»");
		}
		return comboBox;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(156, 331, 249, 21);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC804\uC1A1");
			btnNewButton_3.setBounds(408, 330, 63, 23);
		}
		return btnNewButton_3;
	}
}

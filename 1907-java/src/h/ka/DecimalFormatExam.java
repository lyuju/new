package h.ka;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DecimalFormatExam extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecimalFormatExam frame = new DecimalFormatExam();
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
	public DecimalFormatExam() {
		super("Decimal Foramt",true,true,true,true);
		setTitle("DecimalFormat");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC785\uAE08\uC561");
			lblNewLabel.setBounds(23, 32, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(103, 29, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCC9C\uB2E8\uC704");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(0, 87, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC18C\uC22B\uC810,,");
			btnNewButton_1.setBounds(122, 87, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC6D0\uD654\uD45C\uC2DC");
			btnNewButton_2.setBounds(243, 87, 97, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(23, 120, 376, 141);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}

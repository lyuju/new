package j_Collection;

import java.awt.EventQueue;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;

public class ProductModify extends JInternalFrame {

	Set<ProductVo> piList;
	Set<ProductVo> peList;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_1;
	private JTextField serial;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel pCode;
	private JLabel pName;
	private JLabel ea;
	private JLabel nal;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductModify frame = new ProductModify();
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
		
	public ProductModify() {
		super("제품 수정|삭제",false,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getRdbtnNewRadioButton());
		getContentPane().add(getRdbtnNewRadioButton_1());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getSerial());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getSeparator());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getTextField_1());
		getContentPane().add(getTextField_2());
		getContentPane().add(getTextField_3());
		getContentPane().add(getTextField_4());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		setVisible(true);

	}

	
	public ProductModify(Set<ProductVo> pi, Set<ProductVo>pe) {
		this();
		this.piList=pi;
		this.peList=pe;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAD6C\uBD84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("\uC785\uACE0");
			rdbtnNewRadioButton.setBounds(43, 6, 57, 23);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("\uCD9C\uACE0");
			rdbtnNewRadioButton_1.setBounds(98, 6, 121, 23);
		}
		return rdbtnNewRadioButton_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC2DC\uB9AC\uC5BC");
			lblNewLabel_1.setBounds(12, 45, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getSerial() {
		if (serial == null) {
			serial = new JTextField();
			serial.setBounds(86, 42, 116, 21);
			serial.setColumns(10);
		}
		return serial;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(228, 41, 97, 23);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(26, 81, 336, 2);
		}
		return separator;
	}
	private JLabel getPCode() {
		if (pCode == null) {
			pCode = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			pCode.setBounds(12, 103, 57, 15);
		}
		return pCode;
	}
	private JLabel getPName() {
		if (pName == null) {
			pName = new JLabel("\uC81C\uD488\uBA85");
			pName.setBounds(12, 140, 57, 15);
		}
		return pName;
	}
	private JLabel getEa() {
		if (ea == null) {
			ea = new JLabel("\uC218\uB7C9");
			ea.setBounds(12, 175, 57, 15);
		}
		return ea;
	}
	private JLabel getNal() {
		if (nal == null) {
			nal = new JLabel("\uB0A0\uC790");
			nal.setBounds(12, 208, 57, 15);
		}
		return nal;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(86, 100, 116, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(86, 137, 116, 21);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(86, 172, 116, 21);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(86, 205, 116, 21);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.setBounds(12, 236, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.setBounds(161, 236, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(new Color(220, 20, 60));
			status.setBounds(288, 240, 134, 15);
		}
		return status;
	}
}

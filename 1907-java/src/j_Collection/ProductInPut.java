package j_Collection;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ProductInPut extends JInternalFrame {
	Set<ProductVo> piList;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JButton btnNewButton;
	private JLabel status;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInPut frame = new ProductInPut();
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
	public ProductInPut() {
		super("제품입고",false,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
        setVisible(true);
	}

	public ProductInPut(Set<ProductVo> pi) {
		this();
		this.piList= pi;
		
	}
	
	
	public void input() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		try {
		String serial=sdf.format(new Date())+"-"+MemberMain.iSerial;
		String b =pCode.getText();
		String c=pName.getText();
		int a=Integer.parseInt(ea.getText());
		Date n= sdf.parse(nal.getText());
        ProductVo ab = new ProductVo(serial,b,c,a,n);
        piList.add(ab);
        MemberMain.iSerial++;		
		}catch(Exception ex) {
			
		}
		
		
		
	}
	
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel.setBounds(26, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setBounds(26, 49, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC218\uB7C9");
			lblNewLabel_2.setBounds(26, 85, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC785\uACE0\uC77C\uC790");
			lblNewLabel_3.setBounds(26, 131, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(95, 7, 116, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(95, 46, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setBounds(95, 82, 116, 21);
			ea.setColumns(10);
		}
		return ea;
	}
	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setBounds(95, 131, 116, 21);
			nal.setColumns(10);
			
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			nal.setText(sdf.format(new Date()));
		}
		return nal;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uACE0");//입고
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					input();
					
					
				}
			});
			btnNewButton.setBounds(72, 172, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(new Color(220, 20, 60));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(37, 229, 355, 15);
		}
		return status;
	}
}

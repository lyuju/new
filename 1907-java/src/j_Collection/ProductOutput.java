package j_Collection;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProductOutput extends JInternalFrame {

	Set<ProductVo> peList;

	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductOutput frame = new ProductOutput();
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
	public ProductOutput() {
		super("제품출고", false, true, true, true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getStatus());
		setVisible(true);
	}

	public ProductOutput(Set<ProductVo> peList) {
		this();
		this.peList = peList;

	}

	public void output() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		if(pCode.getText().equals("")|| pName.getText().equals("")||
			ea.getText().equals("")||nal.getText().equals("")	) {
		
		
		
		
		
		
		
		
		try {
			String serial = sdf.format(new Date()) + "-" + MemberMain.eSerial;
			String pc = pCode.getText();
			String pn = pName.getText();
			int pa = Integer.parseInt(ea.getText());
			Date n=sdf.parse(nal.getText());
			ProductVo vo = new ProductVo(serial,pc,pn,pa,n);
			peList.add(vo);
			MemberMain.eSerial++;
			status.setText(MemberMain.eSerial+"번째가 출고되었습니다.");
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (NumberFormatException e2) {
			
			}catch(Exception e3) {
				
			}
		}

		}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel.setBounds(12, 24, 57, 15);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setBounds(12, 52, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC218\uB7C9");
			lblNewLabel_2.setBounds(12, 82, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uCD9C\uACE0\uC77C\uC790");
			lblNewLabel_3.setBounds(12, 123, 57, 15);
		}
		return lblNewLabel_3;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uCD9C\uACE0");// 출고
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					output();

				}
			});
			btnNewButton.setBounds(34, 191, 97, 23);
		}
		return btnNewButton;
	}

	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(98, 21, 116, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}

	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(98, 49, 116, 21);
			pName.setColumns(10);
		}
		return pName;
	}

	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setBounds(98, 79, 116, 21);
			ea.setColumns(10);
		}
		return ea;
	}

	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setBounds(98, 120, 116, 21);
			nal.setColumns(10);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			nal.setText(sdf.format(new Date()));
		}
		return nal;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(220, 20, 60));
			status.setBounds(223, 225, 134, 15);
		}
		return status;
	}
}

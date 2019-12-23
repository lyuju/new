package j_Collection;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ProductModify extends JInternalFrame {
	ButtonGroup group = new ButtonGroup();
	Set<ProductVo> piList;
	Set<ProductVo> peList;
	Set<ProductVo> list;
	ProductVo oldVo;

	private JLabel lblNewLabel;
	private JRadioButton imbtn;
	private JRadioButton exbtn;
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
		super("제품 수정|삭제", false, true, true, true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getImbtn());
		getContentPane().add(getExbtn());
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

	public ProductModify(Set<ProductVo> pi, Set<ProductVo> pe) {
		this();
		this.piList = pi;
		this.peList = pe;
	}

	void search() {
		
		DecimalFormat df = new DecimalFormat("#,###,###");
    	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd(E)");
    	
    	
    	
		

		String da = serial.getText();
		if (imbtn.isSelected()) {
			list = piList;
		} else {
			list = peList;
		}
		Iterator<ProductVo> iter = list.iterator();
		ProductVo find = new ProductVo();
		while (iter.hasNext()) {
			ProductVo vo = iter.next();
			String tempEa =df.format(vo.getEa());
			String tempDate = sdf.format(vo.getNal());
			if (vo.getSerial().equals(da)) {
				textField_1.setText(vo.getCode());
				textField_2.setText(vo.getpName());
				textField_3.setText(tempEa);
				textField_4.setText(tempDate);

			}

		}

	}

	public void search2() {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd(E)");
		if (imbtn.isSelected()) {
			list = piList;
		} else {
			list = peList;
		}
		oldVo=null;
		String s = serial.getText();
		for (ProductVo vo : list) {
             if(vo.getSerial().equals(s)) {
            	 String tempDate = sdf.format(vo.getNal());
            	 oldVo=vo;
            	textField_1.setText(vo.getCode());
 				textField_2.setText(vo.getpName());
 				textField_3.setText(String.valueOf(vo.getEa()));
 				textField_4.setText(sdf.format(vo.getNal()));
            	 break;
             }
		}
		if(oldVo==null) {
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			status.setText("자료가 없습니다.");
		}

	}
	
	
	void delete() {
		if(oldVo!=null) {
			list.remove(oldVo);
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			status.setText("자료가 삭제되었습니다.");
		}
		
	}
	
	void update(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		if(oldVo!=null) {
			try {
				String s= serial.getText();
				String pC=textField_1.getText();
				String pN=textField_2.getText();
				int e  =Integer.parseInt(textField_3.getText());
				Date n=sdf.parse(textField_4.getText());
				list.remove(oldVo);
				ProductVo aa = new ProductVo(s,pC,pN,e,n);
				list.add(aa);
				
				status.setText("내용이 수정되었씁니다.");
				serial.requestFocus();
				serial.selectAll();
				
			}catch(ParseException e){
				
			}catch(NumberFormatException ex) {
				
			}
			
			
		}
		
		
		
		
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAD6C\uBD84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}

	private JRadioButton getImbtn() {
		if (imbtn == null) {
			imbtn = new JRadioButton("\uC785\uACE0");// 입고
			imbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					group.add(imbtn);
					imbtn.setSelected(true);
				}
			});
			imbtn.setBounds(43, 6, 57, 23);
		}
		return imbtn;
	}

	private JRadioButton getExbtn() {
		if (exbtn == null) {
			exbtn = new JRadioButton("\uCD9C\uACE0");// 출고
			exbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					group.add(exbtn);

				}
			});
			exbtn.setBounds(98, 6, 121, 23);
		}
		return exbtn;
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
			btnNewButton = new JButton("\uAC80\uC0C9");// 검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search2();
				}
			});
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
			btnNewButton_1 = new JButton("\uC218\uC815");// 수정
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					update();
				}
			});
			btnNewButton_1.setBounds(12, 236, 97, 23);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");// 삭제
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
				}
			});
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

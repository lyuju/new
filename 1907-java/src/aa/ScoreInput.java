package aa;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;



import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;

public class ScoreInput extends JInternalFrame {
	Map<ScoreVo,String> map;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField sno;
	private JTextField mName;
	private JTextField exam;
	private JTextField grade;
	private JTextField kor;
	private JTextField eng;
	private JTextField mat;
	private JButton btnNewButton;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreInput frame = new ScoreInput();
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
	public ScoreInput() {
		super("ют╥б",false,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getLblNewLabel_6());
		getContentPane().add(getSno());
		getContentPane().add(getMName());
		getContentPane().add(getExam());
		getContentPane().add(getGrade());
		getContentPane().add(getKor());
		getContentPane().add(getEng());
		getContentPane().add(getMat());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
        setVisible(true);
	}
	public ScoreInput(Map<ScoreVo,String> map) {
		this();
		this.map = map;
	}
	void insert() {
		 String sn=sno.getText();
		 String mN=mName.getText();
		 String ex=exam.getText();
		 int grd=Integer.parseInt(grade.getText());
		 int ko=Integer.parseInt(kor.getText());
		 int en=Integer.parseInt(eng.getText());
		 int ma=Integer.parseInt(mat.getText());
		 int tot=ko+en+ma;
		 int avg=tot/3;
		//Map<ScoreVo,String> map = new HashMap<ScoreVo,String>();
		
		 
		 map.put(new ScoreVo(sn,mN,ex,grd,ko,en,ma), tot+"-"+avg);
		
	}
	
	
	
	
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88");
			lblNewLabel.setBounds(35, 23, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uBA85");
			lblNewLabel_1.setBounds(35, 48, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uD559\uB144");
			lblNewLabel_2.setBounds(35, 110, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uAD6D\uC5B4");
			lblNewLabel_3.setBounds(35, 151, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC601\uC5B4");
			lblNewLabel_4.setBounds(35, 190, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC218\uD559");
			lblNewLabel_5.setBounds(35, 222, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC2DC\uD5D8\uC885\uB958");
			lblNewLabel_6.setBounds(35, 73, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JTextField getSno() {
		if (sno == null) {
			sno = new JTextField();
			sno.setBounds(106, 20, 116, 21);
			sno.setColumns(10);
		}
		return sno;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(106, 45, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JTextField getExam() {
		if (exam == null) {
			exam = new JTextField();
			exam.setBounds(106, 76, 116, 21);
			exam.setColumns(10);
		}
		return exam;
	}
	private JTextField getGrade() {
		if (grade == null) {
			grade = new JTextField();
			grade.setBounds(106, 107, 116, 21);
			grade.setColumns(10);
		}
		return grade;
	}
	private JTextField getKor() {
		if (kor == null) {
			kor = new JTextField();
			kor.setBounds(104, 148, 116, 21);
			kor.setColumns(10);
		}
		return kor;
	}
	private JTextField getEng() {
		if (eng == null) {
			eng = new JTextField();
			eng.setBounds(106, 187, 116, 21);
			eng.setColumns(10);
		}
		return eng;
	}
	private JTextField getMat() {
		if (mat == null) {
			mat = new JTextField();
			mat.setBounds(104, 222, 116, 21);
			mat.setColumns(10);
		}
		return mat;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uB825");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insert();
				}
			});
			btnNewButton.setBounds(277, 44, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(220, 20, 60));
			status.setBounds(292, 190, 106, 15);
		}
		return status;
	}
}

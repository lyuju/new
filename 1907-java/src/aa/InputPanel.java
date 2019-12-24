package aa;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
	ButtonGroup group= new ButtonGroup();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	public JRadioButton rExam1;
	public JRadioButton rExam2;
	public JComboBox cGrade;
	public JTextField tSno;
	public JTextField tMname;
	public JTextField tKor;
	public JTextField tEng;
	public JTextField tMat;
	public JTextField tTot;
	public JTextField tAvg;

	/**
	 * Create the panel.
	 */
	public InputPanel() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getLblNewLabel_4());
		add(getLblNewLabel_5());
		add(getLblNewLabel_6());
		add(getLblNewLabel_7());
		add(getLblNewLabel_8());
		add(getRExam1());
		add(getRExam2());
		add(getCGrade());
		add(getTSno());
		add(getTMname());
		add(getTKor());
		add(getTEng());
		add(getTMat());
		add(getTTot());
		add(getTAvg());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD559\uBC88");
			lblNewLabel.setBounds(12, 22, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC131\uBA85");
			lblNewLabel_1.setBounds(12, 50, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC2DC\uD5D8 \uC885\uB958");
			lblNewLabel_2.setBounds(12, 93, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uD559\uB144");
			lblNewLabel_3.setBounds(12, 132, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uAD6D\uC5B4");
			lblNewLabel_4.setBounds(12, 177, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC601\uC5B4");
			lblNewLabel_5.setBounds(12, 216, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uC218\uD559");
			lblNewLabel_6.setBounds(12, 263, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uCD1D\uC810");
			lblNewLabel_7.setBounds(12, 304, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("\uD3C9\uADE0");
			lblNewLabel_8.setBounds(12, 347, 57, 15);
		}
		return lblNewLabel_8;
	}
	private JRadioButton getRExam1() {
		if (rExam1 == null) {
			rExam1 = new JRadioButton("\uC911\uAC04");
			rExam1.setBounds(77, 89, 62, 23);
			group.add(rExam1);
			rExam1.setSelected(true);
		}
		return rExam1;
	}
	private JRadioButton getRExam2() {
		if (rExam2 == null) {
			rExam2 = new JRadioButton("\uAE30\uB9D0");
			rExam2.setBounds(143, 89, 62, 23);
			group.add(rExam2);
		}
		return rExam2;
	}
	private JComboBox getCGrade() {
		if (cGrade == null) {
			cGrade = new JComboBox();
			cGrade.setBounds(81, 129, 75, 21);
			cGrade.addItem("1학년");
			cGrade.addItem("2학년");
			cGrade.addItem("3학년");
			cGrade.addItem("4학년");
			cGrade.setSelectedIndex(0);
			
		}
		return cGrade;
	}
	private JTextField getTSno() {
		if (tSno == null) {
			tSno = new JTextField();
			tSno.setBounds(62, 19, 116, 21);
			tSno.setColumns(10);
		}
		return tSno;
	}
	private JTextField getTMname() {
		if (tMname == null) {
			tMname = new JTextField();
			tMname.setBounds(62, 50, 116, 21);
			tMname.setColumns(10);
		}
		return tMname;
	}
	private JTextField getTKor() {
		if (tKor == null) {
			tKor = new JTextField();
			tKor.setBounds(62, 174, 116, 21);
			tKor.setColumns(10);
		}
		return tKor;
	}
	private JTextField getTEng() {
		if (tEng == null) {
			tEng = new JTextField();
			tEng.setBounds(62, 216, 116, 21);
			tEng.setColumns(10);
		}
		return tEng;
	}
	private JTextField getTMat() {
		if (tMat == null) {
			tMat = new JTextField();
			tMat.setBounds(62, 260, 116, 21);
			tMat.setColumns(10);
		}
		return tMat;
	}
	private JTextField getTTot() {
		if (tTot == null) {
			tTot = new JTextField();
			tTot.setEditable(false);
			tTot.setBounds(62, 301, 116, 21);
			tTot.setColumns(10);
		}
		return tTot;
	}
	private JTextField getTAvg() {
		if (tAvg == null) {
			tAvg = new JTextField();
			tAvg.setEditable(false);
			tAvg.setBounds(62, 344, 116, 21);
			tAvg.setColumns(10);
		}
		return tAvg;
	}
}

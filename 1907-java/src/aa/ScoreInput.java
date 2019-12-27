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
import java.awt.Font;
import javax.swing.JPanel;

public class ScoreInput extends JInternalFrame {
	MemberMain mm;
	Map<String,List<ScoreVo>> map;
	private JLabel lblNewLabel_7;
	private InputPanel panel;
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
		super("입력",false,true,true,true);
		setBounds(100, 100, 416, 552);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel_7());
		getContentPane().add(getPanel());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
        setVisible(true);
	}
	public ScoreInput(Map<String,List<ScoreVo>> map,MemberMain mm) {//Jpanel cont
		this();
		this.map = map;
		this.mm=mm;
	}
	public void sync() {
		Object[] obj =mm.getContentPane().getComponents();
		for(int i=0;i<obj.length;i++) {
			if(obj[i] instanceof ScoreSearch) {
				ScoreSearch ss = (ScoreSearch)obj[i];
						ss.btnfind.doClick();
			}
		}
	}
	
	
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uC131\uC801\uC785\uB825");
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 23));
			lblNewLabel_7.setBounds(40, 20, 158, 21);
		}
		return lblNewLabel_7;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(23, 60, 228, 376);
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");//저장
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String sno = panel.tSno.getText();
					String mName= panel.tMname.getText();
					int kor = Integer.parseInt(panel.tKor.getText());
					int eng = Integer.parseInt(panel.tEng.getText());
					int mat = Integer.parseInt(panel.tMat.getText());
					String exam = "";
					int grade = 0;
					if(panel.rExam1.isSelected()) {
						exam="중간";
					}else {
						exam="기말";
					}
					grade= panel.cGrade.getSelectedIndex()+1;
					ScoreVo vo = new ScoreVo(sno,mName,exam,grade,kor,eng,mat);
					
					panel.tTot.setText(vo.getTot()+"");
					panel.tAvg.setText(String.format("%4.1f",vo.getAvg())+"");
					
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.insert(vo);
					if(b) {
						status.setText("데이터가 저장되었습니다.");
						sync();
					}else {
						status.setText("저장중 오류 발생.");
					}
					
					
					
					
					
					
					
					
						
				}
			});
			btnNewButton.setBounds(74, 444, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(220, 20, 60));
			status.setBounds(23, 477, 353, 36);
		}
		return status;
	}
}

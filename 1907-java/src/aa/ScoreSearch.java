package aa;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ScoreSearch extends JInternalFrame {
	Map<String,List<ScoreVo>> map;
	List<ScoreVo>list;
	DefaultListModel<String> modelSno = new DefaultListModel<String>();
	DefaultListModel<String> modelExam = new DefaultListModel<String>();
	//리스트에 표시된 데이터만 컨트롤함
	
	
	
	
	
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JList listSno;
	private JScrollPane scrollPane_1;
	private JList listExam;
	private JTextField textField;
	private JButton btnNewButton;
	private InputPanel panel;
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
					ScoreSearch frame = new ScoreSearch();
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
	public ScoreSearch() {
		super("조회", false, true, true, true);
		setBounds(100, 100, 769, 542);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getScrollPane_1_1());
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getPanel());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		setVisible(true);
	}
	
	
	
	public ScoreSearch(Map<String,List<ScoreVo>> map) {
		this();
		this.map=map;
		//학번을 추출하여 JList에 표시
		Set<String> set = map.keySet();
		
		//JList에 추가
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			modelSno.addElement(iter.next());
			
		}
			
			
		listSno.setModel(modelSno);
		
	}
	
			

	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC218\uC815/\uC0AD\uC81C");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 23));
			lblNewLabel.setBounds(12, 10, 240, 33);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 112, 145, 328);
			scrollPane.setViewportView(getListSno());
		}
		return scrollPane;
	}
	private JList getListSno() {
		if (listSno == null) {
			listSno = new JList();
			listSno.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent ev) {
					String sno=(String)listSno.getSelectedValue();
					if(sno==null) return;
					list = map.get(sno);
					modelExam= new DefaultListModel<>();
					for(int i =0;i<list.size();i++) {
						ScoreVo vo = list.get(i);
						String temp = String.format("%s : %d(%s)",vo.getmName(),vo.getGrade(),vo.getExam() );
						modelExam.addElement(temp);
					}
                  listExam.setModel(modelExam);						
						
					
					
				}
			});
		}
		return listSno;
	}
	private JScrollPane getScrollPane_1_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(196, 112, 212, 328);
			scrollPane_1.setViewportView(getListExam());
		}
		return scrollPane_1;
	}
	private JList getListExam() {
		if (listExam == null) {
			listExam = new JList();
			listExam.addListSelectionListener(new ListSelectionListener() {
				
				public void valueChanged(ListSelectionEvent e) {
					int index = listExam.getSelectedIndex();
					int grade=-1;
					if(index<0) {
						return;
					}
					ScoreVo vo = list.get(index);
					panel.tSno.setText(vo.getSno());
					panel.tMname.setText(vo.getmName()+"");
					panel.tKor.setText(vo.getKor()+"");
					panel.tEng.setText(vo.getEng()+"");
					panel.tMat.setText(vo.getMat()+"");
					panel.tTot.setText(vo.getTot()+"");
					panel.tAvg.setText(String.format("%4.1f",vo.getAvg()));
					
					if(vo.getExam().equals("중간")) {
						panel.rExam1.setSelected(true);
					}else {
						panel.rExam2.setSelected(true);
					}
					//학년 선택
					grade = vo.getGrade()-1;
					panel.cGrade.setSelectedIndex(grade);
					
					
				}
			});
		}
		return listExam;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(386, 60, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");//검색
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					
					String findStr = textField.getText();
					ScoreDao dao = new ScoreDao(map);
					Map<String,List<ScoreVo>> newMap =dao.list(findStr);
					
					Set<String> set = newMap.keySet();
					modelSno = new DefaultListModel<String>();//modelSno.clear();
					Iterator<String> iter = set.iterator();
					while(iter.hasNext()) {
						modelSno.addElement(iter.next());
					}
					listSno.setModel(modelSno);
					modelExam.clear();	
					
					
					panel.tSno.setText("");
					panel.tMname.setText("");
					panel.tKor.setText("");
					panel.tEng.setText("");
					panel.tMat.setText("");
					panel.tTot.setText("");
					panel.tAvg.setText("");
					
					
					
					
					
					
					
					
				}
			});
			btnNewButton.setBounds(518, 59, 97, 23);
		}
		return btnNewButton;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new InputPanel();
			panel.setBounds(463, 91, 234, 367);
		}
		return panel;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");//수정
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key=panel.tSno.getText();
					int index =listExam.getSelectedIndex();
					
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
					ScoreVo vo = new ScoreVo(key,mName,exam,grade,kor,eng,mat);
					
					
					ScoreDao a = new ScoreDao(map);
					boolean b=a.update(key, index, vo);
					if(b) {
						status.setText("수정되었습니다.");
						panel.tSno.setText("");
						panel.tMname.setText("");
						panel.tKor.setText("");
						panel.tEng.setText("");
						panel.tMat.setText("");
						panel.tTot.setText("");
						panel.tAvg.setText("");
						
					}else {
						status.setText("오류가 발생.");
					}
						
					
				}
			});
			btnNewButton_1.setBounds(473, 468, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String key = panel.tSno.getText();
					int index = listExam.getSelectedIndex();
					ScoreDao dao = new ScoreDao(map);
					boolean b = dao.delete(key, index);
					if(b) {
						status.setText("자료가 삭제되었습니다.");
						panel.tSno.setText("");
						panel.tMname.setText("");
						panel.tKor.setText("");
						panel.tEng.setText("");
						panel.tMat.setText("");
						panel.tTot.setText("");
						panel.tAvg.setText("");
						if(modelExam.size()>0) {
							modelExam.remove(index);
						}
					}else {
						status.setText("삭제중 오류 발생.");
					}
					
					
				}
			});
			btnNewButton_2.setBounds(600, 468, 97, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(new Color(220, 20, 60));
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(23, 472, 330, 15);
		}
		return status;
	}
}

package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class Scoreinsert extends JInternalFrame {
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private JLabel lblNewLabel;
	private JLabel ddd;
	private JLabel tSubjdd;
	private JLabel tScodd;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton;
	private JTextField tmId;
	private JTextField tSubj;
	private JTextField tSco;
	private JTextField trDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scoreinsert frame = new Scoreinsert();
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
	public Scoreinsert() {
		super("己利涝仿",true,true,true,true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getDdd());
		getContentPane().add(getTSubjdd());
		getContentPane().add(getTScodd());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getTmId());
		getContentPane().add(getTSubj());
		getContentPane().add(getTSco());
		getContentPane().add(getTrDate());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC785\uB825");
			lblNewLabel.setBounds(26, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getDdd() {
		if (ddd == null) {
			ddd = new JLabel("\uC544\uC774\uB514");
			ddd.setBounds(12, 59, 57, 15);
		}
		return ddd;
	}
	private JLabel getTSubjdd() {
		if (tSubjdd == null) {
			tSubjdd = new JLabel("\uACFC\uBAA9");
			tSubjdd.setBounds(12, 161, 57, 15);
		}
		return tSubjdd;
	}
	private JLabel getTScodd() {
		if (tScodd == null) {
			tScodd = new JLabel("\uC810\uC218");
			tScodd.setBounds(12, 186, 57, 15);
		}
		return tScodd;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC751\uC2DC\uC77C");
			lblNewLabel_5.setBounds(12, 94, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			     try {
					ScoreDao dao = new ScoreDao();
				  ScoreVo vo = new ScoreVo();
				  vo.setId(  tmId.getText());
				  vo.setRdate( sdf.parse(trDate.getText()));
				  vo.setSub( tSubj.getText());
				  vo.setSco( Integer.parseInt( tSco.getText()));
				  
				  int cnt = dao.insert(vo);
				  if(cnt>0) System.out.println("己利涝仿");
				  else System.out.println("己利 角菩");
			     }catch (Exception ex) {
			    	 
			     }
				}
			});
			btnNewButton.setBounds(66, 211, 97, 23);
		}
		return btnNewButton;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(91, 56, 116, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JTextField getTSubj() {
		if (tSubj == null) {
			tSubj = new JTextField();
			tSubj.setBounds(91, 158, 116, 21);
			tSubj.setColumns(10);
		}
		return tSubj;
	}
	private JTextField getTSco() {
		if (tSco == null) {
			tSco = new JTextField();
			tSco.setBounds(91, 180, 116, 21);
			tSco.setColumns(10);
		}
		return tSco;
	}
	private JTextField getTrDate() {
		if (trDate == null) {
			trDate = new JTextField();
			trDate.setBounds(91, 91, 116, 21);
			trDate.setColumns(10);
		}
		return trDate;
	}
}

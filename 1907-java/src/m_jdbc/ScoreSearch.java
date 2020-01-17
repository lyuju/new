package m_jdbc;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.List;
import java.awt.event.ActionEvent;

public class ScoreSearch extends JInternalFrame {
	Connection conn = DBConn.getConn();
	ScoreDao dao = new ScoreDao();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private JLabel lblNewLabel;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;

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
		super("성적조회",true,true,true,true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getFind());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getScrollPane());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC131\uC801 \uC870\uD68C");
			lblNewLabel.setBounds(35, 30, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(187, 61, 116, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String bb = find.getText();
					List<ScoreVo> list = dao.select(bb);
					
					textArea.setText("");
					for(ScoreVo vo : list){
						textArea.append( vo.toString());
					}
					
					
					
					
					
					
					
					
					
					
					/*//ScoreDao dao = new ScoreDao();
					int f = Integer.parseInt(find.getText());
					List<ScoreVo> list = dao.select(f);
					
					textArea.setText("");
					for(ScoreVo vo : list) {
						textArea.append(vo.toString());
					}*/
				}
			});
			btnNewButton.setBounds(315, 60, 97, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(35, 118, 358, 127);
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

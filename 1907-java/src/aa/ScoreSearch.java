package aa;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;



import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreSearch extends JInternalFrame {
	Map<ScoreVo,String> map;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		setVisible(true);
	}
	
	
	
	public ScoreSearch(Map<ScoreVo, String> map) {
		this();
		this.map=map;
		
	}
	public void prn(Map<ScoreVo, String> map) {
		
		Set<ScoreVo> set = map.keySet();
		Iterator<ScoreVo> iter = set.iterator();
		while (iter.hasNext()) {
			ScoreVo key = iter.next();
			String value = map.get(key);
			textArea.setText(key+":"+value);;
			System.out.println(key+value);
		}
		Set<Map.Entry<ScoreVo, String>> set2 = map.entrySet();// 원래 셋구조
		Iterator<Map.Entry<ScoreVo, String>> iter2 = set2.iterator();
		while (iter2.hasNext()) {
			Map.Entry<ScoreVo, String> entry = iter2.next();
			System.out.println(entry.getKey()+":"+entry.getValue());	
			
		}	
			

	}
	
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getBtnNewButton());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prn(map);
				}
			});
		}
		return btnNewButton;
	}
}

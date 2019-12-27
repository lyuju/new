package aa;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TreeMapFrame extends JInternalFrame {
	TreeMap<Integer, String> Scores;

	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeMapFrame frame = new TreeMapFrame();
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
	public TreeMapFrame() {
		super("TreeMap", false, true, true, true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getScrollPane());
		setVisible(true);
	}

	public void process() {
		Scores = new TreeMap<Integer, String>();
		Scores.put(88, "kim");
		Scores.put(50, "hong");
		Scores.put(90, "park");
		Scores.put(66, "lee");

		textArea.setText("");
		Map.Entry<Integer, String> entry = null;

		entry = Scores.firstEntry();
		textArea.append("최소값 : " + entry.getKey() + ">" + entry.getValue());

		entry = Scores.lastEntry();
		textArea.append("\n최대값 : " + entry.getKey() + ">" + entry.getValue());

		entry = Scores.lowerEntry(66);
		textArea.append("\n66점미만 : " + entry.getKey() + ">" + entry.getValue());

		entry = Scores.higherEntry(66);
		textArea.append("\n66이상 : " + entry.getKey() + ">" + entry.getValue());
	}

	public void asc() {
		if (Scores != null) {
			textArea.setText("");
			NavigableMap<Integer, String> tempMap = Scores.descendingMap();
			NavigableMap<Integer, String> ascMap = tempMap.descendingMap();
			Set<Map.Entry<Integer, String>> set = ascMap.entrySet();
			for (Map.Entry<Integer, String> d : set) {
              textArea.append(d.getKey()+" : "+ d.getValue()+"\n");
			}

		} else {
			textArea.setText("먼저 실행버튼을 클릭한후 정렬해 주세요.");
		}
	}

	public void desc() {
		if (Scores != null) {
			textArea.setText("");
			NavigableMap<Integer, String> tempMap = Scores.descendingMap();
			//NavigableMap<Integer, String> ascMap = tempMap.descendingMap();
			Set<Map.Entry<Integer, String>> set = tempMap.entrySet();
			for (Map.Entry<Integer, String> d : set) {
              textArea.append(d.getKey()+" : "+ d.getValue()+"\n");
			}

		} else {
			textArea.setText("먼저 실행버튼을 클릭한후 정렬해 주세요.");
		}
		
		
		

	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");// 실행
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					process();

				}
			});
			btnNewButton.setBounds(0, 10, 97, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("ASC");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                      asc();
				}
			});
			btnNewButton_1.setBounds(109, 10, 97, 23);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("DESC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                         desc();
				}
			});
			btnNewButton_2.setBounds(223, 10, 97, 23);
		}
		return btnNewButton_2;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 63, 365, 172);
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

package aa;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NavigableSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TreeSetFrame extends JInternalFrame {
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeSetFrame frame = new TreeSetFrame();
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
	public TreeSetFrame() {
		super("TreeSetFrame", false, true, true, true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getScrollPane());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		setVisible(true);
	}

	public void process() {

		TreeSet<Integer> scores = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(), ",");
		textArea.setText("");
		while (tokens.hasMoreElements()) {
			// textArea.append(tokens.nextToken()+"\n");
			scores.add(Integer.parseInt(tokens.nextToken()));
		}

		textArea.append("최소값 : " + scores.first());
		textArea.append("\n최대값 : " + scores.last());
		textArea.append("\n60점 이하 : " + scores.lower(60));
		textArea.append("\n90점 이상 : " + scores.higher(90));

		textArea.append("\n60점 바로 밑 값 :" + scores.floor(60));// 60점바로 밑값
		textArea.append("\n90점 바로 위 값 :" + scores.ceiling(90));
		textArea.append("\n------------------------");

		while (!scores.isEmpty()) {
			textArea.append("\n" + scores.pollFirst() + ":::" + scores.size());
		}

	}

	public void asc() {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(),",");
		while (tokens.hasMoreElements()) {
			// textArea.append(tokens.nextToken()+"\n");
			scores.add(Integer.parseInt(tokens.nextToken()));}
		
		
		textArea.setText("");
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			textArea.append(score + "\n");
		}
		

	}

	public void dasc() {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		StringTokenizer tokens = new StringTokenizer(textField.getText(),",");
		while (tokens.hasMoreElements()) {
			// textArea.append(tokens.nextToken()+"\n");
			scores.add(Integer.parseInt(tokens.nextToken()));}
		
		
		textArea.setText("");
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		
		for(Integer score : descendingSet) {
			textArea.append(score + "\n");
		}

	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("23,5,564,5,454,8,5,5,,,21");
			textField.setBounds(12, 10, 267, 21);
			textField.setColumns(10);
		}
		return textField;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2E4\uD589");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					process();

				}
			});
			btnNewButton.setBounds(301, 10, 97, 23);
		}
		return btnNewButton;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 72, 387, 175);
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

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("ASC");// 어센딩
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					asc();
				}
			});
			btnNewButton_1.setBounds(188, 43, 97, 23);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("DESC");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dasc();
				}
			});
			btnNewButton_2.setBounds(301, 43, 97, 23);
			
		}
		return btnNewButton_2;
	}
}

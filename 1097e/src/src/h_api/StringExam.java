package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class StringExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringExam frame = new StringExam();
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
	public StringExam() {
		setTitle("\uBB38\uC790\uC5F4 Exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getTextArea(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC8FC\uBBFC\uBC88\uD638");
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uD655\uC778");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String area = "";//String str = "";
					String sn = textField.getText();
					int b    = sn.length();	//str += textField.getText().length();
					String su = sn.substring(0, 6); //str +="\n 생년 : " sn.substring(0,2); str +="\n 생월 : " sn.substring(2,4); str +="\n 생일 : " sn.substring(4,6);
					String ss = "";
					if( sn.charAt(7) == '1' ) {//str +="\n 성별 : " + (c%2==0)?"여자" : "남자");
						ss += "남자";
					}else if( sn.charAt(7) == '2' ) {
						ss += "여자";
					}else {
						ss += "외계인";
					}
					area += "문자열의 길이 : " + b + "\n";
					area += "생년월일 : " + su + "\n";
					area += "성별 : " + ss + "\n";
					textArea.setText(area);
				}
			});
		}
		return btnNewButton;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}

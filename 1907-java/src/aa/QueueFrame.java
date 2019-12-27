package aa;

import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class QueueFrame extends JInternalFrame {
	Queue<Message> queue = new LinkedList<Message>();
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueueFrame frame = new QueueFrame();
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
	public QueueFrame() {
		super("Queue", false, true, true, true);
		setBounds(100, 100, 450, 375);
		getContentPane().setLayout(null);
		getContentPane().add(getTextField());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getScrollPane());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getComboBox());
		getContentPane().add(getLblNewLabel_1());
		setVisible(true);
		int a=(int)Math.random()*10;
		
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(131, 45, 116, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OFFER");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String b =textField.getText();
					String ad=(String)comboBox.getSelectedItem();
					Message d = new Message(b,ad);
					
					queue.offer(d);
					
					
					
				}
			});
			btnNewButton.setBounds(259, 9, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("PULL");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
					while(!queue.isEmpty()) {
					Message message = queue.poll();
					switch(message.getTo()) {
					case "Mail":
						textArea.append(message.getCommand()+"´Ô¿¡°Ô"+message.getTo()+"À» º¸³À´Ï´Ù");
					    break;
					
					case "SMS":
						textArea.append(message.getCommand()+"´Ô¿¡°Ô"+message.getTo()+"À» º¸³À´Ï´Ù");
					    break;
					case "KaKao Talk":
						textArea.append(message.getCommand()+"´Ô¿¡°Ô"+message.getTo()+"À» º¸³À´Ï´Ù");
					    break;
					
					}
					textArea.append("\n");
					
					
					
					
					}
				}
			});
			btnNewButton_1.setBounds(259, 44, 97, 23);
		}
		return btnNewButton_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 116, 410, 200);
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
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("command");
			lblNewLabel.setBounds(24, 13, 57, 15);
		}
		return lblNewLabel;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(133, 8, 75, 25);
			
			
			comboBox.addItem("Mail");
			comboBox.addItem("SMS");
			comboBox.addItem("KaKao Talk");
			
		}
		return comboBox;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(24, 48, 57, 15);
		}
		return lblNewLabel_1;
	}
}

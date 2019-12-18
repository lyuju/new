package i_Thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TimeWatch extends JFrame {

	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel;
    //String data="";
   // Watch a = new Watch();
	//Watch a = new Watch();
	//a.start();

	
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
	
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeWatch frame = new TimeWatch();
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
	public TimeWatch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getPanel());
		Watch a = new Watch(textField);
		a.start();
		/*Runnable ab = new StopWatchThread(btnNewButton);
	    Thread thread = new Thread(ab);
	    thread.start();*/
		//setvisible(ture);
		
		
		
		
		
		
		
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC2DC\uACC4");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private synchronized JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					
					
					
					//textField.setText(textField);
				}
					
			});
			textField.setBounds(12, 35, 395, 55);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC2A4\uD0D1\uC6CC\uCE58");
			lblNewLabel_1.setBounds(12, 123, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("start");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					contentPane.UPateUI;
					Runnable ab = new StopWatchThread(btnNewButton);
				    Thread thread = new Thread(ab);
				    thread.start();
					
					
					
					
					
				}
			});
			btnNewButton.setBounds(22, 213, 97, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("stop");
			btnNewButton_1.setBounds(279, 213, 97, 23);
		}
		return btnNewButton_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new StorWatchThread();
			panel.setBounds(12, 148, 395, 49);
		}
		return panel;
	}
}

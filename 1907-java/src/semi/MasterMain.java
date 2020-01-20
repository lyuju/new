package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MasterMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterMain frame = new MasterMain();
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
	public MasterMain() {
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC74C\uC2DD \uC8FC\uBB38\uCC3D \uAD00\uB9AC");
		btnNewButton.setBounds(33, 54, 125, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\uCC45 \uAD00\uB9AC");
		btnNewButton_2.setBounds(33, 165, 125, 41);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC74C\uC2DD \uC790\uC81C \uAD00\uB9AC");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(264, 165, 130, 41);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0/\uB9E4\uB2C8\uC800 \uAD00\uB9AC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerFrame ad = new ManagerFrame();
				contentPane.add(ad);
				ad.toFront();
				
				
			}
		});
		btnNewButton_1.setBounds(264, 54, 130, 41);
		contentPane.add(btnNewButton_1);
	}

}

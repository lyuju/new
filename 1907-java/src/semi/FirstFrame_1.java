package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FirstFrame_1 extends JFrame {

	private JPanel contentPane;
	private JTextField cId;
	private JTextField cPwd;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame_1 frame = new FirstFrame_1();
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
	public FirstFrame_1() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel.setBounds(135, 33, 136, 15);
		contentPane.add(lblNewLabel);
		
		JLabel Id = new JLabel("\uC544\uC774\uB514");
		Id.setBounds(41, 79, 57, 15);
		contentPane.add(Id);
		
		JLabel Pwd = new JLabel("\uBE44\uBC00\uBC88\uD638");
		Pwd.setBounds(41, 116, 57, 15);
		contentPane.add(Pwd);
		
		cId = new JTextField();
		cId.setBounds(135, 76, 116, 21);
		contentPane.add(cId);
		cId.setColumns(10);
		
		cPwd = new JTextField();
		cPwd.setBounds(135, 113, 116, 21);
		contentPane.add(cPwd);
		cPwd.setColumns(10);
		
		JLabel status = new JLabel("");
		status.setOpaque(true);
		status.setBackground(new Color(220, 20, 60));
		status.setBounds(150, 211, 57, 15);
		contentPane.add(status);
		
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = cId.getText();
				String pwd = cPwd.getText();
				userVo vo = new userVo();
				userDao dao = new userDao();
				vo.setcId(id);
				vo.setcPwd(pwd);
				
				
				
				
				char cnt = dao.insert(vo);
			    System.out.println(cnt);
				if(cnt == 'u') {
					ManagerFrame Master = new ManagerFrame();
					
					setVisible(false);
				}else if(cnt == 'b') {
					ClientFrame Manager = new ClientFrame();
				}else {
					status.setText("¾øÀ½");
				}
				
				
						
				
			}
		});
		btnNewButton.setBounds(140, 171, 97, 23);
		contentPane.add(btnNewButton);
		
		
	}
}

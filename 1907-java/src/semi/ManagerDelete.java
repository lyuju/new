package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ManagerDelete extends JFrame {

	private JPanel contentPane;
	private JTextField MasterId;
	private JTextField MasterPwd;
	
    String id;
    private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerDelete frame = new ManagerDelete();
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
	public ManagerDelete() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(39, 32, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(39, 77, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		MasterId = new JTextField();
		MasterId.setBounds(132, 29, 116, 21);
		contentPane.add(MasterId);
		MasterId.setColumns(10);
		
		MasterPwd = new JTextField();
		MasterPwd.setBounds(132, 74, 116, 21);
		contentPane.add(MasterPwd);
		MasterPwd.setColumns(10);
		
		JLabel status = new JLabel("");
		status.setOpaque(true);
		status.setBackground(new Color(220, 20, 60));
		status.setBounds(39, 151, 209, 15);
		contentPane.add(status);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mid = MasterId.getText();
				String pwd = MasterPwd.getText();
				userVo vo = new userVo();
				userDao dao = new userDao();
				vo.setcId(mid);
				vo.setcPwd(pwd);
				dao.insert(vo);
				
				char cnt = dao.insert(vo);
				if(cnt == 'u') {
					dao.delete(id);
					status.setText("삭제 성공");
				}else {
					status.setText("권한 없음");
				}
					
				
			
				
				
			}
		});
		btnNewButton.setBounds(151, 118, 97, 23);
		contentPane.add(btnNewButton);
		contentPane.add(getBtnNewButton_1());
		
		
	}
	
	public ManagerDelete(String id) {
		this();
		this.id=id;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB4A4\uB85C");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					setVisible(false);
				}
			});
			btnNewButton_1.setBounds(191, 189, 57, 23);
		}
		return btnNewButton_1;
	}
}

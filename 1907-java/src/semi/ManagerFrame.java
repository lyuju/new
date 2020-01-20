package semi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ManagerFrame extends JFrame {

	private JTextField find;
	private JTable table;
	private JTextField mPwd;
	private JTextField mName;
	private JTable table_1;
	private JTextField mId;
	String id;
	Connection conn = DBConn.getConn();
	private JTextField nPwd;
	private JLabel a;
	private JTextField mcheck;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerFrame frame = new ManagerFrame();
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
	public ManagerFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
						try {
							conn.close();
						} catch (Exception ex) {
							// TODO Auto-generated catch block
							ex.printStackTrace();
						}
			}
		});
		
		
			
		
		setVisible(true);

		setBounds(100, 100, 617, 507);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC870\uD68C");
		lblNewLabel.setBounds(27, 22, 57, 15);
		getContentPane().add(lblNewLabel);

		find = new JTextField();
		find.setBounds(113, 19, 116, 21);
		getContentPane().add(find);
		find.setColumns(10);

		JLabel now = new JLabel("");
		now.setOpaque(true);
		now.setBackground(new Color(220, 20, 60));
		now.setBounds(27, 199, 57, 15);
		getContentPane().add(now);
		
		JButton btnNewButton = new JButton("\uAC80\uC0C9");// 검색
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String sql = " select * from member where userid like ? or username like ? ";
				String bb = find.getText();
				try {
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1, "%" + bb + "%");
					ps.setString(2, "%" + bb + "%");
					DefaultTableModel model = new DefaultTableModel();

					ResultSetMetaData meta = ps.getMetaData();
					model.setRowCount(0);

					int cnt = meta.getColumnCount();
					for (int i = 1; i <= cnt; i++) {
						model.addColumn(meta.getColumnName(i));
					}
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						Vector row = new Vector();
						for (int i = 1; i <= cnt; i++) {
							row.add(rs.getString(i));
						}
						model.addRow(row);
					}
					table.setModel(model);
					rs.close();
					ps.close();

				} catch (Exception ex) {

				}

			}
		});
		btnNewButton.setBounds(238, 18, 97, 23);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                now.setText(id);
				ManagerDelete ad = new ManagerDelete(id);  
				
				System.out.println(id);
				
				

			}
		});
		btnNewButton_1.setBounds(425, 375, 110, 23);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uC0DD\uC131");// 생성
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char r;
				String id = mId.getText();
				String pwd = mPwd.getText();
				String name = mName.getText();
				String check = mcheck.getText();
				r=check.charAt(0);
				userDao dao = new userDao();
				userVo vo = new userVo();
				vo.setcId(id);
				vo.setcPwd(pwd);
				vo.setcName(name);
				vo.setcCheck(r);
				dao.Minsert(vo);
				
			}
			
		});
		btnNewButton_2.setBounds(27, 423, 97, 23);
		getContentPane().add(btnNewButton_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 55, 507, 127);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == 1) {
					int row = table.getSelectedRow();
					int columm = table.getSelectedColumn();
					id = table.getValueAt(row, columm).toString();
					
				}
				String sql = " select * from LOGINLOG where UserId = ? ";
				try {
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1, id);
					DefaultTableModel model = new DefaultTableModel();
					ResultSetMetaData meta = ps.getMetaData();
					model.setRowCount(0);

					int cnt = meta.getColumnCount();
					for (int i = 1; i <= cnt; i++) {
						model.addColumn(meta.getColumnName(i));
					}
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						Vector row = new Vector();
						for (int i = 1; i <= cnt; i++) {
							row.add(rs.getString(i));
						}
						model.addRow(row);
					}
					table_1.setModel(model);
					rs.close();
					ps.close();
				} catch (Exception ex) {

				}

			}
		});
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(27, 355, 57, 15);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(27, 380, 57, 15);
		getContentPane().add(lblNewLabel_2);

		mPwd = new JTextField();
		mPwd.setBounds(96, 352, 116, 21);
		getContentPane().add(mPwd);
		mPwd.setColumns(10);

		mName = new JTextField();
		mName.setBounds(96, 377, 116, 21);
		getContentPane().add(mName);
		mName.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\uBC29\uBB38\uAE30\uB85D");
		lblNewLabel_3.setBounds(27, 222, 57, 15);
		getContentPane().add(lblNewLabel_3);

		JButton btnNewButton_4 = new JButton("\uBE44\uBC00\uBC88\uD638 \uC218\uC815");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pwd = nPwd.getText();
				userDao dao = new userDao();
				
				userVo vo = new userVo();
				vo.setcId(id);
				vo.setcPwd(pwd);
				dao.update(vo);
				System.out.println(id);
				
			}
		});
		btnNewButton_4.setBounds(424, 323, 110, 28);
		getContentPane().add(btnNewButton_4);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(29, 247, 505, 66);
		getContentPane().add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		JLabel lblNewLabel_4 = new JLabel("\uB9E4\uB2C8\uC800 id");
		lblNewLabel_4.setBounds(27, 330, 57, 15);
		getContentPane().add(lblNewLabel_4);

		mId = new JTextField();
		mId.setBounds(96, 327, 116, 21);
		getContentPane().add(mId);
		mId.setColumns(10);
		getContentPane().add(getNPwd());
		getContentPane().add(getA());
		getContentPane().add(getMcheck());
		
		JButton btnNewButton_3 = new JButton("\uB85C\uADF8\uC778\uCC3D");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstFrame_1 ad =new FirstFrame_1();
				setVisible(false);
			}
		});
		btnNewButton_3.setBounds(425, 423, 110, 23);
		getContentPane().add(btnNewButton_3);
		
		

	}
	private JTextField getNPwd() {
		if (nPwd == null) {
			nPwd = new JTextField();
			nPwd.setBounds(312, 327, 86, 21);
			nPwd.setColumns(10);
		}
		return nPwd;
	}
	private JLabel getA() {
		if (a == null) {
			a = new JLabel("\uAD8C\uD55C");
			a.setBounds(27, 405, 57, 15);
		}
		return a;
	}
	private JTextField getMcheck() {
		if (mcheck == null) {
			mcheck = new JTextField();
			mcheck.setBounds(96, 402, 116, 21);
			mcheck.setColumns(10);
		}
		return mcheck;
	}
}

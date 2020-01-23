package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagerFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField mId;
	private JTextField mPwd;
	private JTextField mName;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton button;
	private JLabel label;
	private JTable table;
	private JTable table_1;
	private JTextField nPwd;
	private JLabel lblNewLabel_7;
	private JTextField mcheck;
	String id;
	Connection conn = DBConn.getConn();
	private JLabel aaa;
	private JLabel staa;
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
	
	public void refresh() {  //table�� member ���̺��� �����������
		String sql = " select * from member order by USERNO ";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			ps.close();
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public ManagerFrame() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 366, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getFind());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getScrollPane_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getMId());
		contentPane.add(getMPwd());
		contentPane.add(getMName());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getButton());
		contentPane.add(getLabel());
		contentPane.add(getNPwd());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getMcheck());
		contentPane.add(getAaa());
		contentPane.add(getStaa());
		
		btnNewButton.doClick();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uD68C\uC6D0 \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("Ÿ����_�ֹ��� B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 166, 43);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 56, 328, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD68C\uC6D0 Id/ \uC131\uBA85");
			lblNewLabel_1.setBounds(22, 68, 79, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(113, 65, 116, 21);
			find.setColumns(10);
		}
		return find;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");//�˻�
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sql = " select * from member where userid like ? or username like ? order by userno ";
					String bb = find.getText();
					try {
				    int a =3;
					int b= 3;
						PreparedStatement ps = conn.prepareStatement(sql);
						ps.setString(1, "%" + bb + "%");
						ps.setString(2, "%" + bb + "%");

						ResultSetMetaData meta = ps.getMetaData();

						int cnt = meta.getColumnCount();
						DefaultTableModel model = new DefaultTableModel(cnt,0) {
							public boolean isCellEditable(int row, int column){
								return false;
							}
						};
						model.setRowCount(0);
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
			btnNewButton.setBounds(241, 64, 68, 23);
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 94, 328, 118);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uBE44\uBC00\uBC88\uD638 \uC218\uC815");//��й�ȣ ����
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String pwdCheck = "[\\w!]{4,10}";

					boolean flag = Pattern.matches(pwdCheck, nPwd.getText());

					System.out.println(flag);
					if (flag) {//��й�ȣ ���� ��ưŬ���ϸ� �÷� �ش�id�� yes or no ��ư��
						int result = JOptionPane.showConfirmDialog(ManagerFrame.this, id + " �� ���� �Ͻðڽ��ϱ�?", "Ȯ��",
								JOptionPane.YES_NO_OPTION);
						if (result == JOptionPane.CLOSED_OPTION) {

						} else if (result == JOptionPane.YES_OPTION) {
							String pwd = nPwd.getText();
							ManagerDao dao = new ManagerDao();

							ManagerVo vo = new ManagerVo();
							System.out.println(id + " : 업데이트");
							vo.setcId(id);
							vo.setcPwd(pwd);
							dao.update(vo);         //�÷����� Ŭ���� id�� userdao ������Ʈ�� �ִ´�
							JOptionPane.showMessageDialog(ManagerFrame.this, "��й�ȣ ���� �Ϸ�", "message", JOptionPane.INFORMATION_MESSAGE);  
							refresh();
						}

					} else {
						System.out.println(id + " : 오류");
						JOptionPane.showMessageDialog(ManagerFrame.this, "�ٽ� Ȯ���ϼ���", "message", JOptionPane.ERROR_MESSAGE);
					}

					
					
				}
			});
			btnNewButton_1.setBounds(224, 222, 116, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uBC29\uBB38 \uAE30\uB85D");
			lblNewLabel_2.setBounds(12, 230, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(12, 255, 328, 57);
			scrollPane_1.setViewportView(getTable_1());
		}
		return scrollPane_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB9E4\uB2C8\uC800 ID");
			lblNewLabel_3.setBounds(12, 322, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uBE44\uBC00\uBC88\uD638");
			lblNewLabel_4.setBounds(12, 347, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uC131\uBA85");
			lblNewLabel_5.setBounds(12, 372, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(91, 322, 116, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getMPwd() {
		if (mPwd == null) {
			mPwd = new JTextField();
			mPwd.setBounds(91, 345, 116, 21);
			mPwd.setColumns(10);
		}
		return mPwd;
	}
	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(91, 369, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0DD\uC131");//�Ŵ��� id ���� ��ư
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String idCheck = "\\w{4,10}";
					String pwdCheck = "[\\w!]{4,10}";
					String nameCheck = "[\\w|가-휗]{2,20}";
					String autCheck="[au]";
					String id = mId.getText();
					String pwd = mPwd.getText();
					String name = mName.getText();
					String check = mcheck.getText();

					boolean flag = Pattern.matches(idCheck, id) 
							    && Pattern.matches(pwdCheck, pwd)
	                            && Pattern.matches(nameCheck,name)
	                            && Pattern.matches(autCheck, check);
					// Pattern.matches(nameCheck,mName.getText());
					if (flag) {
						int a=0;
						char r;
						r = check.charAt(0);
						ManagerDao dao = new ManagerDao();
						ManagerVo vo = new ManagerVo();
						vo.setcId(id);
						vo.setcPwd(pwd);
						vo.setcName(name);
						vo.setcCheck(r);
						a=dao.Minsert(vo);
                         if(a==0) {
                        	 JOptionPane.showMessageDialog(ManagerFrame.this, "ID�� �ߺ��Ǿ����ϴ�.", "message", JOptionPane.ERROR_MESSAGE);
                         }else {
                        	 JOptionPane.showMessageDialog(ManagerFrame.this, "ID �����Ϸ�", "message", JOptionPane.INFORMATION_MESSAGE);
                         }
						refresh();
						ManagerFrame.this.id=mId.getText();
						staa.setText(id);
					} else {
						JOptionPane.showMessageDialog(ManagerFrame.this, "�ٽ� Ȯ���ϼ���", "message", JOptionPane.ERROR_MESSAGE);
					}

					
					
				}
			});
			btnNewButton_2.setBounds(50, 422, 68, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uC0AD\uC81C");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					ManagerDelete1 ad = new ManagerDelete1(id, ManagerFrame.this);
					
					ad.toFront();
					
				}
			});
			btnNewButton_3.setBounds(248, 422, 68, 23);
		}
		return btnNewButton_3;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Back");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AdminMain panel = new AdminMain();
					panel.toFront();
					setVisible(false);
				}
			});
			button.setBounds(268, 26, 72, 23);
		}
		return button;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon("C:\\Users\\JHTA\\Dropbox\\semi\\home.PNG"));
			label.setBounds(184, 0, 72, 50);
		}
		return label;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {//table �÷� Ŭ���ϸ� �ش� ������ �ʵ庯�� id�� ����
					if (e.getButton() == 1) {
						int row = table.getSelectedRow();
						int columm = table.getSelectedColumn();
						id = table.getValueAt(row,1).toString();//Ŭ���� id�� sql���� userid�� ��
						staa.setText(id);
					}
					String sql = " select * from Loginlog where UserId = ?  ";
					//table���� Ŭ���� userid�� �α��ηαװ� table_1�� �ѷ���
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
		}
		return table;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
		}
		return table_1;
	}
	private JTextField getNPwd() {
		if (nPwd == null) {
			nPwd = new JTextField();
			nPwd.setBounds(133, 223, 79, 21);
			nPwd.setColumns(10);
		}
		return nPwd;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("\uAD8C\uD55C");
			lblNewLabel_7.setBounds(12, 397, 57, 15);
		}
		return lblNewLabel_7;
	}
	private JTextField getMcheck() {
		if (mcheck == null) {
			mcheck = new JTextField();
			mcheck.setBounds(91, 393, 36, 21);
			mcheck.setColumns(10);
		}
		return mcheck;
	}
	private JLabel getAaa() {
		if (aaa == null) {
			aaa = new JLabel("New label");
			aaa.setBounds(70, 226, 57, 15);
		}
		return aaa;
	}
	private JLabel getStaa() {
		if (staa == null) {
			staa = new JLabel("");
			staa.setBounds(172, 426, 57, 15);
		}
		return staa;
	}
}

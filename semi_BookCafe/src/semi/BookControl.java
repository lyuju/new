package semi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BookControl extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton button;
	private JTable table;
	Connection conn = DBConn.getConn();
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookControl frame = new BookControl();
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
	public BookControl() {

		setVisible(true);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 668, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getFind());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getLblNewLabel_4());
		
		btnNewButton.doClick();
	}

	public void search() { // 占쏙옙회占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
		String sql = " select * from Book   where bookname like ? or author like ? "; // 占쏙옙占쏙옙占쏙옙占싱놂옙 占쏙옙占쌘곤옙 占쏙옙占쏙옙占쏙옙
		String a = find.getText();
		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + a + "%");
			ps.setString(2, "%" + a + "%");
			
			String[] colName = {"책이름", "梨��대�", "����", "異�����", "蹂댁�� 媛���", "媛�寃�"};

			DefaultTableModel model = new DefaultTableModel(colName, 0);

			ResultSetMetaData meta = ps.getMetaData();
			
			int cnt = meta.getColumnCount();
//			for (int i = 1; i <= cnt; i++) {
//
//				model.addColumn(meta.getColumnName(i));
//			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Vector row = new Vector();
				for (int i = 1; i <= cnt; i++) {
					row.add(rs.getString(i));
				}
				model.addRow(row);

			}

			table.setModel(model);// 占쏙옙占싱븝옙 占싱울옙.
			rs.close();
			ps.close();

		} catch (Exception ex) {

		}

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB3C4\uC11C \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타占쏙옙占쏙옙_占쌍뱄옙占쏙옙 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 169, 49);
		}
		return lblNewLabel;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 69, 625, 2);
		}
		return separator;
	}

	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(12, 81, 217, 21);
			find.setColumns(10);
		}
		return find;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC870\uD68C");// 占쏙옙회占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					search();
				}
			});
			btnNewButton.setBounds(241, 80, 97, 23);
		}
		return btnNewButton;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 112, 625, 246);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB3C4\uC11C \uCD94\uAC00");//占쌩곤옙占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BookInsert bi = new BookInsert();
					bi.setVisible(true);
					
				}
			});
			btnNewButton_1.setBounds(108, 397, 97, 23);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uB3C4\uC11C \uC0AD\uC81C");//占쏙옙占쏙옙占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BookDelete bd = new BookDelete();
					bd.setVisible(true);
				}
			});
			btnNewButton_2.setBounds(543, 407, 97, 23);
		}
		return btnNewButton_2;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uB3C4\uC11C \uC218\uC815");//占쏙옙占쏙옙占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BookUpdate bu = new BookUpdate();
					bu.setVisible(true);
				}
			});
			btnNewButton_3.setBounds(328, 401, 97, 23);
		}
		return btnNewButton_3;
	}
	public JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setEnabled(false);
		}
		return table;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/\uB3C4\uC11C \uCD94\uAC002.png")));
			lblNewLabel_1.setBounds(12, 376, 97, 64);
		}
		return lblNewLabel_1;
	}
	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/\uB3C4\uC11C \uC0AD\uC81C1.png")));
			lblNewLabel_2.setBounds(231, 376, 81, 75);
		}
		return lblNewLabel_2;
	}
	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/\uB3C4\uC11C \uC218\uC8153.png")));
			lblNewLabel_3.setBounds(430, 364, 97, 87);
		}
		return lblNewLabel_3;
	}
	public JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("back");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_4.setBounds(540, 30, 97, 23);
		}
		return btnNewButton_4;
	}
	public JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setIcon(new ImageIcon(BookControl.class.getResource("/semiIcon/home.PNG")));
			lblNewLabel_4.setBounds(452, 16, 72, 50);
		}
		return lblNewLabel_4;
	}
}

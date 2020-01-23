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

import javax.swing.ImageIcon;
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

public class GuestSearch extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton button;
	private JSeparator separator;
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	Connection conn = DBConn.getConn();
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuestSearch frame = new GuestSearch();
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
	public GuestSearch() {

		setVisible(true);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 398, 405);
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
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBtnNewButton_1());
		
		btnNewButton.doClick();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB3C4\uC11C \uAC80\uC0C9");
			lblNewLabel.setFont(new Font("타占쏙옙占쏙옙_占쌍뱄옙占쏙옙 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 174, 52);
		}
		return lblNewLabel;
	}

	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 74, 358, 2);
		}
		return separator;
	}

	private JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(22, 86, 210, 21);
			find.setColumns(10);
		}
		return find;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");// 占싯삼옙占쏙옙튼占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sql = " select * from Book   where bookname like ? or author like ? ";
					String a = find.getText();
					try {

						PreparedStatement ps = conn.prepareStatement(sql);
						ps.setString(1, "%" + a + "%");
						ps.setString(2, "%" + a + "%");
						
						String[] colName = {"책이름", "저자", "출판사", "보유 개수"};
						DefaultTableModel model = new DefaultTableModel(colName, 0);

						ResultSetMetaData meta = ps.getMetaData();

						int cnt = meta.getColumnCount();

						ResultSet rs = ps.executeQuery();
						while (rs.next()) {
							Vector row = new Vector();
							
							row.add(rs.getString("BookName"));
							row.add(rs.getString("Author"));
							row.add(rs.getString("Publishing"));
							row.add(rs.getString("count"));
							
							model.addRow(row);
						}

						table.setModel(model);
						rs.close();
						ps.close();

					} catch (Exception ex) {

					}
				}
			});
			btnNewButton.setBounds(244, 85, 97, 23);
		}
		return btnNewButton;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 125, 358, 232);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	public JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(GuestSearch.class.getResource("/semiIcon/home.PNG")));
			lblNewLabel_1.setBounds(221, 10, 70, 52);
		}
		return lblNewLabel_1;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//AdminMain panel = new AdminMain();
					//panel.toFront();
					//setVisible(false);
				}
			});
			btnNewButton_1.setBounds(293, 31, 77, 23);
		}
		return btnNewButton_1;
	}
}

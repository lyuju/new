package semi;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

import m_jdbc.DBConn;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Query extends JInternalFrame {

	Connection conn = DBConn.getConn();
	private JPanel panel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query frame = new Query();
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
	public Query() {
		super("QueryBox", true, true, true, true);
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameClosing(InternalFrameEvent arg0) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		setVisible(true);
		setBounds(100, 100, 449, 300);
		getContentPane().add(getPanel(), BorderLayout.NORTH);
		getContentPane().add(getScrollPane(), BorderLayout.CENTER);

	}

	public void select() {
		String sql = textField.getText();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSetMetaData meta = ps.getMetaData();
			DefaultTableModel model = new DefaultTableModel();

			int cnt = meta.getColumnCount();
			for (int i=1; i<=cnt; i++) {
				model.addColumn( meta.getColumnName(i));
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
                  Vector row = new Vector();
                  for(int i =1; i<=cnt; i++) {
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

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 30));
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnNewButton(), BorderLayout.EAST);
			panel.add(getTextField(), BorderLayout.CENTER);
		}
		return panel;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("RUN");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
		}
		return btnNewButton;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent ev) {
					if (ev.getKeyCode() == KeyEvent.VK_ENTER) {
						select();
					}
				}
			});

			textField.setColumns(10);

		}
		return textField;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
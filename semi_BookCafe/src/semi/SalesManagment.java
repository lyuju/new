package semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.knowm.xchart.XChartPanel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SpringLayout.Constraints;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import com.toedter.calendar.JDateChooser;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class SalesManagment extends JFrame {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DecimalFormat df = new DecimalFormat("##,###,###");
	SalesDao dao = new SalesDao();
	ButtonGroup bg = new ButtonGroup();
	// 洹몃������ x異�, y異� ��蹂대�� �댁�� 由ъ�ㅽ��
	List<String> xAxis = null;
	List<Integer> yPrice = null;
	List<Integer> yProfit = null;
	// ���대��� ������ ��蹂대�� �댁�� model
	String[] colNames = {"날짜", "이용자 수", "총 매출액", "순이익"};
    DefaultTableModel model = null; // 而щ�쇨� �ㅼ��
    
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnSearch;
	private JSeparator separator_1;
	private JButton btnSalesSearch;
	private JButton btnDelete;
	private JButton btnInsert;
	private JPanel panel;
	private JPanel panel_1;
	private JSeparator separator_2;
	private JLabel label;
	private JButton btnBack;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JRadioButton rdoDay;
	private JRadioButton rdoMonth;
	private JRadioButton rdoYear;
	private JLabel label_1;
	private JLabel label_2;
	private JSeparator separator;
	private JTextField txtProfit;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField txtTotalPrice;
	private JTextField txtTotalOrder;
	private JLabel label_5;
	private JLabel label_6;
	private JTextField txtTotalUser;
	private JSeparator separator_3;
	private JLabel label_7;
	private JDateChooser txtDate;
	private JDateChooser txtMinDate;
	private JDateChooser txtMaxDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesManagment frame = new SalesManagment();
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
	public SalesManagment() {
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 446, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnSearch());
		contentPane.add(getSeparator_1());
		contentPane.add(getBtnSalesSearch());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnInsert());
		contentPane.add(getPanel_2());
		contentPane.add(getPanel_1_1());
		contentPane.add(getSeparator_2());
		contentPane.add(getLabel());
		contentPane.add(getBtnBack());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTxtDate());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dao.connClose();
			}
		});
	}
	
	// textField�� ���ㅽ�몃�� format�� 媛�吏�怨� �ㅼ���댁＜�� �⑥��
	private void dataFormat(Date dt) {		
		SalesVo vo = dao.search(dt);

		txtTotalUser.setText(df.format(vo.getTotalUser()));
		txtTotalOrder.setText(df.format(vo.getTotalOrder()));
		txtTotalPrice.setText(df.format(vo.getTotalPrice()));
		txtProfit.setText(df.format(vo.getProfit()));
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uB9E4\uCD9C \uAD00\uB9AC");
			lblNewLabel.setFont(new Font("타占쏙옙占쏙옙_占쌍뱄옙占쏙옙 B", Font.BOLD, 35));
			lblNewLabel.setBounds(12, 10, 161, 61);
		}
		return lblNewLabel;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("\uC870\uD68C");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Date dt = txtDate.getDate(); // ��吏� ��蹂� 諛����ㅺ린
					if(dt != null) {
						dataFormat(dt);
					}
					else {
						JOptionPane.showMessageDialog(null, "議고���� ��吏�瑜� �����댁＜�몄��.");
					}
					
				}
			});
			btnSearch.setBounds(158, 91, 67, 23);
		}
		return btnSearch;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setForeground(new Color(255, 140, 0));
			separator_1.setBackground(new Color(255, 140, 0));
			separator_1.setBounds(12, 283, 406, 2);
		}
		return separator_1;
	}
	private JButton getBtnSalesSearch() {
		if (btnSalesSearch == null) {
			btnSalesSearch = new JButton("\uB9E4\uCD9C \uC870\uD68C");
			btnSalesSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Date minDate = txtMinDate.getDate();
					Date maxDate = txtMaxDate.getDate();
					
					if(minDate == null || maxDate == null) {
						JOptionPane.showMessageDialog(null, "議고���� 湲곌��� �����댁＜�몄��.");
						return;
					}
					if(maxDate.compareTo(minDate) < 0) { // minDate媛� maxDate蹂대�� �ш굅�� 媛��� �� ����
						JOptionPane.showMessageDialog(null, "湲곌� ����媛��� ���명�댁＜�몄��");
						return;
					}
					model =  new DefaultTableModel(colNames, 0);
					String flag = "";
					List<SalesVo> listVo = null;
					SimpleDateFormat sdfflag = null;
					
					
					if(rdoDay.isSelected()) {
						flag = "일별";
						sdfflag = new SimpleDateFormat("yyyy-MM-dd");
					}
					else if(rdoMonth.isSelected()) {
						flag = "월별";
						sdfflag = new SimpleDateFormat("yyyy-MM");
					}
					else {
						flag = "년별";
						sdfflag = new SimpleDateFormat("yyyy");
					}
					listVo = dao.select(minDate, maxDate, flag);
					
					// DB���� 媛��몄�� �곗�댄�� ����
					if(listVo != null) {
						xAxis = new ArrayList<>();
						yPrice = new ArrayList<>();
						yProfit = new ArrayList<>();
						
						for(int i = 0 ; i < listVo.size() ; i++) {
							SalesVo vo = listVo.get(i);
							
							// 洹몃���� x, y異� ��蹂� ����
							xAxis.add(sdfflag.format((vo.getAdjustmentDT())));
							yPrice.add(vo.getTotalPrice());
							yProfit.add(vo.getProfit());
							// ���대� ��蹂� ����
						    model.addRow(new Object[] {xAxis.get(i), df.format(vo.getTotalUser()),
						    		df.format(yPrice.get(i)), df.format(yProfit.get(i))});
						}
						
					}
					
					// 媛� 湲곌�蹂� �곗�댄�곕�� 蹂댁�ъ＜�� ���대�怨� 洹몃���� 洹몃━湲�
					javax.swing.SwingUtilities.invokeLater(
					        new Runnable() {

					          @Override
					          public void run() {

					            createAndShowGUI(xAxis, yPrice, yProfit);
					          }
					        });
				}
			});
			btnSalesSearch.setBounds(309, 435, 97, 23);
		}
		return btnSalesSearch;
	}
	private void createAndShowGUI(List<String> x, List<Integer> yPrice, List<Integer> yProfit) {
		// Create and set up the window.
	    JFrame frame = new JFrame("湲곌�蹂� 留ㅼ� 議고��");
	    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    JPanel subPane = new JPanel();
		frame.setContentPane(subPane);
		subPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		subPane.setLayout(null);
		
		// �쇰꺼 異�媛�
		JLabel lblTitle = new JLabel("湲곌�蹂� 留ㅼ�, ���댁��");
		lblTitle.setBounds(10, 0, 200, 40);
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 20));
		subPane.add(lblTitle);
		
		// 洹몃���� 異�媛�
		JPanel chartPanel = new XChartPanel(new DrawChart(x, yPrice, yProfit).getChart());
	    chartPanel.setSize(1000,500);
	    chartPanel.setLocation(15, 45);
	    subPane.add(chartPanel);
	    
	    // ���대� 異�媛�
	    JScrollPane tablepanel = new JScrollPane();
	    tablepanel.setSize(400,500);
	    tablepanel.setLocation(1020, 45);
	    
	    JTable table = new JTable(model);
	    tablepanel.setViewportView(table);
	    tablepanel.updateUI();
	    subPane.add(tablepanel);

	    
	    // Display the window.
	    frame.setSize(1460, 590);
	    frame.setVisible(true);
	  }
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("\uAE30\uB85D \uBC31\uC5C5");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// �������쇰� 紐⑤�� �곗�댄�� ����
					String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HHmmss"));
					CreateFile cf = new CreateFile();
					boolean result = cf.createFile(currentDate, colNames);
					
					// ���쇱�� ���� ���λ��硫� ���� ��吏�濡�遺��� 1�� �댁���� ���λ�� �곗�댄�� ����
					if(result) {
						int cnt = dao.delete();
						if(cnt > 0) {
							JOptionPane.showMessageDialog(null, "�곗�댄�곌� C:\\txtBackUp\\ 寃쎈��� 諛깆�� �����듬����.");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "���� ���� 以� �ㅻ� 諛���");
					}
					
				}
			});
			btnDelete.setBounds(321, 229, 97, 23);
		}
		return btnDelete;
	}
	private JButton getBtnInsert() {
		if (btnInsert == null) {
			btnInsert = new JButton("\uAE30\uB85D \uC800\uC7A5");
			btnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// �レ���� format ��嫄곕�� ���� , ��嫄�
					int totUser = Integer.parseInt(txtTotalUser.getText().replaceAll(",", ""));
					int totPrice = Integer.parseInt(txtTotalPrice.getText().replaceAll(",", ""));
					int profit = Integer.parseInt(txtProfit.getText().replaceAll(",", ""));
					Date aDT = new Date(); // ���� ���� ��媛� ����
					
					SalesVo vo = new SalesVo(totUser, totPrice, profit, aDT);
					int result = dao.insert(vo);
					if(result > 0) {
						JOptionPane.showMessageDialog(null, "�������쇰� ���λ�����듬����.");
					}
					else {
						JOptionPane.showMessageDialog(null, "���� 以� �ㅻ� 諛���");
					}
					
				}
			});
			btnInsert.setBounds(321, 139, 97, 23);
		}
		return btnInsert;
	}
	private JPanel getPanel_2() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(12, 124, 213, 148);
			panel.setLayout(null);
			panel.add(getTxtProfit());
			panel.add(getLabel_3());
			panel.add(getLabel_4());
			panel.add(getTxtTotalPrice());
			panel.add(getTxtTotalOrder());
			panel.add(getLabel_5());
			panel.add(getLabel_6());
			panel.add(getTxtTotalUser());
			panel.add(getSeparator_3());
			panel.add(getLabel_7());
		}
		return panel;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(12, 295, 249, 130);
			panel_1.setLayout(null);
			panel_1.add(getRdoDay());
			panel_1.add(getRdoMonth());
			panel_1.add(getRdoYear());
			panel_1.add(getLabel_1());
			panel_1.add(getLabel_2());
			panel_1.add(getSeparator());
			panel_1.add(getTxtMinDate());
			panel_1.add(getTxtMaxDate());
		}
		return panel_1;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setForeground(new Color(255, 140, 0));
			separator_2.setBackground(new Color(255, 140, 0));
			separator_2.setBounds(12, 73, 406, 2);
		}
		return separator_2;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("New label");
			label.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/home.PNG")));
			label.setBounds(178, 10, 72, 50);
		}
		return label;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnBack.setBounds(258, 35, 72, 23);
		}
		return btnBack;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/\uC800\uC7A51.png")));
			lblNewLabel_1.setBounds(227, 120, 82, 61);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/\uC815\uBCF4 \uC0AD\uC81C1.png")));
			lblNewLabel_2.setBounds(237, 191, 72, 82);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon(SalesManagment.class.getResource("/semiIcon/\uB9E4\uCD9C\uC870\uD68C1.png")));
			lblNewLabel_3.setBounds(288, 309, 130, 116);
		}
		return lblNewLabel_3;
	}
	private JRadioButton getRdoDay() {
		if (rdoDay == null) {
			rdoDay = new JRadioButton("\uC77C\uBCC4");
			rdoDay.setBackground(Color.WHITE);
			rdoDay.setBounds(26, 70, 54, 23);
			
			rdoDay.setSelected(true);
			bg.add(rdoDay);
		}
		return rdoDay;
	}
	private JRadioButton getRdoMonth() {
		if (rdoMonth == null) {
			rdoMonth = new JRadioButton("\uC6D4\uBCC4");
			rdoMonth.setBackground(Color.WHITE);
			rdoMonth.setBounds(102, 70, 54, 23);
			
			bg.add(rdoMonth);
		}
		return rdoMonth;
	}
	private JRadioButton getRdoYear() {
		if (rdoYear == null) {
			rdoYear = new JRadioButton("\uB144\uBCC4");
			rdoYear.setBackground(Color.WHITE);
			rdoYear.setBounds(179, 70, 54, 23);
			
			bg.add(rdoYear);
		}
		return rdoYear;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("~");
			label_1.setBounds(122, 102, 16, 15);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("\uAE30\uAC04");
			label_2.setFont(new Font("Dialog", Font.BOLD, 15));
			label_2.setBounds(12, 10, 30, 21);
		}
		return label_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(new Color(255, 140, 0));
			separator.setBackground(new Color(255, 140, 0));
			separator.setBounds(12, 49, 222, 2);
		}
		return separator;
	}
	private JTextField getTxtProfit() {
		if (txtProfit == null) {
			txtProfit = new JTextField();
			txtProfit.setEnabled(false);
			txtProfit.setColumns(10);
			txtProfit.setBounds(90, 117, 116, 21);
		}
		return txtProfit;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uCD1D \uC218\uC775 :");
			label_3.setBounds(12, 120, 66, 15);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uCD1D \uB9E4\uCD9C\uC561 :");
			label_4.setBounds(12, 95, 66, 15);
		}
		return label_4;
	}
	private JTextField getTxtTotalPrice() {
		if (txtTotalPrice == null) {
			txtTotalPrice = new JTextField();
			txtTotalPrice.setEnabled(false);
			txtTotalPrice.setColumns(10);
			txtTotalPrice.setBounds(90, 92, 116, 21);
		}
		return txtTotalPrice;
	}
	private JTextField getTxtTotalOrder() {
		if (txtTotalOrder == null) {
			txtTotalOrder = new JTextField();
			txtTotalOrder.setEnabled(false);
			txtTotalOrder.setColumns(10);
			txtTotalOrder.setBounds(90, 67, 116, 21);
		}
		return txtTotalOrder;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uC8FC\uBB38 \uAC74\uC218 :");
			label_5.setBounds(12, 70, 66, 15);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("\uC774\uC6A9\uC790 \uC218 :");
			label_6.setBounds(12, 45, 66, 15);
		}
		return label_6;
	}
	private JTextField getTxtTotalUser() {
		if (txtTotalUser == null) {
			txtTotalUser = new JTextField();
			txtTotalUser.setEnabled(false);
			txtTotalUser.setColumns(10);
			txtTotalUser.setBounds(90, 42, 116, 21);
		}
		return txtTotalUser;
	}
	private JSeparator getSeparator_3() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
			separator_3.setForeground(new Color(255, 140, 0));
			separator_3.setBackground(new Color(255, 140, 0));
			separator_3.setBounds(12, 33, 194, 2);
		}
		return separator_3;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("\uC77C\uC77C\uD310\uB9E4 \uAE30\uB85D");
			label_7.setFont(new Font("Dialog", Font.BOLD, 15));
			label_7.setBounds(12, 10, 97, 21);
		}
		return label_7;
	}
	private JDateChooser getTxtDate() {
		if (txtDate == null) {
			txtDate = new JDateChooser();
			txtDate.addPropertyChangeListener(new PropertyChangeListener() {
				public void propertyChange(PropertyChangeEvent evt) {
					
					if(evt.getPropertyName() == "date") {
						btnSearch.doClick();
					}
				
				}	
			});
			txtDate.setBounds(12, 93, 134, 21);
			
			Date dt = new Date();
			txtDate.setDate(dt);
			dataFormat(dt);
		}
		return txtDate;
	}
	private JDateChooser getTxtMinDate() {
		if (txtMinDate == null) {
			txtMinDate = new JDateChooser();
			txtMinDate.setBounds(12, 99, 98, 21);
		}
		return txtMinDate;
	}
	private JDateChooser getTxtMaxDate() {
		if (txtMaxDate == null) {
			txtMaxDate = new JDateChooser();
			txtMaxDate.setBounds(139, 99, 94, 21);
		}
		return txtMaxDate;
	}
}

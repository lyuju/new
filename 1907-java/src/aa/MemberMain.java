package aa;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MemberMain extends JFrame {
	Map<String,List<ScoreVo>> map = new HashMap<String,List<ScoreVo>>();
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmTreemap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMain frame = new MemberMain();
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
	public MemberMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ScoreVo sVo= new ScoreVo("1","kim","중간",1,90,90,90);	
		List<ScoreVo> list1= new ArrayList<ScoreVo>();
		list1.add(sVo);
		list1.add(new ScoreVo("1","kim","기말",1,80,70,60));
		list1.add(new ScoreVo("1","kim","기말",2,50,60,70));
		
		map.put("1",list1);	
		
		list1= new ArrayList<ScoreVo>();
		list1.add(new ScoreVo("2","lee","중간",3,50,60,50));
		list1.add(new ScoreVo("2","lee","기말",3,40,30,40));
		
		map.put("2",list1);
		
		list1= new ArrayList<ScoreVo>();
		list1.add(new ScoreVo("3","hong","중간",2,10,10,10));
		list1.add(new ScoreVo("3","hong","기말",2,10,10,10));
		list1.add(new ScoreVo("3","hong","중간",3,80,90,85));
		
		map.put("3", list1);
		
	}
	
	
	
	

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uC131\uC801\uAD00\uB9AC");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC785\uB825");//입력
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreInput a= new ScoreInput(map,MemberMain.this);
					contentPane.add(a);
					
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC870\uD68C");//조회
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreSearch a = new ScoreSearch(map);
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("\uAE30\uD0C0 \uCEEC\uB809\uC158");
			mnNewMenu_1.add(getMntmNewMenuItem_2());
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getMntmTreemap());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
			mnNewMenu_1.add(getMntmNewMenuItem_5());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Properties");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					PropertiesFrame a = new PropertiesFrame();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("TreeSet");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TreeSetFrame a= new TreeSetFrame();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("Stack");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StackFrame a= new StackFrame();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("Queue");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					QueueFrame a= new QueueFrame();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmTreemap() {
		if (mntmTreemap == null) {
			mntmTreemap = new JMenuItem("TreeMap");
			mntmTreemap.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TreeMapFrame a= new TreeMapFrame();
					contentPane.add(a);
					a.toFront();
				}
			});
		}
		return mntmTreemap;
	}
}

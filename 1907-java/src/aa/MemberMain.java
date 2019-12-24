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
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("New menu");
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
					ScoreInput a= new ScoreInput(map);
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
}

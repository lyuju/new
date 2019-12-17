package h_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import h_api2.Student;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;
import java.awt.event.ActionEvent;

public class GetPropertyExam extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public void view() {
		String msg = "";
		
		String osName = System.getProperty("os.name");
		msg += "�ü�� �̸� : " + osName + "\n";
		msg += "����� �̸� : " + System.getProperty("user.name") + "\n";
		msg += "����� Ȩ : " + System.getProperty("user.home") + "\n";
		msg += "----------------------------\n";
		msg += " [key] value \n";
		msg += "----------------------------\n";
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			msg +="[" + key +"]" + value+ "\n";
			msg +=String.format("[%s] %s \n", key, value);
		}
		textArea.setText(msg);
	}
	
	public void viewClass() {
		String msg = "";
		Student st = new Student(0);
		Class cls = st.getClass();
		msg +="class name : " + cls.getName() + "\n";
		msg += "class name : " + cls.getSimpleName() + "\n";
		msg += "package name : " + cls.getPackage().getName() + "\n";
		msg += "---------------------------------------\n";
		try {
			Class cls2 = Class.forName("h_api.Student");
			msg += "class full name : " + cls2.getName()+"\n";
			msg += "class name : " + cls2.getSimpleName() +"\n";
			msg += "package name : " + cls2.getPackage().getName()+"\n";
			msg += "------------------------------------------------\n";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void viewReflect() {
		String msg = "";
		Class cls = null;
		try {
			cls = Class.forName("h_api.Student");
		}catch{
			
		}
		msg += "[Ŭ������]" + cls.getName() +"\n";
		
		msg += "[������ ����] \n";
		Constructor[] constructors = cls.getDeclaredConstructors();
		for(Constructor c : constructors) {
			msg += "������ �̸� : " + (c.getName() +"(");
			Class [] parameters = c.getParameterTypes();
			msg += printparameters(parameters);
			msg += ")";
		}
		
		msg +="[�ʵ�����]\n";
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields) {
			msg += field.getType().getSimpleName() + " " + field.getName(); 
		}
		
		Method[] methods = cls.getDeclaredMethods();
		for(Mathod method : methods) {
			msg += m.getName() +"(";
		}
				
		
	}
	
	
	private String printparameters(Class[] parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetPropertyExam frame = new GetPropertyExam();
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
	public GetPropertyExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(255, 140, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.NORTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC18D\uC131\uBCF4\uAE30");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					view();
				}
			});
		}
		return btnNewButton;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("CLASS");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewClass();
				}
			});
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uB9AC\uD50C\uB809\uC158");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewReflect();
				}
			});
		}
		return btnNewButton_2;
	}
}

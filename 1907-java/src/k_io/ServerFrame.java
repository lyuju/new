package k_io;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ServerFrame extends JFrame implements Runnable {

	ServerSocket server;

	HTMLEditorKit kit = new HTMLEditorKit();
	HTMLDocument doc = new HTMLDocument();

	List<ServerThread> clients = new ArrayList<ServerThread>();
	
    DefaultListModel<String> model = new DefaultListModel<String>();
    
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField port;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_1;
	private JTextPane textPane;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_3;
	private JTextField textField_1;
	private JTextField message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerFrame frame = new ServerFrame();
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
	public ServerFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				serverStop();
			}
		});
		setTitle("\uCC44\uD305 \uC11C\uBC84");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getPort());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getComboBox());
		
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getMessage());
		
	}

	@Override

	public void run() {

		try {
			int p = Integer.parseInt(port.getText());
			server = new ServerSocket(p);
			String html = "<font size ='5' color ='#690990'>서버가 시작됨</font>";
			kit.insertHTML(doc, doc.getLength(), html, 0, 0, null);

			while (true) {
				html = "[클라이언트 접속 대기중]";
				kit.insertHTML(doc, doc.getLength(), html, 0, 0, null);

				Socket ClientSocket = server.accept();
				ServerThread st = new ServerThread(ServerFrame.this, ClientSocket);
				//serverThread readObject하는게 중요한 역할
				st.start();
				clients.add(st);
                
				InetSocketAddress addr = (InetSocketAddress) ClientSocket.getRemoteSocketAddress();

				html = "<div style = 'border:1px solid #ff0000;padding:5px;width:150px'>"
						+ addr.getAddress().getHostAddress() + "님이 접속함" + "</div>";
				kit.insertHTML(doc, doc.getLength(), html, 0, 0, null);

				textPane.scrollRectToVisible(new Rectangle(0, textPane.getHeight() + 100, 1, 1));
			}

		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}
	
	public void send() {//enter,전송
		ChattData cd = new ChattData();
		cd.setmId("SERVER");
		cd.setCommand(ChattData.MESSAGE);
		cd.setMessage(message.getText());
		if(comboBox.getSelectedIndex()==0){
        sendAll(cd);		
		}else {
		int[] indexs = getList().getSelectedIndices();
		sendAll(cd,indexs);
		}
	}
	public void sendAll(ChattData cd) {
		for(ServerThread st : clients) {
			try {
				st.oos.writeObject(cd);
				st.oos.flush();
				
			}catch(Exception ex) {
				
			}
		}
		
	}
	
	public void sendAll(ChattData cd,int[] to) {//귓속말
		for(int i =0; i<to.length;i++) {
			ServerThread st = clients.get(to[i]);
			try {
			st.oos.writeObject(cd);
			st.oos.flush();
			}catch(Exception ex) {
				
			}
		}
		
		
		
	}
	
	
	//모든 유저들에게 서버 종료 통보(GETOUT)
	//clients의 ServerThread를 종료
	//접속자목록을 모두 제거
	//serverSocket 종료
	public void serverStop() {
		ChattData cd = new ChattData();
		cd.setCommand(ChattData.GETOUT);
		cd.setmId("SERVER");
		sendAll(cd);
		
		clients.clear();
		clients = new ArrayList<ServerThread>();
		
		model.clear();
		
		try {
			server.close();
			server = null;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("IP");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(41, 7, 116, 21);
			textField.setColumns(10);

			try {
				InetAddress local = InetAddress.getLocalHost();
				textField.setText(local.getHostAddress());
			} catch (Exception ex) {

			}

		}
		return textField;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("PORT");
			lblNewLabel_1.setBounds(182, 10, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getPort() {
		if (port == null) {
			port = new JTextField();
			port.setText("4444");
			port.setBounds(251, 7, 116, 21);
			port.setColumns(10);
		}
		return port;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC2DC\uC791");
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setBackground(new Color(220, 20, 60));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Thread t = new Thread(ServerFrame.this);// Runnable 타입
					t.start();
					btnNewButton.setEnabled(false);
					btnNewButton_1.setEnabled(true);

				}
			});
			btnNewButton.setBounds(370, 6, 73, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC885\uB8CC");//종료
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					serverStop();
					btnNewButton_1.setEnabled(false);
					btnNewButton.setEnabled(true);
				}
			});
			btnNewButton_1.setBounds(446, 6, 76, 23);
		}
		return btnNewButton_1;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 47, 158, 244);
			scrollPane.setViewportView(getList());
			scrollPane.setColumnHeaderView(getLblNewLabel_2());
		}
		return scrollPane;
	}

	private JList getList() {
		if (list == null) {
			list = new JList();
			list.setModel(model);
		}
		return list;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC811\uC18D\uC790 \uBAA9\uB85D");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_2;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(171, 47, 325, 289);
			scrollPane_1.setViewportView(getTextPane());
			scrollPane_1.setColumnHeaderView(getLblNewLabel_3());
		}
		return scrollPane_1;
	}

	public JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setContentType("text/html");
			textPane.setEditorKit(kit);
			textPane.setDocument(doc);
		}
		return textPane;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC15\uD1F4");//강퇴
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Object[] indexs = getList().getSelectedValues();
					ChattData cd = new ChattData();
					cd.setCommand(ChattData.GETOUT);
					cd.setmId("SERVER");
					List<String> users = new ArrayList<String>();
					for(int i =0; i<indexs.length;i++) {
						users.add((String)indexs[i]);
					}
					cd.setUsers(users);
					sendAll(cd);
					
				}
			});
			btnNewButton_2.setBounds(12, 313, 73, 23);
		}
		return btnNewButton_2;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("\uD574\uC81C");//해제
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getList().clearSelection();
					
				}
			});
			btnNewButton_3.setBounds(94, 313, 73, 23);
		}
		return btnNewButton_3;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(12, 350, 158, 21);
			comboBox.addItem("전  체");
			comboBox.addItem("귓속말");
		}
		return comboBox;
	}

	

	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("\uC804\uC1A1");//전송
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					send();
					
				}
			});
			btnNewButton_4.setBounds(399, 349, 97, 23);
		}
		return btnNewButton_4;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uBA54\uC2DC\uC9C0");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_3;
	}
	private JTextField getMessage() {
		if (message == null) {
			message = new JTextField();
			message.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_ENTER) {
						send();
					}
				}
			});
			message.setBounds(195, 346, 172, 21);
			message.setColumns(10);
		}
		return message;
	}
}

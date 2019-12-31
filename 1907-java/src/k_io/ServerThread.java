package k_io;

import java.awt.Rectangle;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread {
	ServerFrame frame;
	Socket socket;

	ObjectOutputStream oos;//������ ����
	ObjectInputStream ois;

	public ServerThread(ServerFrame frame, Socket socket) {
		this.frame = frame;
		this.socket = socket;

	}

	@Override
	public void run() {
		System.out.println("������ ����");
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
			while (true) {
				//Object obj= ois.readObject();
				
				ChattData cd = (ChattData)ois.readObject();
				String html = "";
				
				switch (cd.getCommand()) {
				case ChattData.LOGIN:
					html = cd.getmId() + "���� �����Ͽ����ϴ�.";
					frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);
					//���� �ڽŰ� ����� oos���� ���� ������ ����� ����
					ChattData cd2 = new ChattData();
					List<String> users = new ArrayList<String>();
					for(int i =0 ; i<frame.model.size();i++) {
						users.add(frame.model.get(i));
					}
					cd2.setCommand(ChattData.LOGIN);
					cd2.setUsers(users);
					oos.writeObject(cd2);
					oos.flush();
					
					//�ڽ��� ���̵� model�� �߰�
					frame.model.addElement(cd.getmId());
					//��� �����ڿ��� ���� �ڽ��� ���̵� ����
					users.clear();
					users.add(cd.getmId());
					cd2.setUsers(users);
					sendAll(cd2);
					break;
					
				case ChattData.MESSAGE:
					html = "<div style = 'border:1px solid #6666ff; padding:3px;"
					      +"background-color:#ffff00'>"
						  +cd.toString()
						  +"</div>";
					
					
					frame.kit.insertHTML(frame.doc, frame.doc.getLength(), html, 0, 0, null);

					sendAll(cd);
					
					break;
					
				}
				frame.getTextPane().scrollRectToVisible(new Rectangle(0, frame.getTextPane().getHeight() + 100, 1, 1));
				
			}

		} catch (Exception ex) {
			
		}

	}
	
	public void sendAll(ChattData cd) throws Exception{
		for(ServerThread st : frame.clients) {
			st.oos.writeObject(cd);
			st.oos.flush();
		}
		
	}

}

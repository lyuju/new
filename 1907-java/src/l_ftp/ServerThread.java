package l_ftp;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerThread extends Thread{
	
	Socket socket;
	InputStream is;
	ObjectInputStream ois;
	FileOutputStream fos;
	String fileName;
	

	public ServerThread(Socket s) {
	 this.socket=s;	
	}
	//클라이언트로부 파일목록만 전달받음 파일트랜스퍼로 추가하고 그때 클라이언트에게 전송커맨드를 날림
	@Override
	public void run() {
		try {
			is= socket.getInputStream();
			ois=new ObjectInputStream(is);
			while(true) {
				Object obj = ois.readObject();
			}
		}catch(Exception ex) {
			
		}
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}

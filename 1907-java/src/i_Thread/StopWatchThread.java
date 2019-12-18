package i_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class StopWatchThread implements Runnable{
	
	JButton btnNewButton;
	
	public StopWatchThread(JButton btnNewButton) {
		this.btnNewButton=btnNewButton;
	}
	
	
	

	boolean a =true;
	public void run() {
		
		while(a) {
			SimpleDateFormat format1 = new SimpleDateFormat ( "ss");
	        Date time = new Date();
	        btnNewButton.setText(format1.format(time));
	        try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
	        
		
		
		}
	
	}
 
 

}
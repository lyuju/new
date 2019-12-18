package i_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class Watch extends Thread {
	JTextField seconttext;
	public Watch(JTextField seconttext) {
		this.seconttext=seconttext;
	}
	
	
	boolean a =true;
	public void run() {
		
		while(a) {
			SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd-<E> HH:mm:ss");
	        Date time = new Date();
	        seconttext.setText(format1.format(time));
	      
	       
	      // System.out.println(time1);
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}
	
	
        
	
	
	
	
}

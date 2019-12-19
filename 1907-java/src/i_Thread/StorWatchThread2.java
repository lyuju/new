package i_Thread;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class StorWatchThread2 extends JPanel implements Runnable {
	boolean stop =false;
	private JLabel timeLabel;
	
	
	
	/**
	 * Create the panel.
	 */
	
	
	
   public StorWatchThread2() {
		setLayout(new BorderLayout(0, 0));
		add(getTimeLabel(), BorderLayout.CENTER);
		
	}

	
	
	public void run() {
		DecimalFormat df = new DecimalFormat("###,###.000");
		long begin = new Date().getTime();
		while(!stop) {
		    long end = new Date().getTime()-begin;
			
	        try {
				Thread.sleep(1);
			} catch (InterruptedException e) {}
	        timeLabel.setText(df.format(end/1000.0));
		}
	}
	        
	
	
	private JLabel getTimeLabel() {
		if (timeLabel == null) {
			timeLabel = new JLabel("stop watch");
			timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return timeLabel;
	}
}

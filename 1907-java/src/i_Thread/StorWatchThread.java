package i_Thread;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.SwingConstants;


public class StorWatchThread extends JPanel implements Runnable {
	boolean stop =false;
	private JLabel timeLabel;
	
	
	
	/**
	 * Create the panel.
	 */
	
	
	
   public StorWatchThread() {
		setLayout(new BorderLayout(0, 0));
		add(gettimeLabel, BorderLayout.CENTER);
		add(getTimeLabel(), BorderLayout.CENTER);
		
	}

	boolean a =true;
	private JLabel timeLabel;
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
	        
	private JLabel getLblNewLabel2() {
		if (lblNewLabel2 == null) {
			lblNewLabel2 = new JLabel("stop watch");
			lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel2;
	}
	private JLabel getTimeLabel() {
		if (timeLabel == null) {
			timeLabel = new JLabel("New label");
		}
		return timeLabel;
	}
}

package i_Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;

public class DateTimeThread extends Thread {
	JTextField watch;

	public DateTimeThread(JTextField watch) {
		this.watch = watch;
	}

	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		while (true) {
			watch.setText(sdf.format(new Date()));

			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
			}

		}

	}

}

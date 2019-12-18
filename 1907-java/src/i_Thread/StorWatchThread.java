package i_Thread;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class StorWatchThread extends JPanel implements Runnable {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public StorWatchThread() {
		setLayout(new BorderLayout(0, 0));
		add(getLblNewLabel(), BorderLayout.CENTER);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("stop watch");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
}

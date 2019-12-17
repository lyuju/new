package h.ka;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class BoardInput1 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardInput1 frame = new BoardInput1();
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
	public BoardInput1() {
		setBounds(100, 100, 450, 300);

	}

}

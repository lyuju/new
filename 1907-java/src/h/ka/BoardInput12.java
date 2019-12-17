package h.ka;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class BoardInput12 extends JInternalFrame {
	private JTextField no;
	private JTextField subject;
	private JTextField content;
	private JTextField mId;
	private JTextField mDate;
	private JTextField cnt;
	private JButton btnNewButton;
	private JLabel status;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardInput12 frame = new BoardInput12();
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
	public BoardInput12() {
		super("Decimal Foramt",true,true,true,true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getNo());
		getContentPane().add(getSubject());
		getContentPane().add(getContent());
		getContentPane().add(getMId());
		getContentPane().add(getMDate());
		getContentPane().add(getCnt());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getStatus());
		setVisible(true);


	}
	private JTextField getNo() {
		if (no == null) {
			no = new JTextField();
			no.setColumns(10);
			no.setBounds(12, 30, 177, 21);
		}
		return no;
	}
	private JTextField getSubject() {
		if (subject == null) {
			subject = new JTextField();
			subject.setBounds(12, 75, 177, 21);
			subject.setColumns(10);
		}
		return subject;
	}
	private JTextField getContent() {
		if (content == null) {
			content = new JTextField();
			content.setBounds(12, 123, 177, 21);
			content.setColumns(10);
		}
		return content;
	}
	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(12, 154, 177, 21);
			mId.setColumns(10);
		}
		return mId;
	}
	private JTextField getMDate() {
		if (mDate == null) {
			mDate = new JTextField();
			mDate.setBounds(12, 191, 177, 21);
			mDate.setColumns(10);
		}
		return mDate;
	}
	private JTextField getCnt() {
		if (cnt == null) {
			cnt = new JTextField();
			cnt.setBounds(12, 222, 177, 21);
			cnt.setColumns(10);
		}
		return cnt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC785\uB825");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int sno =  Integer.parseInt(no.getText());
		               String sub = subject.getText();
		               String con = content.getText();
		               String mI = mId.getText();
		               String mDa = mDate.getText();
		               int cn = Integer.parseInt(cnt.getText());
		              BoardVo d = new BoardVo(sno,sub,con,mI,mDa,cn);
		              BoardMain.data[BoardMain.count]=d;
		              BoardMain.count++;
		              status.setText(BoardMain.count + "번째의 성적이 추가됨");
					
				}
			});
			btnNewButton.setBounds(281, 122, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("");
			status.setOpaque(true);
			status.setBackground(new Color(178, 34, 34));
			status.setBounds(257, 194, 135, 15);
		}
		return status;
	}
}

package k_io;

import java.awt.EventQueue;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberModify extends JInternalFrame {
	int index = -1;
	List<MemberVo> list;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField mId;
	private JTextField pwd;
	private JTextField mName;
	private JTextField phone;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberModify frame = new MemberModify();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// primary key (pk) 중복되지않는다 not null 이고 unique 해야한다.
	/**
	 * Create the frame.
	 */
	public MemberModify() {
		super("회원수정", false, true, true, true);
		setBounds(300, 100, 432, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getMId());
		getContentPane().add(getPwd());
		getContentPane().add(getMName());
		getContentPane().add(getPhone());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getStatus());
		setVisible(true);
	}

	public MemberModify(List<MemberVo> list) {
		this();
		this.list = list;
	}

	public void search() {
		pwd.setText("");
		mName.setText("");
		phone.setText("");
		index= -1;
		String ab = mId.getText();
		for(int i =0;i<list.size();i++) {
			MemberVo vo = list.get(i);
			if (vo.getmId().equals(ab)) {
                   index=i;
                   break;
			}
		}

		if (index >= 0) {
			MemberVo vo=list.get(index);
            
            pwd.setText(vo.getPwd());
            mName.setText(vo.getmName());
            phone.setText(vo.getPhone());
            
           status.setBackground(Color.BLUE);
            status.setText("자료가 검색되었습니다.");
            
		} else {
			 status.setText("찾는 자료가 없습니다.");
			 
			 mId.requestFocus();
			 mId.selectAll();
		}

	}

	public void modify() {
		if(index>=0) {
			String id=mId.getText();
			String p=pwd.getText();
			String n=mName.getText();
			String ph=phone.getText();
			
			
			
		
		
		/*String a=pwd.getText();
		MemberVo vo = list.get(index);
		vo.setPwd(a);*/
		
		
		
		
		
		
		status.setText("수정이 완료되었습니다.");
		/*boolean flag=
				Pattern.matches(FileExam2.idCheck,id)&&
				Pattern.matches(FileExam2.pwdCheck,p)&&
				Pattern.matches(FileExam2.nameCheck,n)&&
				Pattern.matches(FileExam2.phoneCheck,ph);
		
		
		if(flag) {
			MemberVo vo=new MemberVo(id,p,n,ph);
			list.set(index, vo);
		}else {
			status.setText("입력 자료를 확인해 주세요");
		}*/
		
		
		}
		
		
		
		
		//list.setvo
		
		
		
		

	}

	public void delete() {
		//MemberVo vo = list.get(index);
		list.remove(index);
		index=-1;
		status.setText("삭제가 완료되었습니다.");
		
    //list.removeVo
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544\uC774\uB514");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC554\uD638");
			lblNewLabel_1.setBounds(12, 45, 57, 15);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC131\uBA85");
			lblNewLabel_2.setBounds(12, 86, 57, 15);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_3.setBounds(12, 122, 57, 15);
		}
		return lblNewLabel_3;
	}

	private JTextField getMId() {
		if (mId == null) {
			mId = new JTextField();
			mId.setBounds(81, 7, 116, 21);
			mId.setColumns(10);
		}
		return mId;
	}

	private JTextField getPwd() {
		if (pwd == null) {
			pwd = new JTextField();
			pwd.setBounds(81, 42, 116, 21);
			pwd.setColumns(10);
		}
		return pwd;
	}

	private JTextField getMName() {
		if (mName == null) {
			mName = new JTextField();
			mName.setBounds(81, 83, 116, 21);
			mName.setColumns(10);
		}
		return mName;
	}

	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(81, 119, 116, 21);
			phone.setColumns(10);
		}
		return phone;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC218\uC815");// 수정
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					modify();

				}

			});
			btnNewButton.setBounds(55, 168, 97, 23);
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");// 삭제
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();
				}
			});
			btnNewButton_1.setBounds(164, 168, 97, 23);
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uAC80\uC0C9");// 검색
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();

				}
			});
			btnNewButton_2.setBounds(218, 6, 97, 23);
		}
		return btnNewButton_2;
	}

	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setOpaque(true);
			status.setBackground(new Color(220, 20, 60));
			status.setBounds(12, 223, 392, 21);
		}
		return status;
	}
}

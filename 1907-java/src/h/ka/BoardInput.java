package h.ka;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;




public class BoardInput extends JInternalFrame {
   private JTextField no;
   private JButton btnNewButton;
   private JTextField subject;
   private JTextField content;
   private JTextField mId;
   private JTextField mDate;
   private JTextField cnt;
   
   
   BoardVo b;
  

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               BoardInput frame = new BoardInput();
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
   public BoardInput() {
      setTitle("BoardInput");
      
      
      setBounds(100, 100, 450, 300);
      getContentPane().setLayout(null);
      getContentPane().add(getNo());
      getContentPane().add(getBtnNewButton());
      getContentPane().add(getSubject());
      getContentPane().add(getContent());
      getContentPane().add(getMId());
      getContentPane().add(getMDate());
      getContentPane().add(getCnt());

   }
   private JTextField getNo() {
      if (no == null) {
         no = new JTextField();
         no.setBounds(33, 24, 177, 21);
         no.setColumns(10);
      }
      return no;
   }
   private JButton getBtnNewButton() {
      if (btnNewButton == null) {
         btnNewButton = new JButton("\uC785\uB825!!");
         btnNewButton.setVerticalAlignment(SwingConstants.TOP);
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
               
            }
         });
         btnNewButton.setBounds(228, 105, 97, 28);
      }
      return btnNewButton;
   }
   private JTextField getSubject() {
      if (subject == null) {
         subject = new JTextField();
         subject.setBounds(33, 61, 173, 21);
         subject.setColumns(10);
      }
      return subject;
   }
   private JTextField getContent() {
      if (content == null) {
         content = new JTextField();
         content.setBounds(34, 93, 172, 21);
         content.setColumns(10);
      }
      return content;
   }
   private JTextField getMId() {
      if (mId == null) {
         mId = new JTextField();
         mId.setBounds(38, 131, 171, 21);
         mId.setColumns(10);
      }
      return mId;
   }
   private JTextField getMDate() {
      if (mDate == null) {
         mDate = new JTextField();
         mDate.setBounds(37, 165, 170, 21);
         mDate.setColumns(10);
      }
      return mDate;
   }
   private JTextField getCnt() {
      if (cnt == null) {
         cnt = new JTextField();
         cnt.setBounds(37, 197, 164, 21);
         cnt.setColumns(10);
      }
      return cnt;
   }
}
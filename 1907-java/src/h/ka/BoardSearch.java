package h.ka;

import java.awt.EventQueue;
import java.awt.Font;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class BoardSearch extends JInternalFrame {
   private JLabel lblNewLabel;
   private JScrollPane scrollPane;
   private JTextArea textArea;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               BoardSearch frame = new BoardSearch();
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
   public BoardSearch() {
      super("Board Search", false, true, true, true);
      
      setTitle("Board Search");
      setBounds(100, 100, 450, 300);
      getContentPane().setLayout(null);
      getContentPane().add(getLblNewLabel());
      getContentPane().add(getScrollPane());
      setVisible(true);
      boardList();
   }
   
   public void boardList() {
      /*BoardVo temp = null;
      int r = 0;
      for(int i = 0; i<BoardMain.count-1; i++) {
         for(int j=(i+1); j<BoardMain.count; j++) {
            BoardVo bv1 = BoardMain.data[i];
            BoardVo bv2 = BoardMain.data[j];
            r = Objects.compare(bv1, bv2, new BoardComparator('n'));
            if(r>0) {
               temp = BoardMain.data[i];
               BoardMain.data[i] = BoardMain.data[j];
               BoardMain.data[j] = temp;
            } // if
         } // j
      } // i
      textArea.setText("");
      for(int i=0; i<BoardMain.count;i++) {
         textArea.append(BoardMain.data[i] + "\n");
      }*/
	   
	   Collections.sort(
	   Arrays.asList(BoardMain.data),new BoardComparator());
	   
	   textArea.setText("");
	   for(int i =0 ; i<BoardMain.count ; i++) {
		   textArea.append(BoardMain.data[i].toString());
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
   private JLabel getLblNewLabel() {
      if (lblNewLabel == null) {
         lblNewLabel = new JLabel("\uB0B4\uB9BC\uCC28\uC21C \uC815\uB82C");
         lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
         lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
         lblNewLabel.setBounds(0, 0, 434, 33);
      }
      return lblNewLabel;
   }
   private JScrollPane getScrollPane() {
      if (scrollPane == null) {
         scrollPane = new JScrollPane();
         scrollPane.setBounds(10, 43, 412, 218);
         scrollPane.setViewportView(getTextArea());
      }
      return scrollPane;
   }
   private JTextArea getTextArea() {
      if (textArea == null) {
         textArea = new JTextArea();
      }
      return textArea;
   }
}
package m_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class EmpList {

	public EmpList() throws Exception{
		Connection conn= DBConn.getConn();
	    
	  //Ŀ�ؼ� �������̽�
	    
	    String sql = "select * from employees where to_char(hire_date, 'rrrr') = ?";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setString(1,"2005");//ù��° �Ķ������ ���� 2005 ����ǥ�� 2005��
	    
	    ResultSet rs = pstmt.executeQuery();
	    while(rs.next()) {
	    	String eName = rs.getString("first_name");
	    	int sal = rs.getInt("salary");
	    	Date nal = rs.getDate("hire_date");
	    	
	    	System.out.println("���� :"+eName);
	    	System.out.println("�޿� :"+sal);
	    	System.out.println("��¥ :"+nal.toLocaleString());
	    	
	    }
	    pstmt.close();
	    conn.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		new EmpList();

	}

}

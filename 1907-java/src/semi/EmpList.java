package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import m_jdbc.DBConn;

public class EmpList {

	public EmpList() throws Exception{
		Connection conn= DBConn.getConn();
	    
	  //Ŀ�ؼ� �������̽�
	    
	    String sql = " select big from newj where id=? and pwd=? " ;
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setString(1,"111");//ù��° �Ķ������ ���� 2005 ����ǥ�� 2005��
	    pstmt.setString(2,"112");
	    ResultSet rs = pstmt.executeQuery();
	    System.out.println(rs);
	    while(rs.next()) {
	    	System.out.println("a");
	    	int sal = rs.getInt("big");
	    	
	    	
	    	
	    	System.out.println("�޿� :"+sal);
	    	
	    	
	    }
	    pstmt.close();
	    conn.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		new EmpList();

	}

}
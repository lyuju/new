package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import m_jdbc.DBConn;

public class EmpList {

	public EmpList() throws Exception{
		Connection conn= DBConn.getConn();
	    
	  //커넥션 인터페이스
	    
	    String sql = " select big from newj where id=? and pwd=? " ;
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setString(1,"111");//첫번째 파라메터의 값은 2005 물음표에 2005들어감
	    pstmt.setString(2,"112");
	    ResultSet rs = pstmt.executeQuery();
	    System.out.println(rs);
	    while(rs.next()) {
	    	System.out.println("a");
	    	int sal = rs.getInt("big");
	    	
	    	
	    	
	    	System.out.println("급여 :"+sal);
	    	
	    	
	    }
	    pstmt.close();
	    conn.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		new EmpList();

	}

}
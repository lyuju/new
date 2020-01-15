package m_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpInsert {

	public EmpInsert() {
		Connection conn= DBConn.getConn();
		
		try {
			
			
			String sql="insert into emp1(employee_id,last_name,hire_date,salary,job_id,email)"
					+ " values(?,?,?,?,?,?)";//줄바꿀떄 명령어 사이에 빈공백
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 500);
			pstmt.setString(2,"hong");
			pstmt.setString(3, "2020-01-15");
			pstmt.setInt(4, 10000);
			pstmt.setInt(5, 100);
			pstmt.setString(6, "HONG");
			
			conn.setAutoCommit(false);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				conn.commit();
				System.out.println("정상 입력");
			}else {
				conn.rollback();
				System.out.println("입력중 오류");
			}
			pstmt.close();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		new EmpInsert();
	}

}

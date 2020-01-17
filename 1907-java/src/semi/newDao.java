package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import m_jdbc.DBConn;



public class newDao {
	
	Connection conn;
	
	public newDao() {
		conn = DBConn.getConn();
	}
	public int search(int id, int pwd ) {
		int r =0;
		
		try {
			String sql = " select big from newj where id=? and pwd=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setInt(2, pwd);
			ResultSet rs = ps.executeQuery();
			System.out.println(rs);
			if(rs.next()) {
				r=rs.getInt("big");
				System.out.println(r);
			}else {
				r=0;
			}
				rs.close();
				ps.close();
				conn.close();
			return r;	
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		
		
		
		
		
		
		return r;
	}
	
	
	
	
}

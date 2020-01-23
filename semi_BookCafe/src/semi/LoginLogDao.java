package semi;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class LoginLogDao {
	Connection conn;
	
	public LoginLogDao() {
		conn = DBConn.getConn();
	}
	
	//사용금액 저장하기
	public int inputPrice(int p,String cId,int in) {
		int r =0;
		try {
			String sql = "update  loginlog set UserPrice=? where userId=? and UseTime=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, p);
			ps.setString(2, cId);
			ps.setInt(3, in);
			
			conn.setAutoCommit(false);
			r = ps.executeUpdate();
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		}catch(Exception ex) {
			
		}finally {
			return r;
		}
	}
	
	//가격 가져오기
	public LoginLogVo price() {
		LoginLogVo vo = new LoginLogVo();
		try {
			String sql = "select initprice , addprice from charge";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				vo = new LoginLogVo(rs.getInt("initprice"),rs.getInt("addprice"));
			}
		}catch(Exception ex) {
			
		}finally {
			return vo;
		}
	}
	
	//로그인버튼 클릭후 로그아웃시 lvo를 저장
	public int insert(LoginLogVo lvo) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		

		int r =0;
		try {
			
			String sql = "insert into LoginLog(LoginNo,UserId,LoginDT,LogoutDT,UseTime) values(seq_loginlog.nextval,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, lvo.getcId());
			ps.setTimestamp(2, new java.sql.Timestamp(lvo.getlIn().getTime() ));
			ps.setTimestamp(3, new java.sql.Timestamp(lvo.getlOut().getTime()));
			ps.setInt(4, lvo.getlTime());
			
			
			conn.setAutoCommit(false);
			
			r = ps.executeUpdate();
			if(r>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		}catch(Exception e) {
			
		}finally {
			return r;
		}
	}
	//로그아웃후 정보를 뿌려줄 메소드
	public LoginLogVo logOut(String id) {
		LoginLogVo lvo = new LoginLogVo();
		int tot =0;
		try {
			String sql = "select UserID,LoginDT,LogoutDT,UseTime from LoginLog where UserID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				lvo.setcId(rs.getString("UserID"));
				lvo.setlIn(rs.getTimestamp("LoginDT"));
				lvo.setlOut(rs.getTimestamp("LogoutDT"));
				tot += rs.getInt("UseTime");
				lvo.setTotTime(tot);
				lvo.setlTime(rs.getInt("UseTime"));
			}
		}catch(Exception ex) {
			
		}finally {
			return lvo;
		}
	}
}

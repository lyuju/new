package m_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreDao {
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public ScoreDao() {
		conn=DBConn.getConn();
	}
		
	
	public int insert(ScoreVo vo) {
		int r=0;
		
		try {
			String sql=" insert into score values(seq_score.nextval,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,vo.getId());
			ps.setString(2,sdf.format(vo.getRdate()));
			ps.setString(3,vo.getSub());
			ps.setInt(4,vo.getSco());
			
			
			r= ps.executeUpdate();
			
			ps.close();
			conn.close();
		}catch (Exception ex) {
			
			
		}
		
		
		
		return r;
	}
	public int delete() {
		
		return 1;
	}
	public int update(ScoreVo vo) {
		
		return 2;
	}
	
	public ScoreVo search(int serial) {
		ScoreVo vo =null;
		
		try {
			String sql = " select S.serial, S.mid, S.rDate, S.subject, S.Score, M.mName " 
		                + " from Score S join member M "
				        + " on S.mId = M.mId "
		                + " where S.serial=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, serial);
			System.out.println(serial);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("a");
				vo=new ScoreVo();
				vo.setId(rs.getString("mId"));
				vo.setRdate(rs.getDate("RDATE"));
				vo.setSub(rs.getString("SUBJECT"));
				vo.setSco(rs.getInt("SCORE"));
				vo.setmName(rs.getString("mName"));
			}
	      rs.close();	
		  ps.close();
		  conn.close();
		
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return vo;
		
	}
	
	
	/*public List<ScoreVo> select(int find){
		List<ScoreVo> list = new ArrayList<ScoreVo>();
		String sql = " select * from score where serial=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt( 1, find );
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int ser = rs.getInt("SERIAL");
				String mid = rs.getString("mId");
				Date rdate = rs.getDate("RDATE");
				String sub = rs.getString("SUBJECT");
				int sco= rs.getInt("SCORE");
				//ScoreVo vo = new ScoreVo(ser,mid,rdate,sub,sco);
				//list.add(vo);
			}
			
			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception ex) {
		}finally {
		
		return list;
		}
	}
	*/
	
	
}

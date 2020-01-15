package m_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDao {
	Connection conn;

	public MemberDao() {
		conn = DBConn.getConn();
	}

	public MemberVo search(String mId) {
		MemberVo vo= new MemberVo();
		String sql=" select * from member where mId=? ";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mId);
			
			ResultSet rs = ps.executeQuery();//����Ʈ ������ ������ resultSet�� ����
			if(rs.next()) {
				vo.setmId(rs.getString("mId"));
				vo.setmName(rs.getString("mName"));
				vo.setrDate(rs.getDate("rDate"));
				vo.setGrade(rs.getInt("grade"));
			}
				
			rs.close();
			ps.close();
			conn.close();
		}catch(Exception ex) {
              ex.printStackTrace();			
		}finally {
			return vo;
		}
	}
			
	
	
	
	
	
	public int update(MemberVo vo) {
		
		int r=0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		String sql=" update member set mName=? , rDate =?, grade =? "+ " where mId=? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, vo.getmName());
		ps.setString(2, sdf.format(vo.getrDate()));
		ps.setInt(3, vo.getGrade());
		ps.setString(4, vo.getmId());
		
		r=ps.executeUpdate();
		
			
			ps.close();
			conn.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			return r;
		}
	}
	
	
	
	
	public List<MemberVo> select(String find) {
		List<MemberVo> list = new ArrayList<MemberVo>();
		String sql = " select * from member " + " where mId like ? or mName like ? ";// ?�ڸ��� find�� ��
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			ps.setString(2, "%" + find + "%");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String mId = rs.getString("mId");
				String mName = rs.getString("mName");
				Date rDate = rs.getDate("rDate");
				int grade = rs.getInt("grade");
				MemberVo vo = new MemberVo(mId, mName, rDate, grade);
				list.add(vo);
			}

			rs.close();
			ps.close();
			conn.close();
			
		} catch (Exception ex) {

		} finally {
			return list;
		}
	}

}

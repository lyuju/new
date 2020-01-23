package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesDao {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Connection conn;
	
	public SalesDao() {
		try {
			conn = DBConn.getConn(); // DB �곌껐
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void connClose( ) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void portClose(PreparedStatement ps) {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void portClose(PreparedStatement ps, ResultSet rs) {
		try {
			ps.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// �쇱�� ��留� 湲곕� DB�� ���ν��湲�
	public int insert(SalesVo vo) {
		int r = 0;
		String sql = "";
		PreparedStatement ps = null;
		
		try {
			sql = "insert into salesLog values(seq_SalesLog.nextval, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, sdf.format(vo.getAdjustmentDT()));
			ps.setInt(2, vo.getTotalPrice());
			ps.setInt(3, vo.getProfit());
			ps.setInt(4,  vo.getTotalUser());
			
			r = ps.executeUpdate();
			if(r > 0) {
				conn.commit();
			}
			else {
				conn.rollback();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps);
			return r;
		}
	}
	// �곗�댄�� 諛깆�� ��, �ㅻ���� 湲곕� 吏��곌린
	public int delete() {
		int r = 0;
		String sql = "";
		PreparedStatement ps = null;
		
		try {
			sql = "DELETE FROM saleslog " +
				  "WHERE to_char(SYSDATE - 365, 'rrrr-mm-dd') > to_char(adjustmentdt, 'rrrr-mm-dd')";
			ps = conn.prepareStatement(sql);
			
			r = ps.executeUpdate();
			if(r > 0) {
				conn.commit();
			}
			else {
				conn.rollback();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps);
		}
		return r;
	}
	// �쇱�� ��留� 湲곕� �곗�댄�� 議고����湲�
	public SalesVo search(Date dt) {
		SalesVo vo = null;
		String sql = "";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			sql = "SELECT count(userId) a, sum(userprice) b " +
				"FROM loginlog " +
				"WHERE to_char(logoutdt, 'rrrr-mm-dd') = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, sdf.format(dt));

			rs = ps.executeQuery();
			if(rs.next()) {
				vo = new SalesVo();
				vo.setTotalUser(rs.getInt("a"));
				int userPrice = rs.getInt("b");
				sql = "SELECT count(userId) i, sum(f) h, sum(e) g FROM (" + 
						"	SELECT userID, (salesPrice * a) f, (incomePrice * a) e FROM food c JOIN (" + 
						"		SELECT userID, foodname, ordercnt a FROM orderlog " + 
								"where to_char(orderdt, 'rrrr-mm-dd') = ?" + 
						"	) b ON c.foodName = b.foodName" + 
						")";
				ps = conn.prepareStatement(sql);
				ps.setString(1, sdf.format(dt));
				
				rs = ps.executeQuery();
				if(rs.next()) {
					vo.setTotalOrder(rs.getInt("i"));
					vo.setTotalPrice(rs.getInt("h") + userPrice);
					vo.setProfit(rs.getInt("g") + userPrice);
				}
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps, rs);
			return vo;
		}
		
	}
	// ���λ�� ��泥� �곗�댄�� 議고��
	public List<SalesVo> select() {
		List<SalesVo> list = null;
		String sql = "";
		PreparedStatement ps = null;
		ResultSet rs = null;
		SalesVo vo = null;
		
		try {
			sql = "SELECT to_char(a, 'rrrr-mm-dd') e, sum(b) f, sum(c) g , sum(d) h from( " + 
					"	SELECT adjustmentdt a, totalUser b, totalprice c, profit d, ROW_NUMBER() OVER(PARTITION BY adjustmentdt ORDER BY salesno DESC) AS RowIdx " + 
					"	FROM saleslog " +
					"	) " + 
					"WHERE rowIdx = 1 " + 
					"GROUP BY to_char(a, 'rrrr-mm-dd') " +
					"ORDER BY to_char(a, 'rrrr-mm-dd')";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				vo = new SalesVo();
				vo.setAdjustmentDT(sdf.parse(rs.getString("e")));
				vo.setTotalUser(rs.getInt("f"));
				vo.setTotalPrice(rs.getInt("g"));
				vo.setProfit(rs.getInt("h"));
				
				list.add(vo);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps, rs);
			connClose();
			return list;
		}
	}
	// 湲곌�蹂� 留ㅼ��� �곗�댄�곕�� 議고����湲�
	public List<SalesVo> select(Date min, Date max, String period) {
		List<SalesVo> list = null; // ��蹂� 諛���
		SalesVo vo = null; // ��蹂대�� �댁�� ����媛�泥� 留��� �� �ъ��
		SimpleDateFormat sdfWhere = null; // �쇰�, ��蹂�, ��蹂� dateformat�� �ㅻⅤ寃� �ъ��
		String formatToDate = "";
		String sql = "";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			switch(period) {
			case "일별" :
//				sql = "SELECT to_char(adjustmentdt, 'rrrr-mm-dd') a, sum(totaluser) b, sum(totalprice) c, sum(profit) d " + 
//						"FROM saleslog " + 
//						"WHERE to_char(adjustmentdt, 'rrrr-mm-dd') >= ? " + 
//						"AND to_char(adjustmentdt, 'rrrr-mm-dd') <= ? " + 
//						"GROUP BY to_char(adjustmentdt, 'rrrr-mm-dd') " +
//						"ORDER BY to_char(adjustmentdt, 'rrrr-mm-dd')";
				sql = "SELECT to_char(a, 'rrrr-mm-dd') e, sum(b) f, sum(c) g , sum(d) h from( " + 
						"	SELECT adjustmentdt a, totalUser b, totalprice c, profit d, ROW_NUMBER() OVER(PARTITION BY adjustmentdt ORDER BY salesno DESC) AS RowIdx " + 
						"	FROM saleslog " + 
						"	WHERE to_char(adjustmentdt, 'rrrr-mm-dd') >= ? " + 
						"	AND to_char(adjustmentdt, 'rrrr-mm-dd') <= ? " + 
						"	) " + 
						"WHERE rowIdx = 1 " + 
						"GROUP BY to_char(a, 'rrrr-mm-dd') " +
						"ORDER BY to_char(a, 'rrrr-mm-dd')";
				sdfWhere = new SimpleDateFormat("yyyy-MM-dd");
				formatToDate = "";
				break;
			case "월별" :
//				sql = "SELECT to_char(adjustmentdt, 'rrrr-mm') a, sum(totaluser) b, sum(totalprice) c, sum(profit) d " + 
//						"FROM saleslog " + 
//						"WHERE to_char(adjustmentdt, 'rrrr-mm') >= ? " +
//						"AND to_char(adjustmentdt, 'rrrr-mm') <= ? " + 
//						"GROUP BY to_char(adjustmentdt, 'rrrr-mm') " +
//						"ORDER BY to_char(adjustmentdt, 'rrrr-mm')";
				sql = "SELECT to_char(a, 'rrrr-mm') e, sum(b) f, sum(c) g, sum(d) h from( " + 
						"	SELECT adjustmentdt a, totalUser b, totalprice c, profit d, ROW_NUMBER() OVER(PARTITION BY adjustmentdt ORDER BY salesno DESC) AS RowIdx " + 
						"	FROM saleslog " + 
						"	WHERE to_char(adjustmentdt, 'rrrr-mm') >= ? " + 
						"	AND to_char(adjustmentdt, 'rrrr-mm') <= ? " + 
						"	) " + 
						"WHERE rowIdx = 1 " + 
						"GROUP BY to_char(a, 'rrrr-mm') " +
						"ORDER BY to_char(a, 'rrrr-mm') ";
				sdfWhere = new SimpleDateFormat("yyyy-MM");
				formatToDate = "-01";
				break;
			case "년별" :
//				sql = "SELECT to_char(adjustmentdt, 'rrrr') a, sum(totaluser) b, sum(totalprice) c, sum(profit) d " + 
//						"FROM saleslog " + 
//						"WHERE to_char(adjustmentdt, 'rrrr') >= ? " + 
//						"AND to_char(adjustmentdt, 'rrrr') <= ? " + 
//						"GROUP BY to_char(adjustmentdt, 'rrrr') " +
//						"ORDER BY to_char(adjustmentdt, 'rrrr')";
				sql = "SELECT to_char(a, 'rrrr') e, sum(b) f, sum(c) g, sum(d) h from( " + 
						"	SELECT adjustmentdt a, totalUser b, totalprice c, profit d, ROW_NUMBER() OVER(PARTITION BY adjustmentdt ORDER BY salesno DESC) AS RowIdx " + 
						"	FROM saleslog " + 
						"	WHERE to_char(adjustmentdt, 'rrrr') >= ? " + 
						"	AND to_char(adjustmentdt, 'rrrr') <= ? " + 
						"	) " + 
						"WHERE rowIdx = 1 " + 
						"GROUP BY to_char(a, 'rrrr') " +
						"ORDER BY to_char(a, 'rrrr') ";
				sdfWhere = new SimpleDateFormat("yyyy");
				formatToDate = "-01-01";
				break;
			}
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, sdfWhere.format(min));
			ps.setString(2, sdfWhere.format(max));
			
			rs = ps.executeQuery();
			list = new ArrayList<>();
			while(rs.next()) {
				vo = new SalesVo();
				vo.setAdjustmentDT(sdf.parse(rs.getString("e") + formatToDate));
				vo.setTotalUser(rs.getInt("f"));
				vo.setTotalPrice(rs.getInt("g"));
				vo.setProfit(rs.getInt("h"));
				
				list.add(vo);
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps, rs);
			return list;
		}
		
	}

	
	// �댁�� ��湲� ��蹂� 媛��몄�ㅺ린
	public int[] chargeSearch() {
		int[] r = null;
		String sql = "";
		PreparedStatement ps = null;
		
		try {
			sql = "select * from charge";
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				r = new int[2];
				r[0] = rs.getInt("initPrice");
				r[1] = rs.getInt("addPrice");
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps);
			return r;
		}
	}
	// �댁�� ��湲� ����
	public int chargeUpdate(int initPrice, int addPrice) {
		int r = 0;
		String sql = "";
		PreparedStatement ps = null;
		
		try {
			sql = "update charge set initPrice = ?, addPrice = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, initPrice);
			ps.setInt(2, addPrice);
			
			r = ps.executeUpdate();
			
			if(r > 0) {
				conn.commit();
			}
			else {
				conn.rollback();
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			portClose(ps);
			connClose();
			return r;
		}
	}
}

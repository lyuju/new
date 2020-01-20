package semi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;




public class userDao {
	
	Connection conn;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	ResultSetMetaData meta;
	DefaultTableModel model;
	Vector row ;
	public userDao() {
		conn = DBConn.getConn();
	}

	public userDao(Vector row,DefaultTableModel model) {
		this();
		this.row=row;
		this.model=model;
	}
	public char insert(userVo vo) {
		char r=0;

		try {
			String sql = " select is_admin from member where userid =  ? and password = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getcId());
			ps.setString(2, vo.getcPwd());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("a");
				String c =rs.getString("IS_ADMIN");
				
				r=c.charAt(0);
				System.out.println(r);
				rs.close();
				ps.close();
			}else {
				r=0;
			}
		}catch (Exception ex){
			
			
		}
		System.out.println(r);
		return r;
		
	}
		
		
		
		
		

	
	
	public int update(userVo vo) {
		int r = 0;
		
		try {
			String sql = " update member set PASSWORD = ? where userid = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
		    ps.setString(1, vo.getcPwd());
		    ps.setString(2,vo.getcId());
		    r = ps.executeUpdate();
		    
		    
	    
	    r = ps.executeUpdate();
	    ps.close();
	    
	    if(r>0) conn.commit();
	    else conn.rollback();
		}catch(Exception ex) {
			
		}finally {

		return r;
		}
	}
	
	public void Minsert(userVo vo) {
	try {
		String sql = " insert into member(userno,userid,password,email,phone,is_admin,username) values(seq_member.nextval,?,?,' ','010-1234',?,?) ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, vo.getcPwd());
	    ps.setString(2,vo.getcId());
	    ps.setString(3,String.valueOf(vo.getcCheck()));
	    ps.setString(4, vo.getcName());
		ps.executeUpdate();
		conn.commit();
        ps.close();
	} catch (Exception ex) {

	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	public void delete(String id){
		
		try {

			System.out.println(id);
			String sql = " delete from member where userid=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			ps.executeUpdate();
			ps.close();

		} catch (Exception ex) {

		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void search(String find) {
    	
		String sql = " select * from member where userid like ? ";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + find + "%");
			
			
			
			meta = ps.getMetaData();
			model.setRowCount(0);
			
			int cnt = meta.getColumnCount();
			for(int i=1; i<=cnt; i++) {
				model.addColumn( meta.getColumnName(i));
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				row = new Vector();
				for(int i=1; i<=cnt; i++) {
					row.add(rs.getString(i));
				}
				model.addRow(row);
			}
			rs.close();
			ps.close();
            
		} catch (Exception ex) {
			
		}
			
		
		
	}
			
}			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	



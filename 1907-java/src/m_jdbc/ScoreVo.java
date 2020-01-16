package m_jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScoreVo {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	int serial;
	String id;
	Date rdate;
	String sub;
	int sco;
	String mName;
	
	public ScoreVo() {}
	
	public ScoreVo(int se,String id, Date d, String sub, int sco,String mName ) {
		this.serial =se;
		this.id=id;
		this.rdate=d;
		this.sub=sub;
		this.sco=sco;
		this.mName=mName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getSco() {
		return sco;
	}

	public void setSco(int sco) {
		this.sco = sco;
	}

	public String toString() {
		
		String d = sdf.format(rdate);
		String str = String.format("%10d\t%15s\t%15s\t%10s\t%30s\t%7.1f", serial,id,mName,d,sub,sco);
		  
		  return str;
	
	
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	
	
	
	
	
	
	
	
	
}

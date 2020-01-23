package semi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginLogVo {
	int lNo;	//로그인 인덱스/시퀀스
	String cId;	//유저 아이디
	Date lIn;	//로그인 시간
	Date lOut;	//로그아웃 시간
	int lTime;	//오늘사용시간
	int totTime;//총 사용시간
	//long min; // 로그아웃 시간 - 로그인 시간을 분단위로 환산
	
	int initprice;//기본요금
	int addprice;//추가요금
	
	
	
	
	public LoginLogVo() {
		
	}
	
	public LoginLogVo(int ini,int add) {
		this.initprice = ini;
		this.addprice = add;
		
		
		

		
	}
	
	public LoginLogVo(String cId, Date lIn , Date lOut) {
		this.cId = cId;
		this.lIn = lIn;
		this.lOut = lOut;
		SimpleDateFormat sdf = new SimpleDateFormat("hh");
		SimpleDateFormat sdf2 = new SimpleDateFormat("mm");
		int hIn = Integer.parseInt(sdf.format(lIn));//로그인 시간
		int mIn = Integer.parseInt(sdf2.format(lIn));//로그인 분
		
		int hOut = Integer.parseInt(sdf.format(lOut));//로그인 시간
		int mOut = Integer.parseInt(sdf2.format(lOut));//로그인 분
		
		//int sOut = lOut.getTime();//로그아웃 시간
		//int mOut = sdf2.format(lOut);//로그아웃 분
		
		//long diff = lOut.getTime() - lIn.getTime();
		//this.min = diff / (1000*60);
		
		
		//System.out.println(diff);
		//System.out.println(min);
		this.lTime = ((hOut*60)+mOut)-((hIn*60)+mIn); // 
	}
	public int getInitprice() {
		return initprice;
	}

	public void setInitprice(int initprice) {
		this.initprice = initprice;
	}

	public int getAddprice() {
		return addprice;
	}

	public void setAddprice(int addprice) {
		this.addprice = addprice;
	}



	public int getTotTime() {
		return totTime;
	}
	public void setTotTime(int totTime) {
		this.totTime = totTime;
	}
	public int getlNo() {
		return lNo;
	}
	public void setlNo(int lNo) {
		this.lNo = lNo;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public Date getlIn() {
		return lIn;
	}
	public void setlIn(Date lIn) {
		this.lIn = lIn;
	}
	public Date getlOut() {
		return lOut;
	}
	public void setlOut(Date lOut) {
		this.lOut = lOut;
	}
	public int getlTime() {
		return lTime;
	}
	public void setlTime(int lTime) {
		this.lTime = lTime;
	}
}

package h.ka;

public class BoardVo {

	public int no=0;
	public String subject="";
	public String content="";
	public String mId="";
	public String mDate="";
	public int cnt=0;
	
	
	public BoardVo(int no,String subject,String content,String mId,String mDate,int cnt) {
		this.no=no;
		this.subject=subject;
		this.content=content;
		this.mId=mId;
		this.mDate=mDate;
		this.cnt=cnt;
	
	
	
	}
	
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		//String a=bc[i].getNo()+ bc[i].getSubject() +bc[i].getContent() +bc[i].getmId()+bc[i].getmDate()+bc[i].getCnt();
		
		return no + " - " +subject + " - " + content+ " - " +mId+ " - " +mDate+ " - " +cnt;
	}
	
	
	
}

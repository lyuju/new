package k_io;

import java.io.Serializable;

public class MemberVo implements Serializable {//직렬화
	
	
    public static long serialVerssionUID = 1L;//자바가 통신이나 직렬화할때 번호체크 동일한 컴퓨터에서 컴파일한거라 생각
    //번호가같으면 ,서로 다른 컴퓨터에서 컴파일 하더라도 위의 번호값이 같으면 동일한 컴퓨터에서 컴파일한 파일로 인식
    //통신할때는 직렬화 필요하다

	private String mId;
	private String pwd;
	private String mName; // 이름순 어센딩
	private String phone;

	public MemberVo(String mId, String pwd, String mName, String phone) {
		this.mId = mId;
		this.pwd = pwd;
		this.mName = mName;
		this.phone = phone;
	}

	

	@Override
	public int hashCode() {

		return mId.hashCode() + phone.hashCode();// 추후 변경
	}

	@Override
	public boolean equals(Object obj) {
		String find=(String)obj;
		boolean result = false;

	
			if (mId.indexOf(find)>=0||mName.indexOf(find)>=0 ||phone.indexOf(find)>=0) {
				result = true;
			}

		
		return result;
	}
	 
	 

	@Override
	public String toString() {

		return mId + "\t" + pwd + "\t" + mName + "\t" + phone + "\n";// 추후 변경
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

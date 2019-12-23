package j_Collection;

public class MemberVo {

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

	void ss() {

	}

	@Override
	public int hashCode() {

		return mId.hashCode() + phone.hashCode();// 추후 변경
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj instanceof MemberVo) {
			MemberVo vo = (MemberVo) obj;
			if (vo.getmId().equals(mId) && vo.getPhone().equals(phone)) {
				result = true;
			}

		}
		return result;
	}
	 sno;
	 private String mName;
	 private String exam;
	 private int grade;
	 private int kor;
	 private int eng;
	 private int mat;

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

package f_inheri;
//���� ��������, ĸ��ȭ
public class Account {
	private String mName; //�ɹ�����  ��� ������Ʈ, ������ ��Ÿ���� vo�� �ٿ��ִ°��� ����
	private String sNo; //���¹�ȣ  ��� ������Ʈ, ������ ��Ÿ���� vo�� �ٿ��ִ°��� ����
	private long amount; //���ݾ�  ��� ������Ʈ, ������ ��Ÿ���� vo�� �ٿ��ִ°��� ����
	
	public Account(String n, String no, long amt) {
		this.mName = n;
		this.sNo = no;
		this.amount = amt;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	

}

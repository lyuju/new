package h_api;

public class SmartPhone {
	String com;
	String os;
	
	public SmartPhone(String c, String os){
		this.com = c;
		this.os = os;
		
		}
	@Override
	public String toString() {
		//return super.toString();
		return com + " , " + os;
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("����" , "�ȵ���̵�");
		
		System.out.println(sp);
		System.out.println(sp.toString());
		
	}

}

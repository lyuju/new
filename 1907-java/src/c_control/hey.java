package c_control;

public class hey {

	
	/* ��� ó���� �����ڸ� ����Ͽ� �ذ�. 
	 *  ��.Ư¡ : ��ȯ���� ����.
	 *  ��.����, �ּ�, ����ó�� ���ڿ��� �߻��Ѵ�. 
	 *     ������ �����͸� name,address, phone�� ����
	 *  ��.������ ���������� �߻��Ͽ� ���� kor,ent,mat�� ���� ��. 
	 *  ��.����� ������ ����Ͽ� ����, ����� tot, avg�� ����.
	 *  ��. if~else if���� ����Ͽ� ��հ��� ����Ͽ� ������ ���ؼ� ������ ���� grade�� ����.
	 */
	//String mag = "���� :" +name;
	//msg +="\n�ּ� :" + address;
	
	int a = 74; //kor
	int b = 80; //ent
	int c = 60;	//avg	
	
	
	hey(){
		String name = "�Ͽ�";
		String address = "������";
		String phone ="010";
		System.out.println("���� :"+name);
		System.out.println("�ּ� :"+address);
		System.out.println("����ó :"+phone);
		
	}
	
	public void tot(int a,int b,int c) {
        int ed = a + b + c ;
        System.out.println("�հ� :" +ed);
		
	}
	public void avg(int a,int b,int c) {
		double eb = (double)(a+b+c)/3;
		System.out.println("��� :"+ eb);
		char grade = ' ';
		if(eb<=90) {
			grade = 'A';
			System.out.println("���� : "+grade);
		}else {System.out.println("���� :B");
			
		}
	}
	public static void main(String[] args) {
		hey kd = new hey();
		
		
		
		
		kd.tot(kd.a, kd.b, kd.c);
		kd.avg(kd.a, kd.b, kd.c);
		
		
		
	}
}

package a_begin;

public class Score3 {
//class �ȿ��� �ʵ�(����)�� �޼ҵ常 �ʵ带 �����ϴ� ������ Ŭ������ �����°�
	Score3(){
		int kor =90, eng=91, pl=kor+eng;
		int a,b,c;
		a = 95; b = 80; c=a+b;
		double d = c/(double)2;
// �׳� ����Ÿ��c��� ����� �Ǽ�Ÿ�� d�� �ִ°��ϻ� �ڵ����� c�� ������� �������� �Ǽ��� �ٲ����ʴ´�
//doubleŸ�� ���� ������ c/2.0����
		System.out.println("-------------------"+"\n"+"���� ó�� ���"+"\n"+"-------------------"+"\n"+"�ۼ����� : 2019.11.27(��) \n�ۼ��� : ���Ͽ� " + "\n" + "���� : " +a + 
				"\n" + "���� : " + b + "\n" + "�հ� : "+ c + "\n" + "��� : " + d )
;		System.out.println(pl);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	 
		new Score3();
 }
	
	
}

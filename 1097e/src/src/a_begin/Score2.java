package a_begin;

public class Score2 {
	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		double ev = 100.0;
		char p = 'A';
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + ev);
		System.out.println("���� : " + p);
		
		int sum = 0;
		for(int dan = 2; dan<10; dan++) {
			System.out.println(dan + "*");
			for(int num = 1; num<10; num++) {
				sum = dan*num;
				System.out.println(dan + "*" + num + "=" + sum);
			}
		}
		
	}

}

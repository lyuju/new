package a_begin;

public class Score3 {
	public Score3() {
		String date = "2019.11.27";
		String name = "���б�";
		int kor = 90;
		int eng = 85;
		int sum = 0;
		double avg = 0;
		sum = kor + eng;
		avg = (double)sum/2;
		
		System.out.println("-----------------");
		System.out.println("����ó�����");
		System.out.println("-----------------");
		System.out.println("�ۼ����� : " + date);
		System.out.println("�ۼ��� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("-----------------");
	}
	public static void main(String [] args) {
		new Score3();
	}

}

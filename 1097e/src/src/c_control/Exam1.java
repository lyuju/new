/*
 * ���ó���� �����ڸ� ����Ͽ� �ذ�.
 * ����, �ּ�, ����ó�� ���ڿ��� �߻��Ѵ�. ������ �����͸� name, address, phone�� ����
 * ������ ���������� �߻��Ͽ� ���� kor, eng, mat�� ������.
 * ����� ������ ����Ͽ� ����, ����� tot, avg�� ����.
 * if ~ else if���� ����Ͽ� ��հ��� ����Ͽ� ������ ���ؼ� ������ ���� grade�� ����.
 * ó���� ��� ������ ǥ�� ��� ��ġ�� ���.
 * [��°��]
 * -----------------------------------
 * ���� : XXX
 * �ּ� : XXX
 * ����ó : XXX
 * ���� : XXX
 * ���� : XXX
 * ���� : XXX
 * ���� : XXX
 * ��� : XXX
 * ------------------------------------  
 */

package c_control;

public class Exam1 {
	Exam1(){
		String name, address, phone;
		char grade;
		int kor, eng, mat, tot;
		double avg;
		
		name = "ȫ�浿";
		address = "����� ���α�";
		phone = "000-0000-0000";
		
		kor = 90;
		eng = 80;
		mat = 70;
		tot = kor+eng+mat;
		avg = tot/3;
		
		if(avg>90) {
			grade = 'A';
		}else if(avg>80){
			grade = 'B';
		}else if(avg>70){
			grade = 'C';
		}else {
			grade = 'D';
		}
		String mag = "���� : " + name;
		mag += "\n�ּ� : " + address;
		mag += "\n����ó : " + phone;
		mag += "\n���� : " + kor;
		mag += "\n���� : " + eng;
		mag += "\n���� : " + mat;
		mag += "\n���� : " + tot;
		mag += "\n��� : " + avg;
		
		System.out.println("[��°��]");
		System.out.println("----------------------------");
		System.out.println("���� : " + name);
		System.out.println("�ּ� : " + address);
		System.out.println("����ó : " + address);
				
	}
	public static void main(String [] args) {
		Exam1 a = new Exam1();
		
		
		
	}

}


/*
 * ��2) ������ ����� ����(���ϸ� : Score4.java)
 ��. ����, ����, ���� ������ ���������� ������ ������ ��, ������ ����� ����Ͽ� ������ ������ �����Ͻÿ�.
 ��. �� ���� ������ �ϳ��� 40�̸��� ������ '���հ�'ó��
 ��. ����� 60 �����̿��� '���հ�'ó���� �Ͽ� ������ ����, ���, �հݿ��θ� ǥ�������ġ�� ����Ͻÿ�.
 **package b_operator

[��¿���]
---------------------------
�հ� ���� ����
---------------------------
���� : 50
���� : 50
���� : 50
���� : 150
��� : 50
��� : ���հ�
---------------------------
 */
package b_operator;

public class Score4 {
	int kor = 50;
	int eng = 90;
	int math = 50;
	int sum = 0;
	double avg = 0.0;
	boolean r;
	String str;
	
	Score4() {
		sum = kor + eng + math;
		avg = (double)sum/3;		
		r = (kor>=40) && (eng>=40) && (math>=40) && (avg>=60);
		str = (r)? "�հ�" : "���հ�";
		
		
		/*if((kor>=40) && (eng>=40) && (math>=40) && (avg>=60)) {
			System.out.println("��� :" + "�հ�");
		}
		System.out.println("��� :" + "���հ�");
		*/
		
		System.out.println("---------------------");
		System.out.println("�հ� ���� ����");
		System.out.println("---------------------");
		System.out.println("���� :" + kor);
		System.out.println("���� :" + eng);
		System.out.println("���� :" + math);
		System.out.println("���� :" + sum);
		System.out.println("��� :" + avg);
		System.out.println("��� :" + str);		
		System.out.println("---------------------");
	}
	public static void main(String [] args) {
		new Score4();	
	}

}

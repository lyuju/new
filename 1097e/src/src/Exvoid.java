/*2019.11.29(��)
 * ������ 0~100�� ���� 60�̻��̸� '�հ�' 60�̸��̸� '���հ�'
 * �� ����ϰ�, ������ ���� ���̸�'��������'�� ����Ͻÿ�.
 */

//�߸��� �˰���, ����ȭ��ų �� ����.
public class Exvoid {
	String type() {
		int kor = 60;
		int eng = 40;
		int math = 70;
		int score = 0;
		String r = null;
		
		if( score <= 100 ) {
			if( kor >= 60 ) {
				System.out.println("�����հ�");
			} else if( kor < 60 ) {
				System.out.println("������հ�");
			}
			if( eng >= 60 ) {
				System.out.println("�����հ�");
			}else if( eng < 60 ) {
				System.out.println("������հ�");
			}
			if( math >=60 ) {
				System.out.println("�����հ�");
			}else if( math < 60 ) {
				System.out.println("���к��հ�");
			}			
		}else {
			System.out.println("��������");	
		}
		return r;	
	}	
	public static void main(String [] args) {
		Exvoid add = new Exvoid();	
		String add1 = add.type();
	}

}

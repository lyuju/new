/*
 * ��. ����Ÿ��� ���� �ýÿ���� ����Ͽ� ���.
 * ��. �⺻ 2000m ������ �⺻����� 3000��
 * ��. 200m�� �߰������ 500���� ���ݵ�.
 * ��. ���� �մ��� ����Ÿ��� 4530m�� ��� �ýÿ���� ����Ͻÿ�.
 */

package c_control;

public class Exam2 {
	Exam2(){
		int totm = 4530; //����Ÿ�
		int base = 2000; //�⺻�Ÿ�
		int basePrice = 3000; //�⺻���
		int mPrice = 500; //�߰����
		int m = 0; //�߰��Ÿ�
		int totPrice = 0; //�� ���
		m = totm-base;
		
		if( m > 0 ){
			int v = m/200;
			if ( m % 200 > 0 ) {
				v++;
		    }
			totPrice = basePrice + (500*v);
		}else {
			totPrice = 3000;
		}
		
		System.out.println(totPrice);
	}

}

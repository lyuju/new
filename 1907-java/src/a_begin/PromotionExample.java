package a_begin;

import c_control.exam2;

public class PromotionExample {

 
 //�����ڷ� �ҷ����� �޼ҵ�

/* ����Ÿ��� ���� �ý� ����� ����Ͽ� ���
 * �⺻ 2000m ������ �⺻ ����� 3000��
 * 200m �� �߰� ����� 500���� ���ݵ�. 
 * ���� �մ��� ����Ÿ��� 4530�� ��� �ý� �����
 */
public class exam2 {

	int a=2000;//�⺻���
	int b;
	int c=4001;//����Ÿ�
	int d;//�߰��Ÿ�
	int f;//200m �����ſ��� ������
	int g;//�������
	void taxi() {
	
	if(a<=2000) {
		b = 3000;
	}if(c>a) {
		d=(c-a)/200; //d�� �߰� �Ÿ�
		f=(c-a)%200;
		}if(f>0){
			d++;
			g=b+(d*500);
			System.out.println(g);
		
		}else {
			g=b+(d*500);
			System.out.println(g);
		
		}
			
}
	public static void main(String[] args) {
	exam2 ad = new exam2();
	ad.taxi();
	
	
	
	
	
}
 }
	 

 
 

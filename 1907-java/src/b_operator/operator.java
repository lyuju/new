/*
 * �ۼ����� : 2019.11
 * �ۼ��� : jiy
 * ���� �����ڿ� ���� ����
 */

package b_operator;

public class operator {
 operator(){
	 //������ ������
	 System.out.println(12%5);
	 //������ �����ڿ� 3�׿�����
	 int n = 234;
	 String r = (n%2==0)?"¦��":"Ȧ��";
	 System.out.println(r);
	 
	 //���� ������
	 // ��ġ/��ġ
	 int a = 10 , b = 10;
	 a++;
	 ++b;
	 System.out.println(a +"," +b);
	 
	 int c = a++ , d = ++b;
	 System.out.println(c + ","+ d);
	 System.out.println(a +"," +b);
	 
	 String name = "��";
	 String irum = "��";
	 String irum2 = new String("��");
	 
	 System.out.println(name==irum);
	 System.out.println(name==irum2);
	 
	 System.out.println(name.equals(irum));
	 System.out.println(name.equals(irum2));
	 
 }
//()�� �ȳ����� �޼ҵ尡 �ƴϴ�	
	public static void main(String[] args) {
	 new operator();
	 
	 
	 
 }
 
}

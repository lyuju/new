/*
 * �ۼ����� : 2019.11
 * �ۼ��� : chg
 * ���� �����ڿ� ���� ����
 */
package b_operator;

public class Operator {
	Operator() {
		//������ ������
		System.out.println("12%5 => " + (12%5));
		
		// ������ ������ �� 3�׿�����
		int n = 122;
		
		String r = (n%2==0)? "¦��":"Ȧ��";
		System.out.println( n + " ==> " + r );
		
		// ����������
		// ��ġ/��ġ
		
		int a = 10;
		int b = 10;
		
		a++;
		++b;
		System.out.println(a + "," + b);
		
		int c = a++;
		int d = ++b;
		System.out.println(c + "," + d);
		System.out.println(a + "," + b);
		
		String name = "��";
		String irum = "��";
		
		String irum2 = new String("��");
		
		System.out.println(name == irum);
		System.out.println(name == irum2);
		
		System.out.println(name.equals(irum));
		System.out.println(name.equals(irum2));
		
		//&& = tt / || = ff 
		
	}
	public static void main(String[]args) {
		new Operator();
	}

}

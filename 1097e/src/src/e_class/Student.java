/*����1)
1) Student Ŭ������ �ۼ�
2) �Ű������� ���� �����ڷ� ��ü�� �����ϸ� �̸�, �ּ�, ����ó�� 
"ȫ�浿", "���α�", "010-1111-1111"���� �ʵ带 �ʱ�ȭ
�Ͻÿ�(irum, address, phone)
3)�̸��� �Ķ���ͷ� �����ϸ� ���޵� �̸��� �ʵ忡 ����Ǵ� �����ڸ� �ߺ����� �Ͻÿ�.
4) �̸�, �ּ�, ����ó�� �Ķ���͸� �����ϸ� ��� ���� �ʵ忡 �����ϴ� �����ڸ�
   �ߺ� �����Ͻÿ�.
5)main()�� �ۼ��Ͽ� ���� �䱸������ ó���Ǵ����� �׽�Ʈ �Ͻÿ�. 
 */
package e_class;

public class Student {
	String irum;
	String address;
	String phone;	
	
	public Student() {
		this.irum = "ȫ�浿";
		this.address = "���α�";
		this.phone = "010-1111-1111";
		
	}
	public Student(String irum) {
		this.irum = irum;
	}
	public Student(String irum, String a) {		
		this.irum = irum;
		this.address = a;
	}
	public Student(String irum, String address, String phone) {
		this.irum = irum;
		this.address = address;
		this.phone = phone;
	}
	void prn() {
		System.out.println("���� : " + this.irum);
		System.out.println("�ּ� : " + this.address);
		System.out.println("����ó : " + this.phone);
		System.out.println("-----------------------");
		
	}
	public static void main(String [] args) {
		Student a1 = new Student();
		a1.prn();
		
		Student a2 = new Student("������");
		a2.prn();
		Student a3 = new Student("ȫ�浿", "������");
		a3.prn();
		Student a4 = new Student("������", "����", "010-1234-1234");
		a4.prn();
		
		System.out.println("���� : " + a2.irum);
		System.out.println(a3.irum + a3.address);
		System.out.println("���� : " + a4.irum + " �ּ� : " + a4.address +" ����ó : "+ a4.phone);
	}

}

package e_class;

public class ExamTest {
	public static void main(String [] args) {
		Exam1 e1 = new Exam1();
		
		int r1 = e1.sum(-20, -30);
		System.out.println("�μ��� �� : " + r1);
		
		int r2 = e1.sum2(2,  9);
		System.out.println("�հ� : " + r2);
		
		double r3 = e1.sum3(10.0,  20.0);
		System.out.println("�簢���� ���� : " + r3);
		
		e1.gugudan(2);
		String r4 = e1.gugudan2(2);
		System.out.println("������");
		System.out.println(r4);
		}

}

package b_operator;

public class ss {

	public static void main(String[] args) {
		int a = 534;   // ����
		int b = 30;    // �л���
		int c = a/b;   // �л� �� ���� ������ ���� ��
		int d = a%b;   // ���� ���� ��
		
		System.out.println("�л� �� ���� ������ ���� �� : " + c);
		System.out.println("���� ���� �� : "+d);
		
		
		
		double e = 12365.24;
		double f = (int)(e+99.999)/100*100;
		System.out.println(f);
		//�ڹ��� int�� �Ҽ��� ���ϴ� �����ؼ� ������ ������
		
		//��. ���ݰ�� 10���� ������ �ݾ��� ������ �����Ͽ� �����Ͻÿ�.
		
		//��. ���ڰ�� 10���� ������ �ݾ��� ������ �����Ͻÿ� �����Ͻÿ�.
		//int f = e/100*100+100;
		
		//h�� ������ 
		double h = (double)e%100;
		double g = e-h+100;
		System.out.println(g);
		
		//(10+5)/7 �Ҽ��ڸ����� ��������
		
		double k = (double)(10+5)/7;
		System.out.println(k);
		
	}

}

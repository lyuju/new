package f_inheri;

public class MyCar {
	KumhoTire[] front = new KumhoTire[2];
	HankuTire[] back  = new HankuTire[2];
	
	Tire[] tire = new Tire[4]; //2. Tire�迭��ü 4������ �Ͽ� tire�ּ����� 
	
	public static void main(String[] args) {
		MyCar m = new MyCar();//1. m�� MyCar ��ü����, �ʱ�ȭ, �ּ�����->
		m.tire[0] = new KumhoTire(); 
		m.back[0] = new HankuTire();
		
		m.tire[0].run();
		/* �������λ���
		 * 3.m �� tire�� [0] �� �� run()��� ����
		 * m�� - MyCar :������Ʈ
		 * tire�� - Tire[4] : ������Ʈ
		 * [0]�� - Tire[4]�� 0��° �迭����
		 * run() �̶�� ���
		 */
		//��ü�� HankuTire�� ������� �ִ� ��� ��
		Tire h1 = new HankuTire();
		if(h1 instanceof KumhoTire) {
			System.out.println("��ȣŸ�̾�� �������");
		}else {
			System.out.println("��ȣŸ�̾�� ��������� ����");
		}
	}
}

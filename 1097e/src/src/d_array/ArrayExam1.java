package d_array;

public class ArrayExam1 {
	ArrayExam1(){
		//�迭�� �����ϸ鼭 �ʱⰪ�� �����ϴ� ���
		int[] scores = {1,2,3,4,5};
		System.out.println(scores[0]);
		System.out.println(scores[4]);
		
		//���ڿ��� �迭�� �����ϰ� ������ ������ 3�� ����
		String[] names = {"hong", "kim", "park"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		// �迭�� ������ �Ŀ� �ʱⰪ�� ������ ��
		// double[] height = new double[]{150.5, 160, 165.5}; 
		double[] height = null;
		height = new double[]{150.5, 160, 165.5};
		
		// 10���� �����Ը� ������ �� �ִ� �Ǽ��� �迭�� ����
		double[] w = new double[10];
		
		//�����Լ��� ����Ͽ� �����Ը� �߻����� �迭 w�� ����
		for(int i = 0; i < 10 ; i++) {
			double d = Math.random()*100;
			w[i] = d;
		}
		
		for(int i = 0; i < 10 ; i++) {
			System.out.printf("%5.1f \n", w[i]);
		}
		
		//�������� �հ�� ��� ���
		double hap = 0;
		for(int i = 0; i<w.length ; i++) {
			hap += w[i];
		}
		double avg = hap/w.length;
		
		System.out.printf("�հ� = %8.2f \n", hap);
		System.out.printf("��� = %7.2f \n", avg);
		
		names[0] = "ȫ��";
		names[1] = "�达";
		names[2] = "�ھ�";
	}
	public static void main(String [] args) {
		for(int i = 0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		//new ArrayExam1();		
		
	}
}

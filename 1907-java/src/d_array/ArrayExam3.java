package d_array;

public class ArrayExam3 {

	// ������ ��ȯ�� �޼ҵ��(�Ű�����){...}
	// �����ڿ� �Ϲݸ޼ҵ尡 �ٸ����� ��ȯ���̾���. ��ȯ�� ������ ������ �޼ҵ�
	/*
	 * �����ڿ��� ȣ���ϰų� ���ο��� ȣ�� Ŭ�����ȿ��� ȣ���Ұ�� �տ� this.(��������) Ŭ�����ۿ����� ������ ��ü������ ����. �޼ҵ�ȿ�
	 * �޼ҵ� �����Ұ� ��� :�޼ҵ���� ����� ������ ���� x
	 */
	public void test1() {
		//������ 2���� �迭�� �����ϰ� �ʱⰪ�� 4�� 3���� �����͸�����
		 int count =0;
		 int x =0;
		int[][] s = new int[][] {
			{1, 2, 3},
			{2, 3, 3},
			{4, 5, 5},
			{7, 8, 9}	
		};
		//�迭�� ���
			//System.out.println("��� "+ s.length);
			//System.out.println("ù���� ���� �� ��  :"+s[0].length);
		//�ι������� ����°���� ����?\
			//System.out.println("s[1][2] : " +s[0] );
			//ù��°���� ������ �հ�
		//ù��°���� �հ�
			
		//�ι�° ���� ������ ¦���� ���
					
				
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			
					for	(a=0;a<=3;a++) {
						
					
					if(s[a][2]%2==0) {
						
						c=s[a][2];
						d+=c;
						count++;
					}
					
					}
					System.out.println(d);
					System.out.println("����� :" +d/(double)count);
					
						
						
						
						
						
		//����°���� ¦���� ����� ���Ͻÿ�
				
			
		
		
		
		
	}

	public int test2() {

		return 1;

	}

	public static void main(String[] args) {
		ArrayExam3 kd = new ArrayExam3();
		kd.test1();
		kd.test2();

	}

}

package d_array;
/*
 * 1)������ �迭�� �����ϰ� �ʱⰪ 10�� ����(scores)
 * 2)�ִ밪, �ּҰ��� ������ ���� ����(max, min)
 * 3)max�� �迭�� ù��°���� ����(�迭�� ù��° ���� �ִ밪���� �����ϰ� ����)
 * 4)min�� �迭�� ù��°���� ����(�迭�� ù��° ���� �ּҰ����� �����ϰ� ����)
 * 5)�ִ밪�� ã������ ����~
 * 6)�ּҰ��� ã������ ����~
 * 7)�ִ밪, �ּҰ� ���
 */
public class ArrayExam2 {
	ArrayExam2(){
		// 1) ~ 4)
		int[] scores = new int[]{15,89,123,15,13,54,89,23,45,68};
		int max = scores[0];
		int min = scores[0];
		//5)
		for(int i = 1; i<scores.length ; i++) {
			if(max < scores[i]) max = scores[i];
		}
		//6)
		for(int i = 1; i<scores.length ; i++) {
			if(min > scores[i])min = scores[i];
		}
		//7)
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	public static void main(String [] args) {
		ArrayExam2 a = new ArrayExam2();
	}
}

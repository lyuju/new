/*
 * ����5)ForExam.java
 * 1~1000������ �հ谡 5000�� �Ѵ� ������ ���� ����Ͻÿ�.
 * �ؼ�
 * 1) 1~1000���� ����
 * 2) ���εǴ� ���߿� �հ踦 ����
 * 3) ����� ����� 5000���� ũ�ų� ���ٶ�°��� �Ǻ�
 */
package c_control;

public class ForExam5 {
	ForExam5() {
		// int num = 0; (�ʿ���¼�)
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			// sum = sum + i;(���� �ۼ����ڵ�)
			sum += i;
			if (sum >= 4000) {
				System.out.println(i + "," + sum);
				break;
			}
		}
	}
}

/*---------------------------------
 * ������ ���
 * �ۼ��� : chg
 * �ۼ��� : 2019.12 
 ---------------------------------*/

package c_control;

public class ForExam2 {
	ForExam2() {
		int m = 2;
		int sum = 0;

		System.out.println(m + "���Դϴ�.");
		for (int n = 1; n < 10; n++) {
			sum = m * n;
			System.out.println(m + " x " + n + " = " + sum);
			System.out.println(m + " x " + n + " = " + (m * n));
		}
		/*for(int i = 2; i <= 99; i++) {
			System.out.println(i + "���Դϴ�.");
			for (int n = 1; n <= 9; n++) {
				System.out.println( i + "x" + n + "=" + (i * n));
			}
		}*/
	}

}

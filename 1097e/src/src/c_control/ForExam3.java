/*--------------------------
 * �Ʒ��� ���� �������� �ִ�. 
 * x���� 1~100������ �ظ� ���Ͽ� ����Ͻÿ�.
 * y = 3x + 1;
 * 
 * 1, 4
 * 2, 7
 * 
 * ...
 * 
 * 100, 301
 */

package c_control;

public class ForExam3 {
	int x = 0;
	int y = 0;
	
	ForExam3(){
		for(int x = 0 ; x < 101 ; x++ ) {
			y = x * 3 + 1;
			System.out.println( x +","+ y );
			
			System.out.printf("(%4d, %4d) \n", x, y);
			
		}
	}

}

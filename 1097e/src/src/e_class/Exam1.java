/*1)�� ������ ���޹޾� �հ踦 ��ȯ�ϴ� �޼��带 ����(sum)
 * 2)�� ����(x, y)�� ���޹޾�x~y������ �հ踦 ���Ͽ� ����(sum2)
 * 3. ����, ���ΰ��� �Ǽ������� ���޹޾� �簢���� ���̸� ����Ͽ� ����
 * (sum3)
 * 4. ������ ���� �ϳ� ���޹޾� �������� �ϳ��� ���ڿ��� ����� ����
 * (gugudan) 
 */

package e_class;

public class Exam1 {
	
	
	public int sum(int x, int y) {
		int sum = x+y;
		System.out.println(x + "+" + y + "�� ���� : " +sum);
		return sum;		
	}
	public int sum2(int x, int y) {
		int sum = 0;
		for(int i = x; i<=y ; i++) {
			sum +=i;
		}
		return sum;
	}
	double sum3(double n1, double n2) {
		return n1*n2;
	}
	public String gugudan(int dan) {
		String r = "";
		for(int i = 1; i<=9; i++) {
			int result = dan*i;
			System.out.println(dan +"*" + i + "=" + result);
			r += (dan +"*" + i + "=" + result);
			r += "\n";
		}
		return r;
	}
	

}

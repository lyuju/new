/* 2019.11.29(��)
 * �ζ� �����Ҽ� �ִ� ����� ���� Ŭ����
 * ������ �� �ִ� �޼ҵ� ����, ����ϴ� �޼ҵ� ���� �ۼ���. ���� ���θ���.
 */

package c_control;

public class Lotto {
	private int n[] = new int[6];
	int count = 0;	
	
	//�����߻� (�ζǹ�ȣ �߻�)
	void process() {
		boolean b = false; //�ߺ����� �ʾҴ�.
		this.n[count] = (int)(Math.random()*45)+1;
		
		for(int i=0 ; i < count ; i++) {
			if( n[i] == n[count]) {
				b = true;
			}
		}
		
		if( !b ) {	
			count++;			
			prn();
		}		
	}
	//������� (�ζǹ�ȣ ���)
	void prn() {
		System.out.println(n[count-1]);
	}
	public static void main(String [] args) {
		Lotto k = new Lotto();
		int a = 6;
		for( ; k.count<a ; ) {
		k.process();			
		}
		
	}
	
		
	/*type1() {
	}
	
	public static void main(String [] args) {
		Lotto add = new Lotto();
		add.type1();		
		System.out.println(add);
	}*/

}

package c_control;

public class Lotto {

	private/* �ɼ�*/ int n[] = new int[6];//new�� ������� ������ ������, n�� ������ ���� 6���� ������ �� �ִ�.
	int count = 0;
	
  void process() {
	boolean b = false;//�ߺ����� �ʾҴ�.	
	this.n[count]= (int)(Math.random()*45)+1;
	for(int i =0; i<count; i++) {
		if( n[i] == n[count]) {
			b=true;
		}
	}
	
	if(!b) {
		count++;
		prn();
		}
	}
    void prn() {
    	System.out.println(n[count-]);
    	
    }

    public static void main(String[] args) {
	Lotto da= new Lotto();
	int a = 6;
	for(;da.count<a;) {
		da.process(); 
	}
		
	
	
}
}

package c_control;

public class Lotto {

	private/* 옵션*/ int n[] = new int[6];//new로 만들었기 때문에 참조형, n은 정수형 변수 6개를 저장할 수 있다.
	int count = 0;
	
  void process() {
	boolean b = false;//중복되지 않았다.	
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

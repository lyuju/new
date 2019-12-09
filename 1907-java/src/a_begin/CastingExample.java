package a_begin;

public class CastingExample {

CastingExample(){
	int intvalue = 44032;
	char charvalue = (char) intvalue;
	System.out.println(charvalue);
	
	long longvalue = 500;
	/*long longvalue = 500L;
	  500뒤에 L을 붙여야 21억이상을 쓸 수 있다. 그냥 쓸 수 있는 이유는 
	 * 자동프로모션돼서 long에서 int로
	*/
	intvalue = (int) longvalue;
	System.out.println(intvalue);
	
	
	double doublevalue = 3.14;
	intvalue = (int) doublevalue;
	System.out.println(intvalue);
	
	double d2 = 10/3;
	System.out.println(d2);
	
	
	
}

public static void main(String[] args) {
  new CastingExample();
}
}

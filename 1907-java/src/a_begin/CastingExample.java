package a_begin;

public class CastingExample {

CastingExample(){
	int intvalue = 44032;
	char charvalue = (char) intvalue;
	System.out.println(charvalue);
	
	long longvalue = 500;
	/*long longvalue = 500L;
	  500�ڿ� L�� �ٿ��� 21���̻��� �� �� �ִ�. �׳� �� �� �ִ� ������ 
	 * �ڵ����θ�ǵż� long���� int��
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

package a_begin;

public class PromotionExample {
	int a=100;
	int b=100;
	int c=0;
	
	//�����ڷ� �ҷ����� �޼���
	PromotionExample(){
		c=a+b;
		System.out.println(c);

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubeleValue = intValue;
		System.out.println(doubeleValue);
	}
	
	public static void main(String[] args) {
		new PromotionExample();
	}

}

package c_control;

public class SwitchExample {
	public SwitchExample() {
		String a = "";
		int num = 0;
		
		for( int i = 0 ; i < 500 ; i=i+1) {			
			num = (int)(Math.random()*8) + 1;
			if( num<1 || num>6 ) {
				System.out.println("��ȣ�� ���� �߻�");
				System.exit(0);
			}
			
		switch(num) {
		case 1 :
			a= "1 �Դϴ�.";
			break;
		case 2 :
			a= "2 �Դϴ�.";
			break;
		case 3 :
			a = "3 �Դϴ�.";
			break;
		case 4 :
			a = "4 �Դϴ�.";
			break;
		case 5 :
			a = "5 �Դϴ�.";
			break;
		default :
			a = "6 �Դϴ�.";
			break;
			} //switch ��
		System.out.println(a);
		}//for�� ��
	}
}

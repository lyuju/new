package c_control;

public class Switch3 {
	
	Switch3() {
		char a = 'B';
		
		switch(a) {
		case 'A':
		case 'a':
			System.out.println("���ȸ���Դϴ�.");
			break;
		case 'B':
		case 'C':
		case 'd':
			System.out.println("�Ϲ�ȸ���Դϴ�.");
			break;
			default:
			System.out.println(a);
		}
	}

}

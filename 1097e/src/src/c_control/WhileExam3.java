package c_control;

public class WhileExam3 {
	
	WhileExam3() throws Exception { //throws Exception �浹���� ����ó��
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("---------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("---------------");
				System.out.println("���� :");
			}
			keyCode = System.in.read();
			
			if( keyCode == 49 ) { //1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			}else if (keyCode == 50) {//2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			}else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}

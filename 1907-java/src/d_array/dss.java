package d_array;

import java.util.Scanner;

public class dss {
	dss() throws Exception {

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
        
		while (run) {
			int x = 0;
			int f = 0;
			int z = 0;

			int keyCode = 0;
			System.out.println("keyCode : " + keyCode);
			
				System.out.println("-----------------------");
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("-----------------------");
				System.out.print("����> ");
			}
			System.out.println("keyCode : " + keyCode);
			keyCode = System.in.read();

			if (keyCode == 49) {
				System.out.println("���ݾ�> ");
				x = scanner.nextInt();
				balance = x;

				continue;

			} else if (keyCode == 50) {
				System.out.println("��ݾ�>");
				f = scanner.nextInt();
				balance = balance - f;
				continue;
			} else if (keyCode == 51) {
				System.out.println("�ܰ�>" + balance);
				System.out.println("keyCode : " + keyCode);
				continue;

			} else if (keyCode == 52) {
				run = false;
			}

		} // end of while
		System.out.println("���α׷�����");
	}

	public static void main(String[] args) throws Exception {
		new dss();

	}

}

package c_control;

import java.util.Scanner;

public class Exercise08 {
	Exercise08(){
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����>");
			
			int menu = scanner.nextInt();
			switch(menu) {
				case 1:
					System.out.print("���ݾ�>");
					int v = scanner.nextInt();
					balance += v;
					break;
				case 2:
					System.out.print("��ݾ�>");
					int v2 = scanner.nextInt();
					
					if(v2>balance) {
						System.out.println("�ܾ��� �����մϴ�.");
					}else {
						balance -= v2;
					}
					break;
				case 3:
					System.out.println("�ܾ�>"+balance);
					break;
				case 4:
					run = false;
					break;
			}
			

		}
		System.out.println("���α׷� ����.");
	}

	public static void main(String [] args) {
		Exercise08 a = new Exercise08();
	}
}

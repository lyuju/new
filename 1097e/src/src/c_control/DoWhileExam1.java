package c_control;

import java.util.Scanner;

public class DoWhileExam1 {
	DoWhileExam1(){
		System.out.println("q�� ������ �����");
		Scanner scanner = new Scanner(System.in);
		String inputString = null;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		}while( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
	}

}

package c_control;

import java.util.Scanner;

public  class sosu  {
	sosu () throws Exception {
	boolean run = true;
	
	
	while (run)  {
		
		
		if(keyCode!=13 && keyCode!=10) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택>");
		}
		
		
		if(keyCode ==49) {
			System.out.println(1);
		}
		else if(keyCode ==50) {
			System.out.println(2);
		}
		else if(keyCode ==51) {
			System.out.println(3);
		}
		else if(keyCode ==52) {
			System.out.println(4);
		}
		
		keyCode = System.in.read() ;
		
		Scanner scanner = new Scanner(System.in);
		inputString=scanner.nextInt();
		
		
		
		
		
	}
	System.out.println("프로그램종료");
	}
}











	
	
	
	
		
		
		

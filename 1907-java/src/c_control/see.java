package c_control;

public class see {
	see()throws Exception{
		
		boolean run = true;
	

	
	
	while (run)  {
		int keyCode =0;
		if(keyCode!=13 && keyCode!=10) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
		}
		keyCode = System.in.read();				
	
		if(keyCode ==49) {
			System.out.println("예금액>");
		}
		else if(keyCode ==50) {
			System.out.println("출금액>");
		}
		else if(keyCode ==51) {
			System.out.println("잔고>");
		}
		else if(keyCode ==52) {
			run = false;
		}
		
	
	}
	System.out.println("프로그램종료");
}
	public static void main(String[] args) {
		new see();
			
		
	}
}
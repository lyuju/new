package c_control;

public class see {
	see()throws Exception{
		
		boolean run = true;
	

	
	
	while (run)  {
		int keyCode =0;
		if(keyCode!=13 && keyCode!=10) {
			System.out.println("-----------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
		}
		keyCode = System.in.read();				
	
		if(keyCode ==49) {
			System.out.println("���ݾ�>");
		}
		else if(keyCode ==50) {
			System.out.println("��ݾ�>");
		}
		else if(keyCode ==51) {
			System.out.println("�ܰ�>");
		}
		else if(keyCode ==52) {
			run = false;
		}
		
	
	}
	System.out.println("���α׷�����");
}
	public static void main(String[] args) {
		new see();
			
		
	}
}
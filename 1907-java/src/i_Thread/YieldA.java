package i_Thread;

public class YieldA extends Thread{

	
	
	boolean stop= false;
	boolean work= true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("YieldA.....");
			}else {
				Thread.yield();
			}
				
		
		}
		System.out.println("YieldA Á¾·á");
		
	}
	
	
}

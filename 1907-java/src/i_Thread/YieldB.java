package i_Thread;

public class YieldB extends Thread{

	
	boolean stop= false;
	boolean work= true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("YieldB.....");
			}else {
				Thread.yield();
			}
				
		
		}
		System.out.println("YieldB Á¾·á");
		
	}
	
	
	
	
	
}

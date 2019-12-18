package i_Thread;

public class user2 extends Thread{

	Calculator c;
	
	void setCalculator(Calculator c) {
		this.c=c;
		this.setName("user2");
	}
				
		
	
	
	public void run() {
    c.setMemory(50);		
		
	}
	
	
}

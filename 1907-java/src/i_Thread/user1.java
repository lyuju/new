package i_Thread;

public class user1 extends Thread{

	Calculator c;
	
	
	
	
	
	
	public Calculator getC() {
		return c;
	}






	public void setCalculator(Calculator c) {
		this.c = c;
		this.setName("user1");
	}






	@Override
	public void run(){
		c.setMemory(100);
	}
	
	
	
	
	
}

package i_Thread;

public class NotiaB extends Thread{
	 
	private WorkObject obj;
	
	public NotiaB(WorkObject obj){
		this.obj=obj;
	}
	
	
	public void run() {
		for(int i=0;i<10;i++) {
			obj.methodB();
		}
}
}
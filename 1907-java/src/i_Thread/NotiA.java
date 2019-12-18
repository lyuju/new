package i_Thread;

public class NotiA extends Thread{
 
	private WorkObject obj;
	
	public NotiA(WorkObject obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			obj.methodA();
		}
	}
	
	
}

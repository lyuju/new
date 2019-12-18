package i_Thread;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i =1;i<=10;i++) {
			Thread t = new CalcThread("thread"+i);
			
		if(i!=10) {
			t.setPriority(1);
		}else {
			t.setPriority(Thread.MAX_PRIORITY);
		}
		t.start();
	}
	}
	
	
}

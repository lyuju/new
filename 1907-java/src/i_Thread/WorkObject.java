package i_Thread;

public class WorkObject {
 
	
	public synchronized void methodA() {
  System.out.println("Thread�� methodA�� �����.");
  notify(); //�������� �Ǿ� �ִ� �����带 ���� 
 
  try {
	wait();
} catch (InterruptedException e) {
	
}
 
 }
 
 public synchronized void methodB() {	 
	
	 System.out.println("Thread�� methodB�� �����.");
	 notify(); //�������� �Ǿ� �ִ� �����带 ���� 
	 
	  try {
		wait();
	} catch (InterruptedException e) {} 
		
	
 
 
 }
	 
}

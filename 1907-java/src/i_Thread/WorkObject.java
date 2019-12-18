package i_Thread;

public class WorkObject {
 
	
	public synchronized void methodA() {
  System.out.println("Thread의 methodA가 실행됨.");
  notify(); //실행중지 되어 있는 스레드를 깨움 
 
  try {
	wait();
} catch (InterruptedException e) {
	
}
 
 }
 
 public synchronized void methodB() {	 
	
	 System.out.println("Thread의 methodB가 실행됨.");
	 notify(); //실행중지 되어 있는 스레드를 깨움 
	 
	  try {
		wait();
	} catch (InterruptedException e) {} 
		
	
 
 
 }
	 
}

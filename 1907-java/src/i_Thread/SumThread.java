package i_Thread;

public class SumThread extends Thread{

	long sum =0;

	public long getsum() {
		return sum;
	}

	public void setsum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
	for(int i=1;i<=100;i++) {
		sum+=i;
	}
	try {
		Thread.sleep(1);
	}catch(Exception ex) {}
	
	}
}
	
	
	
	
	
	

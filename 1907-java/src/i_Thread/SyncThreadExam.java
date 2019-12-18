package i_Thread;

public class SyncThreadExam {

	public static void main(String[] args) {
	Calculator c = new Calculator();
    user1 u1 = new  user1();
    user2 u2 = new  user2();
    
    
    u1.setCalculator(c);
    u2.setCalculator(c);
    
    u1.start();
    u2.start();
    
	}

}

package i_Thread;

public class JoinExam {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		
		try {
			st.join();
		}catch(Exception ex) {}
		
		System.out.println("1~100ÀÇ ÇÕ°è : "+st.sum);

	}

}

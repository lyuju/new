package i_Thread;

public class YieldExam {

	public static void main(String[] args) {
		YieldA y1 = new YieldA();
		YieldB y2 = new YieldB();

		y1.start();
		y2.start();

		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
		}
		y1.work = false;

		try {
			Thread.sleep(500);
		} catch (Exception ex) {
		}
		y1.work = true;
		
		
		y1.stop=true;
		y2.stop=true;
	}

}

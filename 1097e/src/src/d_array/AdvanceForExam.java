package d_array;

public class AdvanceForExam {
	
	AdvanceForExam(){
		int[] a = {23,21,43,46,64,57,56,76,32,65,657,43};
		int sum = 0;
		double avg = 0;
		
		for(int k : a ) {
			sum += k; 
		}
		avg = (double)sum/a.length;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

	public static void main(String[] args) {
		new AdvanceForExam();
		// TODO Auto-generated method stub

	}

}

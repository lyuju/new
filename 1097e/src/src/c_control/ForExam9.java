package c_control;

public class ForExam9 {
	ForExam9() {
		for(int i = 1 ; i <= 5; i++) {
			//for(int j=1 ; j<=(6-i) ; j++) { ������ڵ�
			
			for(int j=5 ; j>=i ; j--) {     //���� �ۼ����ڵ�
				System.out.print("*");				
			}
			System.out.println();
		}
	}

}

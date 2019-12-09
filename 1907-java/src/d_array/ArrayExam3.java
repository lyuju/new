package d_array;

public class ArrayExam3 {

	// 접근자 반환형 메소드명(매개변수){...}
	// 생성자와 일반메소드가 다른것은 반환형이없다. 반환형 있으면 무조권 메소드
	/*
	 * 생성자에서 호출하거나 메인에서 호출 클래스안에서 호출할경우 앞에 this.(생략가능) 클래스밖에서는 무조권 객체명으로 접근. 메소드안에
	 * 메소드 생성불가 멤버 :메소드들은 기술된 순서에 영향 x
	 */
	public void test1() {
		//정수형 2차원 배열을 선언하고 초기값을 4행 3열의 데이터를대입
		 int count =0;
		 int x =0;
		int[][] s = new int[][] {
			{1, 2, 3},
			{2, 3, 3},
			{4, 5, 5},
			{7, 8, 9}	
		};
		//배열의 행수
			//System.out.println("행수 "+ s.length);
			//System.out.println("첫번쨰 행의 열 수  :"+s[0].length);
		//두번쨰행의 세번째열의 값은?\
			//System.out.println("s[1][2] : " +s[0] );
			//첫번째행의 값들의 합계
		//첫번째열의 합계
			
		//두번째 행의 값들중 짝수만 출력
					
				
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			
					for	(a=0;a<=3;a++) {
						
					
					if(s[a][2]%2==0) {
						
						c=s[a][2];
						d+=c;
						count++;
					}
					
					}
					System.out.println(d);
					System.out.println("평균은 :" +d/(double)count);
					
						
						
						
						
						
		//세번째열의 짝수의 평균을 구하시오
				
			
		
		
		
		
	}

	public int test2() {

		return 1;

	}

	public static void main(String[] args) {
		ArrayExam3 kd = new ArrayExam3();
		kd.test1();
		kd.test2();

	}

}

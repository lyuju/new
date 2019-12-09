package a_begin;

public class Score3 {
//class 안에는 필드(선언)랑 메소드만 필드를 선언하는 이유는 클래스가 가지는값
	Score3(){
		int kor =90, eng=91, pl=kor+eng;
		int a,b,c;
		a = 95; b = 80; c=a+b;
		double d = c/(double)2;
// 그냥 정수타입c계산 결과를 실수타입 d에 넣는것일뿐 자동으로 c의 계산결과가 정수에서 실수로 바뀌지않는다
//double타입 쓰기 싫으면 c/2.0으로
		System.out.println("-------------------"+"\n"+"성적 처리 결과"+"\n"+"-------------------"+"\n"+"작성일자 : 2019.11.27(수) \n작성자 : 정일영 " + "\n" + "국어 : " +a + 
				"\n" + "영어 : " + b + "\n" + "합계 : "+ c + "\n" + "평균 : " + d )
;		System.out.println(pl);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	 
		new Score3();
 }
	
	
}

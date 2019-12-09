package c_control;

public class hey {

	
	/* 모든 처리는 생성자를 사용하여 해결. 
	 *  ㄱ.특징 : 반환형이 없다.
	 *  ㄴ.성명, 주소, 연락처가 문자열로 발생한다. 
	 *     각각의 데이터를 name,address, phone에 저장
	 *  ㄷ.성적이 정수형으로 발생하여 각각 kor,ent,mat에 저장 함. 
	 *  ㄹ.저장된 성적을 사용하여 총점, 평균을 tot, avg에 저장.
	 *  ㅂ. if~else if문을 사용하요 평균값을 사용하여 학점을 구해서 문자형 변수 grade에 저장.
	 */
	//String mag = "성명 :" +name;
	//msg +="\n주소 :" + address;
	
	int a = 74; //kor
	int b = 80; //ent
	int c = 60;	//avg	
	
	
	hey(){
		String name = "일영";
		String address = "의정부";
		String phone ="010";
		System.out.println("성명 :"+name);
		System.out.println("주소 :"+address);
		System.out.println("연락처 :"+phone);
		
	}
	
	public void tot(int a,int b,int c) {
        int ed = a + b + c ;
        System.out.println("합계 :" +ed);
		
	}
	public void avg(int a,int b,int c) {
		double eb = (double)(a+b+c)/3;
		System.out.println("평균 :"+ eb);
		char grade = ' ';
		if(eb<=90) {
			grade = 'A';
			System.out.println("학점 : "+grade);
		}else {System.out.println("학점 :B");
			
		}
	}
	public static void main(String[] args) {
		hey kd = new hey();
		
		
		
		
		kd.tot(kd.a, kd.b, kd.c);
		kd.avg(kd.a, kd.b, kd.c);
		
		
		
	}
}

package b_operator;

public class Score4 {
 Score4(){
	 int kor = 50, eng = 50, mat = 50;
	 int a =(kor+eng+mat);
	 int b =(kor+eng+mat)/3;
	 
	 boolean c=(kor>=40)&&(eng<40)&&(mat>=40)&&(b>60);
	 String d =c? "합격":"불합격";
	 
	 
	 System.out.println("--------------"+"\n"+"합격 여부 통지"+"\n"+"--------------");
	 System.out.println("국어 : "+kor+"\n"+"영어 : "+ eng+"\n"+"수학 : "+mat+"\n"+
			 "총점 : "+a+"\n"+"평균 : "+b+"\n"+"결과 : "+d);
	
	 
	 //this. 를치면 로컬변수가 아니라 class 필드 변수
	 
	 
 }
	public static void main(String[] args) {
		new Score4();
	}
	
}
/*논리합 kor<40 (거짓) 불합격이 나올려면 둘중에 하나 값이 참이여야 한다
 * 
 

int a= 10;
int b= 20;

int c=0;
c+=a;// c= c + a;
= 우변에 있는 값은 좌변에 저장*/

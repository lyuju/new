package b_operator;

public class ss {

	public static void main(String[] args) {
		int a = 534;   // 연필
		int b = 30;    // 학생수
		int c = a/b;   // 학생 한 명이 가지는 연필 수
		int d = a%b;   // 남은 연필 수
		
		System.out.println("학생 한 명이 가지는 연필 수 : " + c);
		System.out.println("남은 연필 수 : "+d);
		
		
		
		double e = 12365.24;
		double f = (int)(e+99.999)/100*100;
		System.out.println(f);
		//자바의 int는 소수점 이하는 절삭해서 나오기 때문에
		
		//가. 세금계산 10단위 이하의 금액은 무조건 절삭하여 과금하시오.
		
		//나. 이자계산 10단위 이하의 금액은 무조건 절상하시여 지금하시오.
		//int f = e/100*100+100;
		
		//h가 나머지 
		double h = (double)e%100;
		double g = e-h+100;
		System.out.println(g);
		
		//(10+5)/7 소수자릿수가 나오도록
		
		double k = (double)(10+5)/7;
		System.out.println(k);
		
	}

}

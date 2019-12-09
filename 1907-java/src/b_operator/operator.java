/*
 * 작성일자 : 2019.11
 * 작성자 : jiy
 * 각종 연산자에 대한 서플
 */

package b_operator;

public class operator {
 operator(){
	 //나머지 연산자
	 System.out.println(12%5);
	 //나머지 연산자와 3항연산자
	 int n = 234;
	 String r = (n%2==0)?"짝수":"홀수";
	 System.out.println(r);
	 
	 //증감 연산자
	 // 전치/후치
	 int a = 10 , b = 10;
	 a++;
	 ++b;
	 System.out.println(a +"," +b);
	 
	 int c = a++ , d = ++b;
	 System.out.println(c + ","+ d);
	 System.out.println(a +"," +b);
	 
	 String name = "박";
	 String irum = "박";
	 String irum2 = new String("박");
	 
	 System.out.println(name==irum);
	 System.out.println(name==irum2);
	 
	 System.out.println(name.equals(irum));
	 System.out.println(name.equals(irum2));
	 
 }
//()를 안넣으면 메소드가 아니다	
	public static void main(String[] args) {
	 new operator();
	 
	 
	 
 }
 
}

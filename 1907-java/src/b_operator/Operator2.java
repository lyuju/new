package b_operator;

public class Operator2 {
 Operator2(){
	 int kor = 90 , eng = 40;
	 boolean b =(kor>=60) && (eng>=60);
	 System.out.println(b);
	 
	 boolean c =(kor>=60) | (eng>=60);
	 System.out.println(c);
	 
 }
 public static void main(String[] args) {
	 new Operator2();
	 
 }
}

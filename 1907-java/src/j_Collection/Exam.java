package j_Collection;

public class Exam {
  final String a;
  
  
  public Exam(String a) {
	  this.a=a;
	  
	  
  }
  public static void main(String[] args) {
	  String d="À×·Á";
	  String de="À×·Ádd";
	  Exam b=new Exam(d);
	  System.out.println(b.a);
	  Exam b1=new Exam(de);
	  de=b.a;
	  System.out.println(de);
	  
	  
  }
}

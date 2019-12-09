package e_class;

public class ArrayParam2 {
	
	void input(Student s) {
		s.prn();
	}
	void input(car c) {
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.maxSpeed);
	    
	}
	
	

	public static void main(String[] args) {
		ArrayParam2 ap2=new ArrayParam2();
		Student std = new Student();
		car ca = new car();
		ap2.input(ca);
        ap2.input(std);
        System.out.println();
        car c1= new car();
        ap2.input(c1);
        car c2 = new car("º¼º¸","»¡°­",400);
        ap2.input(c2);
        
	}

}

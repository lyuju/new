package e_class;

public class ArrayParam2 {
	
	void input(int s) {
		
	}
	void input(Student s) {
		s.prn();		
	}
	//�Ű����� ������ Car�� �޼���
	void input(Car a) {
		System.out.println(a.model);
		System.out.println(a.color);
		System.out.println(a.maxSpeed);
	}

	public static void main(String[] args) {
         ArrayParam2 ap2 = new ArrayParam2();
         
         Student std = new Student();
         ap2.input(std);
         System.out.println("-----------------");
         Car c1 = new Car();
         ap2.input(c1);
         Car c2 = new Car("����", "����", 400);
         ap2.input(c2);
         		

	}

}

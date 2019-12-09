package e_class;

/*1.매개변수가 없는 생성자로 개체를 생성하면 이름, 주소, 연락처를 
 * "홍길동" "종로구" "010-1111-1111"으로 필드를 초기화
 * (irum. address, phone)
 * 2.이름을 파라메터로 전달하면 전달된 이름만 필드에 적용되는 생성자를 중복 선언 하시오.
 * 3.이름 ,주소 ,연락처를 파라메터로 전달하면 모든 값을 필드에 적용하는 생성자를 중복 선언하시오.
 * 
 */
public class Student {
    String irum = " ";
    String address =" ";
    String phone = " ";
    Student(){
    	this.irum = "홍길동";
        this.address ="종로구";
        this.phone = "010-1111-1111";
    }
     Student(String irum) {
    	 this.irum = irum;
         
    	 
     }
     Student(String irum,String address,String phone){
    	 this.irum = irum;
         this.address =address;
         this.phone = phone;
    	
     }	
    	void prn() {
    		this.irum = "kaa";
    		System.out.println(irum);
    	}
    
    
    
    
    public static void main(String[] args) {
    	
    Student s = new Student();
	Student s1 = new Student(" ");
	Student s2 = new Student("",""," ");	
	s.prn();
	
	System.out.println(s.irum);
	System.out.println(s.address);
	System.out.println(s.phone);

    
	
	
	}

}

package e_class;

/*1.�Ű������� ���� �����ڷ� ��ü�� �����ϸ� �̸�, �ּ�, ����ó�� 
 * "ȫ�浿" "���α�" "010-1111-1111"���� �ʵ带 �ʱ�ȭ
 * (irum. address, phone)
 * 2.�̸��� �Ķ���ͷ� �����ϸ� ���޵� �̸��� �ʵ忡 ����Ǵ� �����ڸ� �ߺ� ���� �Ͻÿ�.
 * 3.�̸� ,�ּ� ,����ó�� �Ķ���ͷ� �����ϸ� ��� ���� �ʵ忡 �����ϴ� �����ڸ� �ߺ� �����Ͻÿ�.
 * 
 */
public class Student {
    String irum = " ";
    String address =" ";
    String phone = " ";
    Student(){
    	this.irum = "ȫ�浿";
        this.address ="���α�";
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

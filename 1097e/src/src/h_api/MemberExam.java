package h_api;

import java.util.Arrays;

public class MemberExam {
	
	public static void main(String[] args) {
		Member ori = new Member("blue", "hong", "1234", 25, true);
		
		Member cloned = ori.getMember();
			
		System.out.println("������ ��ü�� �ʵ尪");
	    System.out.println("id : " + cloned.id);
	    System.out.println("name : " + cloned.name);
	    System.out.println("password : " + cloned.password);
	    System.out.println("age : " + cloned.age);
	    System.out.println("adult : " + cloned.adult);
	    
	    cloned.scores[0] = 100;
	    System.out.println(Arrays.toString(ori.scores));
	    System.out.println(Arrays.toString(cloned.scores));
	    
	    cloned.car.model = "�ҳ�Ÿ";
	    
	    System.out.println(ori.car.model);
	    System.out.println(cloned.car.model);
		
		}

}

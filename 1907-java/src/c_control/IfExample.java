package c_control;

public class IfExample {
//모든 변수는 소문자로 시작 (관례
 int type1(){
	int s= 93;
	if(s>=90) {
		System.out.println("a");
		System.out.println("합격입니다");
	}else {
		System.out.println("b");
	}
	 
	 return/*보고합니다란 뜻*/s ;
				}
	
 
 String type2(){
	 String r = null;//null 주소가 없다는 뜻
	 
	 int score = 85;
	 
	 if(score>=80) {
		 r= ("a");
		 r= r+"\n합격";
	 }else if(score>=7){
		 r= ("b");
	}
	 type4();
	 return r;
	 
	}
	
 char type3() {
	 char f=' ';//''한칸을 안뛰우고쓰면 널타입인데 null은 2byte라 못쓴다
	 int d = 90;
	 if(d>=90) 
		 f = 'a';
	 else if(d>80) 
		 f = 'b';
	 
	 
	 
	 
	 return f;
	 
	 
	 
	 
 }
 //반환형이 없을경우 void를 쓴다
 
 void type4() {
	 int a = 50;
	 String result="";
		if (a>=0 && a<=100) {
			
			
		if(a>=60) {
			result= "합격";
		}if(a<60) {
			result= "불합격";
		}
		}
		else{
			result= "성적오류";
		}
		System.out.println(result);
		}

 
 
 
 
 
 
 public static void main(String[] args){
	IfExample obj = new IfExample();//생성자를 기술하지 않았기 때문에 jvm이 매개변수가 없는 생성자를 임대
	 char k = obj.type3();//==System.out.println(obj.type3());
	 
	 
	 
	 
	 
 }
}


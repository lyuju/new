package c_control;

public class IfExample {
//��� ������ �ҹ��ڷ� ���� (����
 int type1(){
	int s= 93;
	if(s>=90) {
		System.out.println("a");
		System.out.println("�հ��Դϴ�");
	}else {
		System.out.println("b");
	}
	 
	 return/*�����մϴٶ� ��*/s ;
				}
	
 
 String type2(){
	 String r = null;//null �ּҰ� ���ٴ� ��
	 
	 int score = 85;
	 
	 if(score>=80) {
		 r= ("a");
		 r= r+"\n�հ�";
	 }else if(score>=7){
		 r= ("b");
	}
	 type4();
	 return r;
	 
	}
	
 char type3() {
	 char f=' ';//''��ĭ�� �ȶٿ���� ��Ÿ���ε� null�� 2byte�� ������
	 int d = 90;
	 if(d>=90) 
		 f = 'a';
	 else if(d>80) 
		 f = 'b';
	 
	 
	 
	 
	 return f;
	 
	 
	 
	 
 }
 //��ȯ���� ������� void�� ����
 
 void type4() {
	 int a = 50;
	 String result="";
		if (a>=0 && a<=100) {
			
			
		if(a>=60) {
			result= "�հ�";
		}if(a<60) {
			result= "���հ�";
		}
		}
		else{
			result= "��������";
		}
		System.out.println(result);
		}

 
 
 
 
 
 
 public static void main(String[] args){
	IfExample obj = new IfExample();//�����ڸ� ������� �ʾұ� ������ jvm�� �Ű������� ���� �����ڸ� �Ӵ�
	 char k = obj.type3();//==System.out.println(obj.type3());
	 
	 
	 
	 
	 
 }
}


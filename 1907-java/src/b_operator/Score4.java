package b_operator;

public class Score4 {
 Score4(){
	 int kor = 50, eng = 50, mat = 50;
	 int a =(kor+eng+mat);
	 int b =(kor+eng+mat)/3;
	 
	 boolean c=(kor>=40)&&(eng<40)&&(mat>=40)&&(b>60);
	 String d =c? "�հ�":"���հ�";
	 
	 
	 System.out.println("--------------"+"\n"+"�հ� ���� ����"+"\n"+"--------------");
	 System.out.println("���� : "+kor+"\n"+"���� : "+ eng+"\n"+"���� : "+mat+"\n"+
			 "���� : "+a+"\n"+"��� : "+b+"\n"+"��� : "+d);
	
	 
	 //this. ��ġ�� ���ú����� �ƴ϶� class �ʵ� ����
	 
	 
 }
	public static void main(String[] args) {
		new Score4();
	}
	
}
/*���� kor<40 (����) ���հ��� ���÷��� ���߿� �ϳ� ���� ���̿��� �Ѵ�
 * 
 

int a= 10;
int b= 20;

int c=0;
c+=a;// c= c + a;
= �캯�� �ִ� ���� �º��� ����*/

package d_array;

public class fff {
	void ForExam8(){
		 int c= 0;
		 int s1=0;
		 int s10=0;
		 int s20=0;
		 int s30=0;
		 int s40=0;
		 int s50=0;
		 int s60=0;
		 int s70=0;
		 int s80=0;
		 int s90=0;
		 
		 
		 for(int b=1;b<=1000;b++){
		 c =(int)(Math.random()*100)+1;
		 switch(c/10){
		 case 1 : s1++; break;
		 case 2 : s10++;break;
		 case 3 : s20++;break;
		 case 4 : s30++;break;
		 case 5 : s40++;break;
		 case 6 : s50++;break;
		 case 7 : s60++;break;
		 case 8 : s70++;break;
		 case 9 : s80++;break;
		 case 10 : s90++;break;
		 }
		 }
		 
		System.out.println("���ڸ� :" +s1+"��");
		System.out.println("10�ڸ� :" +s10+"��");
		System.out.println("20�ڸ� :" +s20+"��");
		System.out.println("30�ڸ� :" +s30+"��");
		System.out.println("40�ڸ� :" +s40+"��");
		System.out.println("50�ڸ� :" +s50+"��");
		System.out.println("60�ڸ� :" +s60+"��");
		System.out.println("70�ڸ� :" +s70+"��");
		System.out.println("80�ڸ� :" +s80+"��");
		System.out.println("90�ڸ� :" +s90+"��");
	}
	public static void main(String[] args) {
		fff ad = new fff();
		ad.ForExam8();
			
	}
}

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
		 
		System.out.println("단자리 :" +s1+"개");
		System.out.println("10자리 :" +s10+"개");
		System.out.println("20자리 :" +s20+"개");
		System.out.println("30자리 :" +s30+"개");
		System.out.println("40자리 :" +s40+"개");
		System.out.println("50자리 :" +s50+"개");
		System.out.println("60자리 :" +s60+"개");
		System.out.println("70자리 :" +s70+"개");
		System.out.println("80자리 :" +s80+"개");
		System.out.println("90자리 :" +s90+"개");
	}
	public static void main(String[] args) {
		fff ad = new fff();
		ad.ForExam8();
			
	}
}

package c_control;

public class Main {
 Main(){
	int totm=4530;
	int base =2000;
	int baseprice =3000;
	int mprice =500;
	int m =0;
	int totprice = 0;
	m = totm-base;
	
	 if(m>0) {
		 int v =m/200;
		 if(m%200>0) {
			 v++;
		 }
		 totprice = baseprice +(500*v);
	 }else {
		 
		totprice=3000;
	 }
 }
	 public static void main(String[] args) {
		 
 }
}

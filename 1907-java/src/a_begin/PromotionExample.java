package a_begin;

import c_control.exam2;

public class PromotionExample {

 
 //생성자로 불려지는 메소드

/* 주행거리에 따른 택시 요금을 계산하여 출력
 * 기본 2000m 까지는 기본 요금이 3000원
 * 200m 당 추가 요금이 500원씩 과금됨. 
 * 현재 손님의 주행거리가 4530인 경우 택시 요금은
 */
public class exam2 {

	int a=2000;//기본요금
	int b;
	int c=4001;//주행거리
	int d;//추가거리
	int f;//200m 나눈거에서 나머지
	int g;//최종요금
	void taxi() {
	
	if(a<=2000) {
		b = 3000;
	}if(c>a) {
		d=(c-a)/200; //d가 추가 거리
		f=(c-a)%200;
		}if(f>0){
			d++;
			g=b+(d*500);
			System.out.println(g);
		
		}else {
			g=b+(d*500);
			System.out.println(g);
		
		}
			
}
	public static void main(String[] args) {
	exam2 ad = new exam2();
	ad.taxi();
	
	
	
	
	
}
 }
	 

 
 

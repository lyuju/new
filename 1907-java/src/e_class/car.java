package e_class;

public class car {
String model ="그랜져"; //필드
String color ="까망";
int maxSpeed=0;

car(){}
car(String model){	
	this.model = model;//this.model 클래스변수
	
}//String model = 지역형 변수
car(String model,String color){
	
	
}
public int speedup(int speed) {
	if(speed>this.maxSpeed) {
	this.maxSpeed=speed;
	}
			return 0;
}

public void speedUp1() {
	this.maxSpeed +=10;
}
public void speedDown() {
	this.maxSpeed -=10;
}
car(String model,String color, int maxSpeed){
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
}
	
public static void main(String[] args) {
	car c1 = new car();//그랜져,까망,maxSpeed=0
	car c2 = new car("a");
	car c3 = new car(""," ");
	car c4 = new car("bmw","노랑 ",100);
	
	c1.maxSpeed = 200;
	
	System.out.println(c1.model);
	System.out.println(c1.color);
	System.out.println(c1.maxSpeed);
	
	System.out.println(c4.model);
	System.out.println(c4.color);
	System.out.println(c4.maxSpeed);
	
	c1.speedUp1();
	System.out.println(c1.maxSpeed);
}

}

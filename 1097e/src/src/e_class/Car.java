/*2019.12.06
 * �Ű�����
 */

package e_class;

public class Car {
	String model = "�׷���";
	String color = "���";
	int maxSpeed = 0;
	
	Car(){ }
	Car(String m){//������ ����
	    this.model = m;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}	
	public void speedUp(){
		this.maxSpeed += 10;
	}
	public void speedDown() {
		this.maxSpeed -=10;
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("�ڿ���");
		Car c3 = new Car("�ڿ���", "���");
		Car c4 = new Car("�ڿ���", "���", 300);
		
		c1.maxSpeed = 200;
		System.out.println("model : " + c1.model);
		System.out.println("color : " + c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println("c3 spac....");
		System.out.println("model : " + c4.model);
		System.out.println("color : " + c4.color);
		System.out.println("max speed : " + c4.maxSpeed);
		
		System.out.println("------------------------------");
		c1.speedUp();
		System.out.println("c1 max speed : " + c1.maxSpeed);
		
	}

}

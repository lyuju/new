package f_inheri;

public class AirPlane {
	public AirPlane() {
		System.out.println("�Ϲ� �����");
	}
	public AirPlane(int tire) {
		System.out.println("Ÿ�̾ " + tire + "���� �Ϲ� �����");
	}
	
	public void land() {
		System.out.println("�����մϴ�.");		
	}
	public void fly() {
		System.out.println("�Ϲݺ���");
	}
	public void takeoff() {
		System.out.println("�̷��մϴ�.");
	}

}

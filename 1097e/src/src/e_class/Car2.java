package e_class;

public class Car2 {
	int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	public boolean isLeftGas() {
		if(gasState) {
			System.out.println("��������");
		}
		
	}
	public void run() {
		while(true) {
			if(gas>0) {
				gas--;
				System.out.println("������ : " + gas);
			}else {
				System.out.println("��������....");
				return;
			}
		}
		
	}

}

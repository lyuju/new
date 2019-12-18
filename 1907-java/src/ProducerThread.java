
public class ProducerThread extends Thread {

	DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox=dataBox;
	}
	
	public void run() {
		for(int i=1;i<=3;i++) {
			String data = "data :"+i;
			dataBox.setData(data);
		}
	}
	
}

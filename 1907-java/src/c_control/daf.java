package c_control;

public class daf {
//퍼블릭 or 퍼블릭(X)생략 일때만 다른곳에서 클래스 간섭가능
	
	int six(){
		int r;
		r = (int)(Math.random()*45)+1;
		
		
		
		return r;
	}
	public static void main(String[] args) {
		daf obj = new daf();
		//obj는 인스턴스객체 클래스가 메모리에 올라간 뒤의 위치를 가르킴
		System.out.println(obj.six());
	}
class a{
	
}

	

}


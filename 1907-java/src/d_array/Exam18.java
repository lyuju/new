package d_array;

public class Exam18 {
	
	int[][]n= new int[5][5];
	
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	Exam18(){
		
		
		
		int x=0;
		int i=0;
		for(x=0;x<5;x++)
			for(i=0;i<5;i++) {
				n[x][i]=(int)(Math.random()*200/2)+101;
				
				//System.out.println(n[x][i]);
				c=n[x][i];
				b+=n[x][i];
				//System.out.println(c);
				if(n[0][0]<c ) {
					d=c;
					System.out.println(d+"�Ҽ�");
			}
			if(c>c || c==c) {
					e=c;
					//System.out.println(e);
				}
				System.out.println("++"+c);
				
				
			}
		System.out.println(b+"�迭");	
		
		
				
		
		
		
				
			
	}	
    		
	 void sum(){	
		
		 int d=b;
		 
		 
		
		 }
		 
			
	 
		
		
		
		
				
			
		
				
			
		
	
		


	public static void main(String[] args) {
		/*1) �迭 ��ü ���(5��5����)
          2) ��ü ������ �հ�
          3) ��ü �ּҰ�
          4) ��ü �ִ밪
          5) ������ �ִ밪�� ����Ͻÿ�.
		 */
		Exam18 kd =  new Exam18();
          kd.sum();

	}

}

package d_array;

public class ddd {
 ddd(){
	int[]s= {212,12};
    int sum =0;
    double avg =0;
    
    for(int k:s) {
    	sum+=k;
    }
    avg=(double)sum/s.length;
    System.out.println(sum);
 }
	
	public static void main(String[] args) {

new ddd();
	}

}

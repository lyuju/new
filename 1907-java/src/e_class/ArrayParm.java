package e_class;

public class ArrayParm {

	
	ArrayParm(int[] s){
	for(int i=0; i<s.length; i++) {
		//System.out.println(s[i]);
	}
		
		
		
	}	
	int arraysum(int[] s) {
		int sum =0;
		for(int i=0; i<s.length; i++) {
			sum+=s[i];
		}
		return sum;
	}
	int arrayMax(int[] s) {
		int max =s[0];
		for(int i=0;i<s.length;i++)
			if(max<s[i]) {
				max=s[i];
			}
		
		return max;
	}
	int arrayMin(int[] s) {
		int min =s[0];
		for(int i=0;i<s.length;i++)
			if(min>s[i]) {
				min=s[i];
		
	}
		return min;
			
		}
	
	int[]maxMin(int[]s){
		int max =s[0];
		int min =s[0];
		int a=0;
		for(int c=0;c<s.length;c++){
			if(max<s[c]) {
				max=s[c];
			}if(min>s[c]) {
				min=s[c];
			}
		}
		
		int[]m = new int[2];
		for(a=0;a<m.length;a++) {
			if(a==0)m[a]=max;
			else m[a]=min;
			
			
			
			//System.out.println(m[a]);
		}
		
		
		
		
		
		
		//System.out.print(m);
				return m;
	}
	public static void main(String[] args) {
		int[] abc = {4,2,37,4,5};
		ArrayParm ap1= new ArrayParm(abc);
		int hap = ap1.arraysum(abc);
		//System.out.println(hap);
		
		int dd = ap1.arrayMax(abc);
		//System.out.println(dd);
		int da = ap1.arrayMin(abc);
		//System.out.println(da);
		int[]qe=ap1.maxMin(abc);
		System.out.println(qe[0]);
		System.out.println(qe[1]);
		
		
	}
	
	
}

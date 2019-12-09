package e_class;

public class adde {
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
			
			
			
			System.out.println(m[a]);
		}
		
		
		
		
		
		
		System.out.print(m);
				return m;
	}
}

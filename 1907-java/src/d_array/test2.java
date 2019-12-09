package d_array;

import java.util.Scanner;

public class test2 {
	test2(){
		String[] names = {"a","b","c","d","e"};
		int[][] s = {
				{10,20},
				{20,30},
				{30,40},
				{40,50},
				{50,60}	
		};
		int kor =0;
		int eng =0;
		int tot =0;
		int avg =0;
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		String inputString="";
		while(!inputString.equals("quit")) {
		System.out.print("검색할이름은?");	
		
		inputString = scanner.nextLine();	
		
		
		int p =-1;
			
			for(int x=0;x<names.length;x++) {
				
				if(names[x].equals(inputString)) {
					p=x;
					kor=s[x][0];
					eng=s[x][1];
					tot= kor+eng;
					avg= tot/s[0].length;
					System.out.println(kor+","+eng+","+tot+","+avg);
					
					
				}
				
				}
				
				if(p==-1) {
					System.out.println("자료없슴");
			}	
		}
	}
		
		public static void main(String[] args) {
			//new test2();
		}
		
	}

	
			
	    
	    

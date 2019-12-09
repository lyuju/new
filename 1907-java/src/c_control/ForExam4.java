package c_control;

public class ForExam4 {
	ForExam4(){
	int count = 0;
	
for(int a=1;a<=100; a++) 
{
	for(int x=2; x<=a; x++) 
	{
		if(a%x ==0) 
		{
			count++;
		}
	
	}
	if(count==1) 
	{
		System.out.println(a);	
         }
count=0;
 }
}
}		
	
	



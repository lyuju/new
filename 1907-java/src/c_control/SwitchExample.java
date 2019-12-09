package c_control;

public class SwitchExample {
    SwitchExample(){
    int count=0;

 for(int i=2; i<=100; i++) // 1은 소수가 아니므로 2부터 시작
  {
     for(int j=2; j<=i; j++)
     {
         if(i%j ==0) 
         {
             count ++;
         }    
             
     }
     if(count==1)
     {
          System.out.print(i+" ");
        }
count=0;
}
}
}

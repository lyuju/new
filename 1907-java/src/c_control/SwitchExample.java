package c_control;

public class SwitchExample {
    SwitchExample(){
    int count=0;

 for(int i=2; i<=100; i++) // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
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

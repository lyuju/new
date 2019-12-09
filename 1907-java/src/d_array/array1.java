package d_array;

public class array1 {
array1(){

//몸무게 열명저장
double[] b = new double[10];

for(int i=0;i<10;i++) {
double c=Math.random()*100;
b[i]=c;
}
for(int i=0;i<10;i++) {
System.out.printf("%5.1f \n",b[i]);
	//배열을 선언하면서 초기값을 대입
}
//몸무계의합계와 ,평균
double han =0;
for(int i=0;i<b.length;i++) {
	han+=b[i];
}
double avg =han/b.length;
System.out.println(han);
System.out.println(avg);
	
}

}



package d_array;

public class array1 {
array1(){

//������ ��������
double[] b = new double[10];

for(int i=0;i<10;i++) {
double c=Math.random()*100;
b[i]=c;
}
for(int i=0;i<10;i++) {
System.out.printf("%5.1f \n",b[i]);
	//�迭�� �����ϸ鼭 �ʱⰪ�� ����
}
//���������հ�� ,���
double han =0;
for(int i=0;i<b.length;i++) {
	han+=b[i];
}
double avg =han/b.length;
System.out.println(han);
System.out.println(avg);
	
}

}



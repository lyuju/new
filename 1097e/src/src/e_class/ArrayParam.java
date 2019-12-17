package e_class;

public class ArrayParam {
	ArrayParam(int[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	int arraySum(int[]s) {
		int sum = 0;
		for(int i = 0 ; i<s.length; i++) {
			sum+=s[i];			
		}
		return sum;
	}
	//���޹��� �迭���� �ִ밪�� ���Ͽ� ����
    int arrayMax(int [] s) {
    	int max = s[0];
    	
    	for(int i = 0 ; i<s.length ;i++) {
    		if(max < s[i]) { 
    			max = s[i];
    		}
    	}
    	return max;
    }
    //���޹��� �迭���� �ּҰ��� ���Ͽ� ����
    int arrayMin(int[]s) {
    	int min = s[0];
    	for(int i = 0; i < s.length; i++) { 
    		
    		if(min > s[i]) {
    			min = s[i];
    		}
    	}
    	return min;		
    }
    
    //�ϳ��� �޼ҵ忡�� �ִ밪�� �ּҰ��� ���ÿ� ��ȯ�ϰ������
    //�迭�� ���ϰ����� �ϸ� ��. �迭�� �߰���.
    int[] maxMin(int[] s) {
    	int[] m = new int[2];
    	m[0] = s[0];//max
    	m[1] = s[0];//min
    	for(int i = 0; i <s.length; i++) {
    		if(m[0] < s[i]) {
    			m[0] = s[i];
    		}else if(m[1] > s[i]) {
    			m[1] = s[i];
    		}
    	}
    	
    	return m;
    }

	public static void main(String[] args) {
		int[] abc = { 1, 2, 3, 4, 5, 515, 7, 8, 9, 10 };
		ArrayParam ap1 = new ArrayParam(abc);
        int hap = ap1.arraySum(abc);
        System.out.println(hap);
        int m = ap1.arrayMax(abc);
        System.out.println("�ִ밪 : " + m);
        int n = ap1.arrayMin(abc);
        System.out.println("�ּҰ� : " + n);
        int []a = ap1.maxMin(abc);
        System.out.println("�ּҰ� : " + a[0]);
        System.out.println("�ִ밪 : " + a[1]);

	}

}

package d_array;

import java.util.Scanner;

public class arrayExam4 {
	String[] n = new String[10];
	int[][] s = new int[10][2];
	int a=0;
	int b=0;
	int count = 0; // �迭�� �Էµ� �ڷ��� ��

	arrayExam4() {
		// ���ѷ����� ���鼭 �޴��� ��� q or quit�� ����������
		// if(menu==1) input()
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		//���ÿ� �����͸� �迭�� ����
		n[0]="kim";
		n[1]="hong";
		n[2]="park";
		n[3]="lee";
		s[0][0]=90 ;s[0][1]=80;
		s[1][0]=70 ;s[1][1]=30;
		s[2][0]=60 ;s[2][1]=20;
		s[3][0]=50 ;s[3][1]=10;
		
		count=4;
		
		while (run) {
			System.out.println("1.�Է�|2.����|3.��ȸ �� ����");
			System.out.print("�޴�����:");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				this.input();
				break;
			case 2:
				this.modify();
				break;
			case 3:
				this.search();
				break;
			case 4:
				run = false;

			}
		}

	}
	// �л��� ���� ������ �迭�� �Է�

	public void input() {
		Scanner scanner = new Scanner(System.in);
		String name ="";
		int kor =0;
		int eng =0;
		int tot =0;
		double avg =0;
		
		
		System.out.print("���� : ");
		name = scanner.nextLine();
		System.out.print("���� : ");
		kor = scanner.nextInt();
		System.out.print("���� : ");
		eng = scanner.nextInt();
		
		tot = kor+eng;
		avg=(double)tot/2;
		System.out.println("���� : "+tot);
		System.out.print("��� : "+avg);
		
		n[count]=name;
		s[count][0]=kor;
		s[count][1]=eng;
		count++;
		
		System.out.println();
	}

	// �л��� ���� ������ ����
	//������ �л����� �Է¹޾� �˻�
	//���� �˻��� ������ ǥ��
	//���� �����͸� ����
	//�迭 ������ ����
	public void modify() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������ ������?");
	String findName = scanner.nextLine();
	int c=0;
	int d=0;
	
	for(int i=0;i<count;i++) {
		if(n[i].equals(findName)){
		System.out.println("������ ������?");
		String bb = scanner.nextLine();
		if("kor".equals(bb)) {
			System.out.println("���� :");
			s[i][0]=scanner.nextInt();
		}else if("eng".equals(bb)) {
			System.out.println("���� :");
			b=scanner.nextInt();
		}
       
        //s[0][i]=b; // kim�ϰ�� s[0][0]
		
		
		
		}
	
		
		
	}
	
	}

	// �л��� ���� ������ ��ȸ �� ���
	public void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�˻��� ������?");
		String findName = scanner.nextLine();
		int tot =0;
		double avg =0;
		for(int i=0; i<count ;i++) {
			if(n[i].equals(findName)) {
			tot = s[i][0]+s[i][1];
			avg=(double)tot/s.length;
				
			System.out.print(n[i]+" ");
			System.out.print(s[i][0]+" ");
			System.out.print(s[i][1]+" ");
			System.out.print(tot+" ");
			System.out.printf("%5.1f",avg+" ");
			
			//������ ����� ����Ͽ� ���
			
			
		}
		}
	}

	public static void main(String[] args) {
		new arrayExam4();

	}

}

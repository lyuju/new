package d_array;

import java.util.Scanner;

public class ArrayExam4 {
	String[] n = new String[10];
	int[][] s = new int[10][2];
	int count = 0; //�迭�� �Էµ� �ڷ��� ����
	
	//�������� ������ ���ѷ����� ���鼭 �޴��� ���, ���ܱ���
	ArrayExam4(){
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		//���ÿ� �����͸� �迭�� ����
		n[0] = "kim";
		n[1] = "hong";
		n[2] = "park";
		n[3] = "lee";
		s[0][0] = 90 ; s[0][1] = 80;
		s[1][0] = 70 ; s[1][1] = 30;
		s[2][0] = 60 ; s[2][1] = 20;
		s[3][0] = 50 ; s[3][1] = 10;
		
		count = 4;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�Է� | 2.���� | 3. ��ȸ �� ��� 4.����");
			System.out.println("-----------------------------------------");
			System.out.println("�޴����� : ");
			int menu = scanner.nextInt();
			/* if( menu ==1 ) input()
			 * else if( menu ==2 )modify()
			 * else if( menu ==3 )search()
			 */
			switch(menu) {
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
				break;
			}//-----------------------------switch end			
		}//---------------------------------while end
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
	//�л��� ���� ������ �迭�� �Է�
	public void input() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int tot = 0;
		double avg = 0;
		
		System.out.print("���� : ");
		name = scanner.nextLine();
		System.out.print("���� : ");		
		kor = scanner.nextInt();
		System.out.print("���� : ");
		eng = scanner.nextInt();
		
		tot = kor+eng;
		avg = (double)tot/2;
		
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		
		n[count] = name;
		s[count][0] = kor;
		s[count][1] = eng;
		count++;
	    
	}
	//�л��� ���� ������ ����
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�˻��� ������?");
		String modiName = scanner.nextLine();
		int kor = 0;
		int eng = 0;
		
		for(int i = 0 ; i < count ; i++) {
			if(n[i].equals(modiName)) {
				System.out.println("���� : " + n[i]);
				System.out.println("�������� : " + s[i][0]);
				System.out.println("�������� : " + s[i][1]);
				
				System.out.println("������ ������� �Է��ϼ���");
				System.out.println("���� : ");
				
				s[i][0] = scanner.nextInt();
				kor = s[i][0];
				
				System.out.println("����  " + kor);				
				System.out.println("������ ������� �Է��Ͻÿ�");
				System.out.println("���� : ");
				
				s[i][1] = scanner.nextInt();
				eng = s[i][1];
				
				System.out.println("���� " + eng);
				System.out.println("------------------------");
				System.out.println("������ ����");
				System.out.println("���� : " + s[i][0]);
				System.out.println("���� : " + s[i][1]);
			}//if end
		}//for end
		//1. ������ �л����� �Է¹޾� �˻�
		//2. �˻��� ������ ǥ��
		//3. ����
		//4. �迭 ���� ����
		
	}
	//�л��� ���� ������ ��ȸ �� ���
	public void search() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�˻��� ������?");
		String findName = scanner.nextLine();
		int tot = 0;
		double avg = 0;
		
		for(int i = 0; i < count ; i++) {
			if(n[i].equals(findName) || findName.equals("")) {
				//������ ����� ����Ͽ� ���
				tot = s[i][0]+s[i][1];
				avg = (double)tot/2.0;
				
				System.out.print(n[i] +"  ");
				System.out.print(s[i][0] + "  ");
				System.out.println(s[i][1] + "  " );
				
				
				System.out.println("���� : " + tot);
				System.out.printf("��� : %5.1f",avg);
				System.out.println();				
			}
			
		}
		
		
	}
	public static void main(String [] args) {
		new ArrayExam4();
	}

}

package c_control; //��Ű����

import java.util.Scanner; //���ɳ� ��üȣ��

public class Exercise07 { //Ŭ������, Ŭ��������
	Exercise07(){ //������
		boolean run = true; //���� ���� run�� true ����
		
		int balance = 0; // ������ ���� balance �ʱ�ȭ
		
		Scanner scanner = new Scanner(System.in); // ���ɳ� Ŭ���� ����(��Ī�� ����, �ν��Ͻ���, ����������, ������Ʈ�� ��)
		
		while(run) { //���Ϲ� ���ǽ�(run)�� true �� ���� - �ݺ�����
			System.out.println("---------------------------------"); //���
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");//���
			System.out.println("---------------------------------");//���
			System.out.print("����>");//���
			
			int a = 0; //���ð�(�����Է°�) ���� a �ʱ�ȭ
			a = scanner.nextInt(); //���� �Է������� ���� a �� ����
			
			if( a == 1 ) { // 1 �� �Է������� ������(�����ϸ�)
				System.out.print("���ݾ�>"); //���ݾ�> ���
				balance = balance + scanner.nextInt(); // balance�� ���� �Է°�(����)���� 
				System.out.println("�ܾ� : " + balance);//����� balance �� ���
				//���ǽ��� ���� true �̱� ������ ����â�� �ѹ� �� ��µ�
				
			}else if( a == 2 ) { // 2�� �Է������� ������(�����ϸ�)
				System.out.print("��ݾ�>"); //��ݾ�> ���
				balance = balance - scanner.nextInt(); //balance ������ ���� �Է°��� ����(���̳ʽ�) �� ���� ����
				System.out.println("�ܾ� : " + balance); //���̳ʽ� �� �� ���
				//���ǽ��� ���� true �̱� ������ ����â�� �ѹ� �� ��µ�
				
			}else if( a == 3 ) { // 3�� �Է������� ������(�����ϸ�)
				System.out.print("�ܰ� : "); //�ܰ� ���ڿ� ���
				System.out.println(balance);//������ִ� balance�� ���
				//���ǽ��� ���� true �̱� ������ ����â�� �ѹ� �� ��µ�
				
			}else if(a == 4){ //4�� �Է������� ������(�����ϸ�)
				run = false;
				System.out.println("���α׷� ����");// ���α׷����� ���
				//���ǽ��� false �� �Ǿ� while�� ����
				
		}else {//�� �� �� �Է½� �����޼��� ��� �� ���� â ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���⿡�� �������ּ���.");//�����޼��� ���
			}
			
		}
	}
	public static void main(String [] args) { //������ ���� ������ ���������� ������ ��ȯ�� ���� ���θ޼���
		Exercise07 a = new Exercise07();// ��ü����, ��ü�ּҸ� ������ Exercise07�� ���� a �ʱ�ȭ
	}

}

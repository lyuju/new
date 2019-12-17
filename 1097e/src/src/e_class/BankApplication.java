package e_class;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; //������迭100����
	private static Scanner scanner = new Scanner(System.in);

		
		public static void main(String [] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------------");
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("--------------------------------------------------");
				System.out.println("����> ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo ==1) {
					createAccount();
				}else if(selectNo == 2) {
					accountList();
				}else if(selectNo == 3) {
					deposit();					
				}else if(selectNo == 4) {
					withdraw();
				}else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("���α׷� ����");
		}
		
		//���»����ϱ�
		private static void createAccount() {
			Scanner scanner = new Scanner(System.in);
		      System.out.println("---------------");
		      System.out.println("���»���");
		      System.out.println("---------------");
		      System.out.println("���¹�ȣ");
		      String ano = scanner.nextLine();
		      System.out.println("������");
		      String owner = scanner.nextLine();
		      System.out.println("�ʱ��Աݾ�");
		      int balance = scanner.nextInt();
		      Account newAccount = new Account(ano, owner, balance);
		      for(int i = 0 ; i <accountArray.length; i++) {
		            if(accountArray[i] == null) {
		               accountArray[i] = newAccount;
		            }
		      }
		   }			
			
		
		//���¸�Ϻ���
		private static void accountList() {
			System.out.println("-------------");
			System.out.println("���¸��");
			System.out.println("-------------");
			for(int i=0;i<accountArray.length;i++){
				Account account =accountArray[i];
				if(account !=null){
					
					System.out.print(account.getAno());
					System.out.print(" ");
					System.out.print(account.getOwner());
					System.out.print(" ");
					System.out.print(account. getBalance());
					System.out.println();
				}
			}
		}
		//�����ϱ�
		private static void deposit() {
			System.out.println("------------------------");
			System.out.println("����");
			System.out.println("------------------------");
			System.out.print("���¹�ȣ : ");
			String ano = scanner.nextLine();  //���¹�ȣ�Է�
			System.out.println();
			System.out.print("���ݾ� : ");
			int balance = scanner.nextInt();
			
			Account act = findAccount(ano);
			if(act == null) {
				System.out.println("��� : ���°� �����ϴ�.");
			return;	
			}
			act.setBalance(act.getBalance() + balance);
			System.out.println("��� : �Ա��� �����Ǿ����ϴ�.");
		}
		//����ϱ�
		private static void withdraw() {
			System.out.println("------------------------");
			System.out.println("����");
			System.out.println("------------------------");
			System.out.print("���¹�ȣ : ");
			String ano = scanner.nextLine();  //���¹�ȣ�Է�
			System.out.println();
			System.out.print("��ݾ� : ");
			int balance = scanner.nextInt();
			
			Account act = findAccount(ano);
			if(act == null) {
				System.out.println("��� : ���°� �����ϴ�.");
			return;	
			}
			act.setBalance(act.getBalance() - balance);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		}
		
		//Account �迭���� ano�� ������ Account ��ü ã��
		private static Account findAccount(String ano) {
			Account act = null;
			for(int i = 0 ; i < accountArray.length ; i++) {
				if(accountArray[i]!=null) {
					String getAno = accountArray[i].getAno();					
					if(getAno.equals(ano)) {
						act = accountArray[i];
						break;
					}//if end
				}//if end
			}//for end
			return act;
		} 

	}



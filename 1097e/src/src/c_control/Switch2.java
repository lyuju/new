/*
 * ���������� ����� ������ �߻����Ѽ� ����
 * ���� �޼��带 
 * ����Ÿ���� �Ǽ���
 *  * �� 
 *  
 *  8, 9, 10, 11 �װ� ��ȣ�� ����
 *  ����Ȱ���� ����
 *  ������ 8�̳�
 */
package c_control;

public class Switch2 {	
	Switch2(){
		
		int time = (int)Math.random()*4+8;
		String a = "";		
		System.out.println("[����ð�: " + time + "��]");
		
		switch(time) {		
			case 8:
				a = "����մϴ�.";
			case 9:
				a = "ȸ�Ǹ� �մϴ�.";
			case 10:
				a = "������ �մϴ�.";
				break;
			default:
				a = "�ܱ��� �����ϴ�.";
			
		}
	}

}

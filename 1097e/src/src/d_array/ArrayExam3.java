package d_array;

import java.util.Scanner;

public class ArrayExam3 {
	// int score = 0; �ɹ�����
	public int test2() {
		// ���ڿ� 1���� �迭(names)�� ������ ���� 5���� ����
		// ������ 2���� �迭(s) 5���� ����, ������� ����
		// ������ ����
		// �ش�� �� ��ܿ� �迭�� �����ϴ°��� ����
		String[] names = new String[] { "A", "B", "C", "D", "E" };
		int[][] s = new int[][] { 
			{ 10, 27 }, 
			{ 20, 30 }, 
			{ 30, 40 }, 
			{ 40, 50 }, 
			{ 50, 60 } 
		};
		int tot = 0;
		double avg = 0d;

		// �迭�� ù��° �л��� �̸��� ���� �� ����, ����� ���
		System.out.println("name : " + names[0]);
		System.out.println("kor : " + s[0][0]);
		System.out.println("eng : " + s[0][1]);
		tot = s[0][0] + s[0][1];
		avg = (double) tot / s[0].length;
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);

		// ����° �л��� ���� ������ 100���� ����
		s[2][0] = 100;
		// ����° �л��� �̸��� ������� ���
		System.out.println("����° �л��� : " + names[2]);
		System.out.println("���� : " + s[2][0]);

		// �л����� "D" �� ����� ����, ����, ������ ����� ����Ͽ� ���
		// �ϵ� ������ "�ڷ����"�� ���
		// �˻�� �Է��Ͽ� �˻��ϰ� �˻��� �����Ϸ��� "quit"��
		// �Է��ϵ��� ���α׷��� �����Ͻÿ�.

		// do while�� ���� ���ɳ� ��ü����� ���� do while �ۿ� �ۼ�
		// Ű���� �� �Է¹޴� ���ڿ� findstr while���� findstr = quit
		// run false�� ��ȯ

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		String findstr = "";
		while (!findstr.equals("quit")) {
			System.out.print("�˻��� �̸��� ?");
			findstr = scanner.nextLine();

			int p = -1;

			for (int i = 0; i < s.length; i++) {
				if (names[i].equals(findstr)) { //������ i��°�� ����ڰ� �Է��� �˻���� �Ȱ���
					p = i; //
					tot = s[i][0] + s[i][1];//ã�� ��ġ�� ù��° �÷��� �ι�° �÷����� ����
					avg = tot / 2.0; // (double)tot / s[i].length
					System.out.println("---�˻����--");
					System.out.println("���� : " + names[i]);
					System.out.println("���� : " + s[i][0]);
					System.out.println("���� : " + s[i][1]);
					System.out.println("���� : " + tot);
					System.out.println("��� : " + avg);
					break;
				}
			}
			if (p == -1) {
				System.out.println("�ڷ����");
			}

		}

		return 0;
	}

	// ������ (��������) ��ȯ�� �޼����(�Ű�����){ ... }
	// ������ 2���� �迭�� �����ϰ� �ʱⰪ�� 4�� 3���� �����͸� ����
	public void test1() {
		int[][] s = new int[][] { // �����Ͱ� �ִٸ� ���ĸ� ���ְ� �߰�ȣ, �⺻��
				{ 1, 2, 3 },
				{ 2, 3, 7 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};

		// �迭�� ���
		System.out.println("��� : " + s.length);
		// ù��° ���� ����
		System.out.println("ù��° ���� ���� : " + s[0].length);
		// �ι�° ���� ����° ���� ����?
		System.out.println("�ι��� ���� ����° ���� �� : " + s[1][2]);
		// ù��°���� ������ �հ�
		int hap = s[0][0] + s[0][1] + s[0][2];
		System.out.println("ù��° ���� ������ �հ� : " + hap);
		// ù��° ���� �հ�
		int cal = s[0][0] + s[1][0] + s[2][0] + s[3][0];
		System.out.println("ù��° ���� �հ�" + cal);
		// �ι�° ���� ������ ¦���� ���
		// System.out.println("�ι�° ���� ������ ¦���� ���" + s[1][0]+ "," + s[1][2]);
		if (s[1][0] % 2 == 0) {
			System.out.println(s[1][0]);
		}
		if (s[1][1] % 2 == 0) {
			System.out.println(s[1][1]);
		}
		if (s[1][2] % 2 == 0) {
			System.out.println(s[1][2]);
		}
		// ����°���� ¦���� ����� ���Ͻÿ�
		// ������� ����, ���ο� ������ �����ؼ� �հ踦 ����, ����� �����ϴ� ���� �ʿ�, ī��Ʈ ���� �� ���������
		int a = 0; // �հ�
		int c = 0; // ī��Ʈ
		double b = 0.0d; // ���

		if (s[0][2] % 2 == 0) {
			a += s[0][2];
			c++;
		}

		for (int i = 0; i < s.length; i++) {
			if (s[i][2] % 2 == 0) {
				a = a + s[i][2];
				c++;
			}
		}
		if (c > 0) {
			b = (double) a / c;
			System.out.println("�հ� : " + a);
			System.out.println("¦���� ���� : " + c);
			System.out.println("��� : " + b);
		}
	}

	public static void main(String[] args) {
		ArrayExam3 a3 = new ArrayExam3();// �ν��Ͻ�ȭ, ��ü����, �޸𸮿� �ø�
		// a3.test1();//test1�� ��ȯ���� void �� ��ȯ���� ���� ������ �տ� ��ȯ���� ���� ����.
		a3.test2();

	}

}

package g_exception;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ExceptionExam {

	public static void main(String[] args) {
		// nullPointerException
		String data = "";
		try { // try catch�� ��� ���·� ����Ǿ����.
			System.out.println(data.toString());
			System.out.println("������ ���� ��� �����.");

		} catch (NullPointerException ex2) { // (Exception ex) ���������� ������� ����.

			System.out.println("Null Pointer Error !!!");
			ex2.printStackTrace(); // �����޼����� �ֿܼ� ���

		} catch (Exception ex) { // ���������� ������� ����.
			System.out.println("Null Pointer Error !!!");

		} finally {
			System.out.println("�����߻��� ������� ������ ����.");
		}

		// ArrayIndexOutOfBoundsException(÷�ڿ���)
		int[] s = { 1, 2, 3 };

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(s[i]);
			}

			System.out.println(data.toString());
			System.out.println("��������");

		} catch (ArrayIndexOutOfBoundsException ex) {

			System.out.println(data.toString());
			System.out.println("÷�ڿ���");

		} catch (Exception ex) {
			ex.printStackTrace();

			System.out.println("Exception ex2");
			System.out.println(data.toString());
			
		} finally {
			System.out.println("�������");
		}
		// NumberFormatException
		try {
			data = "123 ";
			int su = Integer.parseInt(data);// (o)
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("���� ó���� �����.");
		}	
		

		// ClassCastException(����ȯ ����)
		try {
			Car myCar = new Car();
			SportsCar c = (SportsCar)myCar;
		}catch(Exception ex) {
			System.out.println("�� ��ȯ ������ �߻�");
		}finally {
			System.out.println("��~~~~");
		}

	}

}

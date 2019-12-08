 package qee;

public class odd {

	int[] a1 = { 3, 17, 1, 39, 8, 41, 2, 32, 99, 2 };
	int[] a2 = { 22, 8, 5, 123, 7, 2, 63, 7, 3, 46 };
	int[] a3 = { 6, 63, 2, 3, 58, 76, 21, 33, 8, 1 };

	void oddd() {
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 2 == 1) {
				t1 += a1[i];
			}
		}
		System.out.println("#1 : " + t1);

		for (int i = 0; i < a2.length; i++) {
			if (a2[i] % 2 == 1) {
				t2 += a2[i];
			}
		}
		System.out.println("#2 : " + t2);
		for (int i = 0; i < a3.length; i++) {
			if (a3[i] % 2 == 1) {
				t3 += a3[i];
			}
		}
		System.out.println("#3 : " + t3);

	}

	public static void main(String[] args) {
		odd q = new odd();
		q.oddd();

	}
//¶ÑºñµÎ¹ÙŒê;
}

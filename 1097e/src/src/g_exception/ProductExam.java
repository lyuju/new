/*3. ProductExam.java
  1) Radio Ŭ������ Video Ŭ������ ����ȯ�� �ȵ��� �����ϴ� �ڵ带 �ۼ� �Ͻÿ�.
  2) Radio, Video, TV Ŭ������ Product Ŭ������ ����ȯ�� �ɼ� ������
     �����ϴ� �ڵ带 �ۼ� �Ͻÿ�.
 */
package g_exception;

public class ProductExam {

	public static void main(String[] args) {
		Tv a = new Tv();
		Video b = new Video();
		Radio c = new Radio();		
		
		
		if (a instanceof Product) {
			Product h = (int) a;
			System.out.println(a.getProductName());
		}else {
			System.out.println("Product ������ ��ȯ�� �Ұ��մϴ�.");
		}
		System.out.println(b.getProductName());
		System.out.println(c.getProductName());
		
		System.out.println();
		
	}

}

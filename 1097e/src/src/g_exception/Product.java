/*
 * 1. Product Ŭ������ �����Ͽ� Radio Ŭ������ Video Ŭ���� , TV Ŭ������ ���� �� 
 *    Product Ŭ������ ��� �޾� �����Ͻÿ�.
 *    
class Product{
    public String getProductName(){
       return "product";
    }
}
2. �ڽ� Ŭ���������� getProductName()�� Override�Ͽ� �ڽ��� �̸��� ��µǵ��� 
��ġ�Ͻÿ�(�� TV.class => "TV", Radio.class => "Radio")

3. ProductExam.java
  1) Radio Ŭ������ Video Ŭ������ ����ȯ�� �ȵ��� �����ϴ� �ڵ带 �ۼ� �Ͻÿ�.
  2) Radio, Video, TV Ŭ������ Product Ŭ������ ����ȯ�� �ɼ� ������ �����ϴ� �ڵ带 �ۼ� �Ͻÿ�. 
  
[��ó] 2019.12.11(��) ���� (JobTC(Job Training Center of Korea)) |�ۼ��� IT������
 */

package g_exception;

public class Product {
	public String getProductName() {
		
		return "product";
	}
	public static void main(String[] args) {
		Tv a = new Tv();
		Video b = new Video();		
		Radio c = new Radio();
		
		System.out.println(a.getProductName());
		System.out.println(b.getProductName());
		System.out.println(c.getProductName());
	}

}

// this    : �� ��ü self
// this.   : ����
// this() : ��
public class ThisDemo {
	public static void main(String[] args) {
		Product mouse = new Product();//�⺻ ������
		mouse.setName("Logitech mouse");
		mouse.setPrice(35_000);
		Product other = mouse.refCopy();
		System.out.println("Name = " + other.getName());
		System.out.println("Price = " + other.getPrice());
		
		mouse.setPrice(50_000);//�ּҺ��� = ���̹ٲ�� ���� �ٲ��.
		System.out.println("Price = " + other.getPrice());
	}
}

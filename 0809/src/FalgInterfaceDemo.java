
public class FalgInterfaceDemo {
	public static void main(String[] args) {
		/*//Product target = original; // �ּҺ���
		
		Product target = original.copy();//�ּҺ���
		System.out.println(original);

		original.setString("computer");
		System.out.println(target);*/
		Product original = new Product("ballpen");
		
		Product target = original.copy();//������
		System.out.println(target);
		
		original.setString("Computer");
		System.out.println(target);
	}
}
class Product extends Object implements Cloneable{// Cloneable interface ������ ���� ����
	private String name;
	public Product(String name) {//������
		this.name = name;
	}
/*	public Product copy() { //�ּҺ��� Reference copy
		return this;
	}*/
	public Product copy() {
		Object obj = null;
		try {
			obj = clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Not Support");
			System.out.println("���� ����");
		}
		return (Product)obj;
	}
	public void setString(String name) {
		this.name = name;
	}
	public String getString() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
	
}

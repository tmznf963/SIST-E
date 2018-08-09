
public class FalgInterfaceDemo {
	public static void main(String[] args) {
		/*//Product target = original; // 주소복사
		
		Product target = original.copy();//주소복사
		System.out.println(original);

		original.setString("computer");
		System.out.println(target);*/
		Product original = new Product("ballpen");
		
		Product target = original.copy();//값복사
		System.out.println(target);
		
		original.setString("Computer");
		System.out.println(target);
	}
}
class Product extends Object implements Cloneable{// Cloneable interface 있으면 복제 가능
	private String name;
	public Product(String name) {//생성자
		this.name = name;
	}
/*	public Product copy() { //주소복사 Reference copy
		return this;
	}*/
	public Product copy() {
		Object obj = null;
		try {
			obj = clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Not Support");
			System.out.println("복제 실패");
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

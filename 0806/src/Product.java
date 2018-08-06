
public class Product {
	private String name;
	private int price;
	public Product() {//default 생성자
		System.out.println("방금 객체가 생성되었습니다.");
		//클래스이름 과 같고
		//리턴타입 없고
	}
	public Product refCopy() {
		return this;//Product 타입의 this == 나 자신
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}


public class Product {
	private String name;
	private int price;
	
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

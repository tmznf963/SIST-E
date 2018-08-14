
public class Car<T> implements Comparable<T>{
	private String name;
	private int price;
	
	public Car(String name , int price) {//생성자
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(T o) {//부모가 인터페이스 = public 메소드 Override
		Car car = (Car)o;//강제 형 변환
		return this.price - car.price;
	}

	@Override
	public String toString() {
		return String.format("Car [name=%s, price=%s]", name, price);
	}
	
}

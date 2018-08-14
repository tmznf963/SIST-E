
public class Car<T> implements Comparable<T>{
	private String name;
	private int price;
	
	public Car(String name , int price) {//������
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int compareTo(T o) {//�θ� �������̽� = public �޼ҵ� Override
		Car car = (Car)o;//���� �� ��ȯ
		return this.price - car.price;
	}

	@Override
	public String toString() {
		return String.format("Car [name=%s, price=%s]", name, price);
	}
	
}

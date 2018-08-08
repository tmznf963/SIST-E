
public class Car {//카센터 모든 자동차의 부모
	private String name;
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}

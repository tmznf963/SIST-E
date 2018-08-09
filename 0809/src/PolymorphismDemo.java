
public class PolymorphismDemo {
	public static void main(String[] args) {
		
		/*Car [] array = new Car[3];
		array[0] = new Sonata("Silver Sonata");
		array[1] = new Carnival("White Carnival");
		array[2] = new Matiz("Pink Matiz");*/
		
		Car [] array= { //배열 초기화(다형성) 부모가 자식것을 사용
				new Sonata("Silver Sonata"),
				new Carnival("White Carnival"),
				new Matiz("Pink Matiz")
		};
		
		for(Car car : array) {
			System.out.println(car.toString());
		}
	}
}

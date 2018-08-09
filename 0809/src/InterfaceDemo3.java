
public class InterfaceDemo3 {
	public static void main(String[] args) {
	/*	Dog dog = new Dog();
		vacinate(dog);
		
		Cat cat = new Cat();
		vacinate(cat);*/
		
		Pet [] array = new Pet[] { new Dog(), new Cat()};
		
	}
	static void vacinate(Pet [] array) {//´ÙÇü¼º
		for (Pet p : array) {
			p.pet();
		}
	}
}

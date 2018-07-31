
public class InstanceVariableDemo {
	int kor =90; //member variable
	public static void main(String[] args) {
		InstanceVariableDemo ivd = new InstanceVariableDemo();
		System.out.println("kor = "+ivd.kor);
		
		Product pd = new Product();
		System.out.println("price = " +pd.price);
	
	
	}
}

class Product{
	int price = 4000;
}
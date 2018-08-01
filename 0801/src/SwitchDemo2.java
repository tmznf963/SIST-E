
public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = (int)(Math.random()*10+1); //1~10 random
		System.out.println("a = " + a);
		switch(a) {
		case 1: System.out.println("Banana");break;
		case 2: System.out.println("Oranges");break;
		case 3: System.out.println("Peach");
		case 4: System.out.println("Apple");
		case 5: System.out.println("Plums");break;
		case 6: System.out.println("Pineapples");break;
		case 7: System.out.println("No message");break;
		default : System.out.println("Nuts");
		}
	}

}


public class OpDemo {

	public static void main(String[] args) {
		
		int a = 6;
		int b = a++;
		System.out.println(a);//7
		System.out.println(b);//6
		
		int kor = 95;
		System.out.println(kor++);//95;
		System.out.println(kor);//96
		
		int c = 6;
		System.out.println("c = " + Integer.toBinaryString(a));
		int d = ~c;
		System.out.println("d = " + Integer.toBinaryString(d));
	}

}


public class OpDemo2 {

	public static void main(String[] args) {
		int a = 5 , b = 9 , x = 100;
		
//		if(a > x && b < x) System.out.println("True");
//		else System.out.println("False");//왼쪽 && 오른쪽 = 왼쪽만 수행
		
		if(a > x & b++ < x) System.out.println("True");
		else System.out.println("False");//왼쪽 & 오른쪽 = 둘다 수행
		
		System.out.println(b);
		
	}

}

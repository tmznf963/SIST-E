
public class OpDemo2 {

	public static void main(String[] args) {
		int a = 5 , b = 9 , x = 100;
		
//		if(a > x && b < x) System.out.println("True");
//		else System.out.println("False");//���� && ������ = ���ʸ� ����
		
		if(a > x & b++ < x) System.out.println("True");
		else System.out.println("False");//���� & ������ = �Ѵ� ����
		
		System.out.println(b);
		
	}

}

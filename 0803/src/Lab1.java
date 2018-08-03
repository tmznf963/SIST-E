import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		//GCD : G 		 //�ִ�����
		//LCD : abG 	 //�ּҰ����
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 2�� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = getGCD(a,b);
		System.out.println("GCD = "+gcd);
		System.out.println("LCD = "+(a/gcd)*(b/gcd)*gcd);

	}
	static int getGCD(int a, int b) {
		int gcd = 0;
		for(int i = 2 ; i <= a; i++) {
			if(a %i ==0 && b % i == 0) gcd=i; 
		}
		return gcd;
	}
}

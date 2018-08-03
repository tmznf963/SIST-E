import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		//GCD : G 		 //최대공약수
		//LCD : abG 	 //최소공배수
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개 : ");
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

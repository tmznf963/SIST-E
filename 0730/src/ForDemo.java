import java.util.Scanner;
public class ForDemo {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("ธ๎ มู?");
//		int k = scan.nextInt();
		int k = 7;
		for(int i = 1; i <=k ; i+=2) {
			for(int j=k;i<=j;j-=2) {
				System.out.print("-");
			}
			System.out.println("* ");
		}
		for(int i = 2; i <=k ; i+=2) {
			for(int j=0;j<=i; j+=2) {
				System.out.print("-");
			}
			System.out.println("* ");
		}
	}

}

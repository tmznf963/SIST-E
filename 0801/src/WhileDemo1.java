import java.util.Scanner;
public class WhileDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.print(" ¸î ´Ü ? ");
		int dan = scan.nextInt();
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d \n",dan,i,(i*dan));
			i++;
		}*/
		while(true) {
			System.out.print("Message : ");
			String msg = scan.nextLine();
			if(msg.length()==0 || msg.equals("exit")) break;
			System.out.println("Input Message : "+ msg);
		}
	}
}

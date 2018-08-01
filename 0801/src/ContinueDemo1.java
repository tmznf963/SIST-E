import java.util.Scanner;
public class ContinueDemo1 {
	public static void main(String[] args) {
		String sys_pw = "ABCD"; Scanner scan = new Scanner(System.in);
		System.out.print("P/W 입력해주세요 : ");
		String user_pw = scan.nextLine();
		
		int i;
		for(i=0; i <4 ; i++) {
			if(sys_pw.charAt(i) == user_pw.charAt(i)) continue;
			else break;
		}
		if(i ==4) System.out.println("Succes");
		else System.out.println("Fail");
	}
}

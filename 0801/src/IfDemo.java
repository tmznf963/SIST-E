import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("어느 계절 좋아하세요?(봄//여름//가을//겨울) ");
		String season = scan.nextLine();
		System.out.println("계절 : "+season);
	
		if(season.equals("봄")) {
			System.out.println("개나리,진달래");
		} else if(season.equals("여름")){
			System.out.println("장미,아카시아");
		} else if(season.equals("가을")){
			System.out.println("코스모스,백합");
		} else{
			System.out.println("동백,매화");
		}
	}
}

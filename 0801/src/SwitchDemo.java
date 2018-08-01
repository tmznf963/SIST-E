
public class SwitchDemo {

	public static void main(String[] args) {
		/*int a = 62;
		switch(a % 2) {
			case 0: System.out.println("짝수"); break;
			case 1: System.out.println("홀수");
		}*/
		
		/*double avg = 78.6;
		switch((int)(avg/10)) {
		case 10 : 
		case 9 : System.out.println('A'); break;
		case 8 : System.out.println('B'); break;
		case 7 : System.out.println('C'); break;
		case 6 : System.out.println('D'); break;
		default : System.out.println('F');
		}*/
		String season ="가을";
		switch(season) {
		case "봄" : System.out.println("진달래");break;
		case "여름" : System.out.println("아카시아");break;
		case "가을" : System.out.println("코스모스");break;
		case "겨울" : System.out.println("동백");break;
		default : System.out.println("No season");
		}

	}

}

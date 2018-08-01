
public class ContinueDemo {
	public static void main(String[] args) {
		for(int i = 1 ; i <101 ; i++) {
			if(i%7 == 0) System.out.printf("%d",i);
			else continue;
		}
	}
}

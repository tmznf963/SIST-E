import java.util.Scanner;
public class ReferenceDemo {

	public static void main(String[] args) {
		String name = "한지민";//4byte Stack -> 문자열 시작번지 heap메모리
		System.out.println("name = "+name);
		
		Scanner scan = new Scanner(System.in);
		String adress = null; //null번지
		System.out.print("Adress : ");
		adress = scan.nextLine();
		
		System.out.println("주소는 " +adress+ "입니다.");//String class 참조형
		
	}

}

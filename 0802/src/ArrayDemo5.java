//빌드
import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
//		Student [] std ;
//		std = new Student[2]; //배열 선언 생성
//		
//		std[0] = new Student(); //참조형 배열 (학생수첩)
//		std[0].name = "한지민";
//		
//		std[1] = new Student();
//		std[1].name = "정우성";
//		
//		for(Student s : std) {
//			System.out.println(s.name);
//		}
		Student [] std;
		std = new Student[2];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < std.length; i++) {
			System.out.print("Name : ");
			String irum = scan.nextLine();
			std[i] = new Student();//학생 주소 만들어
			std[i].name = irum;
		}
		for (Student s : std) {
			System.out.println(s.name);
		}
	}
}

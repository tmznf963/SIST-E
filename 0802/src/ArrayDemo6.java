import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {

		Student[] std = new Student[2];

		std[0] = new Student();
		std[0].name = "한지민";
		std[0].age = 34;
		std[0].address = "서울시 서대문구";

		std[1] = new Student();
		std[1].name = "이미자";
		std[1].age = 65;
		std[1].address = "부산직할시 해운대구";

		for (int i = 0; i < std.length; i++) {
			System.out.println("<" + (i + 1) + "번 쨰 학생 정보>");
			System.out.printf("%s , %d , %s \n", std[i].name, std[i].age, std[i].address);
		}

	}
}

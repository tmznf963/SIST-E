import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {

		Student2[] std = new Student2[2];

		std[0] = new Student2();
		std[0].name = "������";
		std[0].age = 34;
		std[0].address = "����� ���빮��";

		std[1] = new Student2();
		std[1].name = "�̹���";
		std[1].age = 65;
		std[1].address = "�λ����ҽ� �ؿ�뱸";

		for (int i = 0; i < std.length; i++) {
			System.out.println("<" + (i + 1) + "�� �� �л� ����>");
			System.out.printf("%s , %d , %s \n", std[i].name, std[i].age, std[i].address);
		}

	}
}

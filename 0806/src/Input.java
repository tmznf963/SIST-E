import java.util.Scanner;

public class Input {
	public void  input(Student [] s_arr){ 
		Scanner scan = new Scanner(System.in);
		for(int i= 0 ; i<s_arr.length;i++) {
		System.out.println(i+"��° �л��Է�");
		System.out.print("name : ");
		String name = scan.next();
		System.out.print("kor : ");
		int kor = scan.nextInt();
		System.out.print("eng : ");
		int eng = scan.nextInt();
		System.out.print("mat : ");
		int mat = scan.nextInt();
		
		Student s = new Student(name, kor , eng, mat);//�л� ����
		s_arr[i] = s;
		}
	}
}

import java.util.Scanner;

public class Input {
	public void  input(Student [] s_arr){ 
		Scanner scan = new Scanner(System.in);
		for(int i= 0 ; i<s_arr.length;i++) {
		System.out.println(i+"번째 학생입력");
		System.out.print("name : ");
		String name = scan.next();
		System.out.print("kor : ");
		int kor = scan.nextInt();
		System.out.print("eng : ");
		int eng = scan.nextInt();
		System.out.print("mat : ");
		int mat = scan.nextInt();
		
		Student s = new Student(name, kor , eng, mat);//학생 생성
		s_arr[i] = s;
		}
	}
}

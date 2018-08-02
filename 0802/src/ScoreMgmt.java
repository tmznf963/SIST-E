import java.util.Scanner;

public class ScoreMgmt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int [] array = new int [4]; // 0, 0, 0, 0
		double avg;
		
		System.out.print("Name : "); name = scan.nextLine();
		System.out.print("Kor : "); array[0] = scan.nextInt();
		System.out.print("Eng : "); array[1] = scan.nextInt();
		System.out.print("Mat : "); array[2] = scan.nextInt();
		
		array[3] = array[0] + array[1] + array[2];
		avg = array[3]/3;
		
		System.out.printf("%s, %d %d %d %d %f \n",name,array[0],array[1],array[2],array[3],avg);
		

	}

}

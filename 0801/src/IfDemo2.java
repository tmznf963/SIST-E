import java.util.Scanner;
public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("키 : ");
		double h = scan.nextDouble();	
		
		System.out.print("몸무게 : ");
		double w = scan.nextDouble();
		
		double bmi = (w/(h*h))*10000;
		String result ="";
		
		if(bmi<18.5) result = "저체중";
		else if(18.5<= bmi && bmi <=24.9) result = "정상 체중";
		else if(25<= bmi && bmi <=29.9) result = "초과 중량";
		else result = "비만";
		
		System.out.printf("%s님, BMI = %.2f, %s",name,bmi,result);
	}
}

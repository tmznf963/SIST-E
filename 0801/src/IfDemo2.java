import java.util.Scanner;
public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		
		System.out.print("Ű : ");
		double h = scan.nextDouble();	
		
		System.out.print("������ : ");
		double w = scan.nextDouble();
		
		double bmi = (w/(h*h))*10000;
		String result ="";
		
		if(bmi<18.5) result = "��ü��";
		else if(18.5<= bmi && bmi <=24.9) result = "���� ü��";
		else if(25<= bmi && bmi <=29.9) result = "�ʰ� �߷�";
		else result = "��";
		
		System.out.printf("%s��, BMI = %.2f, %s",name,bmi,result);
	}
}

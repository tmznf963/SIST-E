import java.util.Scanner;
public class IfDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");	String name = scan.nextLine();

		System.out.print("����⵵(ex 1994) : "); int sin = scan.nextInt();
		
		if(sin%12 == 0) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"������");
		else if(sin%12==1) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else if(sin%12==2) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else if(sin%12==3) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"����");
		else if(sin%12==4) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else if(sin%12==5) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else if(sin%12==6) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"ȣ����");
		else if(sin%12==7) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"�䳢");
		else if(sin%12==8) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else if(sin%12==9) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else if(sin%12==10) System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
		else System.out.printf("%s���� %d���̰�, %s�� �Դϴ�.",name,(2018-sin+1),"��");
 }
}

import java.util.Date;

public class DeprecationDemo {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);

		int year = now.getYear();//Deprecation = �����Ǿ ��� ���ϴ� �޼ҵ�.
		System.out.println("year = "+year);//���� 2018 - 1900��
		System.out.println("Month = "+now.getMonth());
	}
}

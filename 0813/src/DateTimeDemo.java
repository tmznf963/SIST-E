import java.util.Date;

/*
 * 1.�ð� = Date() ���
 * */
public class DateTimeDemo {
	public static void main(String[] args) {
		//System.out.println(new Date());//��¥ �ð� ����
		//System.out.println(System.currentTimeMillis());
		Date d = new Date(System.currentTimeMillis());
		System.out.println("Now = " +  d);
	}
}

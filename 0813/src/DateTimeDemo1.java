import java.util.Calendar;
//2.Calendar ���
public class DateTimeDemo1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();// �߻�Ŭ������ new �� ��.
		Calendar now1 = Calendar.getInstance();
		
		System.out.println(now.hashCode());
		System.out.println(now1.hashCode());
		
		if (now == now1)
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year +" "+month+" "+day+" ");
	}
}

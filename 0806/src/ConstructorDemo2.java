
public class ConstructorDemo2 {
	public static void main(String[] args) {
		MyCalender mc = new MyCalender();//�⺻������ ȣ��
		mc.dispaly();
		String str = new String(); //String�� �⺻ �����ڰ� �ִ�.
	}
}
class MyCalender{
	private int year , month, day;
	public MyCalender() {//�⺻������ default constructor // ������ override
		this.year = 2018;
		this.month = 8;
		this.day = 6;
	}
	public void dispaly() {
		System.out.println("��"+year);
		System.out.println("��" + month);
		System.out.println("��"+day);
	}
}
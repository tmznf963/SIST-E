
public class ConstructorDemo2 {
	public static void main(String[] args) {
		MyCalender mc = new MyCalender();//기본생성자 호출
		mc.dispaly();
		String str = new String(); //String은 기본 생성자가 있다.
	}
}
class MyCalender{
	private int year , month, day;
	public MyCalender() {//기본생성자 default constructor // 재정의 override
		this.year = 2018;
		this.month = 8;
		this.day = 6;
	}
	public void dispaly() {
		System.out.println("년"+year);
		System.out.println("월" + month);
		System.out.println("일"+day);
	}
}
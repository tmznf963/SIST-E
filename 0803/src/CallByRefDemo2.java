
public class CallByRefDemo2 {
	public static void main(String[] args) {
		CallByRefDemo2 cbr = new CallByRefDemo2();
		Demo d = new Demo();
		d.a = 5; d.b=9;
		System.out.printf("���� �� a = %d , b =%d \n" , d.a,d.b);
		
		cbr.swap(d);//�ּҸ� �ѱ��(�ݹ��̷��۷���)
		System.out.printf("���� �� a = %d , b =%d" , d.a,d.b);
	}
	void swap(Demo d1) {//������
		int temp = d1.a;
		d1.a = d1.b;
		d1.b = temp;
	}
}

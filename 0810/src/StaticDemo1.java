
public class StaticDemo1 {
	/*static int a = getNum(); //�޸𸮿� ���� ���� �ö�´�.
	static int getNum() {//static Method == �ּ� ���� �����ϱ� ����.
		System.out.println("���� ����ƽ �޼ҵ�");
		return 100;
	}*/
	private int su = 5;
	public static void display() {//this, super ���� == ���� ������ ���.
		//su = 1001;// static�� ���� �޸𸮿� �ö�ͼ� ������� ���� ����.
	}
	public void print() {
		su = 100;
	}
	public static void main(String[] args) {
		System.out.println("���� ���� �޼ҵ�");
	}
}

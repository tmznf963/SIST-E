
public class RecursiveCallDemo {//���ȣ��
	public static void main(String[] args) {
		RecursiveCallDemo rcd = new RecursiveCallDemo();
		rcd.print(1);
	}
	void print(int a) {
		System.out.print(a +" ");
		if( a == 5) return;
		else print(++a); //���ȣ�� �޸𸮻�� ���� == �ʿ��� �� ���(�Ǻ���ġ����),2��Ž��,������
	}
}

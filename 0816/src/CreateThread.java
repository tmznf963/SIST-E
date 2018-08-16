
public class CreateThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread("Sally");
		mt.start();//Thread ����
		System.out.println(Thread.currentThread());//Main Thread �켱���� ����.
	}
}
class MyThread extends Thread{//������
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() { //CPU�� �۵��Ǵ� �κ�(�ڵ�) == OS �� run()�� ����.
		System.out.println(Thread.currentThread());
	}
}

public class CreateThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		//mt.start();
		Thread t = new Thread(mt,"MINO"); //��ӹ����� start() �� ���� �������.
		t.start();
		
	}
}

class MyThread1 implements Runnable{ //��ӹ����� �ڵ尡 ª����
	@Override
	public void run(){//�θ��� �޼ҵ带 ������ �ϴ°�.
		System.out.println(Thread.currentThread());
	}
}
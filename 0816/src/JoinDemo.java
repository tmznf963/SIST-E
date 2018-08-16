
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException { // try/catch ��� ���Ϸ���
		Thread t = new Thread("MINO") { //��̸ӽ� Ŭ���� == ����� �����ʰ� �θ��� �޼ҵ� ������
			@Override
			public void run() {
				try {
					Thread.sleep(10000);//10��
				}catch(InterruptedException e) {}
				System.out.println("Thread is over...................");
			}
		};
		t.start();
		t.join();//Thread�� ���� �� ���� Main ��ٸ���. InterruptedException
		Thread.sleep(3000);
		System.out.println("Program is over...........................");
	}
}
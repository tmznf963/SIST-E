
public class DaemonThreadDemo {
	public static void main(String[] args) throws InterruptedException { // try/catch ��� ���Ϸ���
		Thread t = new Thread("MINO") { //��̸ӽ� Ŭ���� == ����� �����ʰ� �θ��� �޼ҵ� ������
			@Override
			public void run() {
				try {
					Thread.sleep(10000);//10��
				}catch(InterruptedException e) {}
				System.out.println("Daemon Thread is over...................");
			}
		};
		t.setDaemon(true); // ������ start() ����
		t.start();
		//Thread.sleep(10000);//10�� ���
		System.out.println("Program is over...........................");
	}
}

//���󾲷��尡 ������ ������ ���α׷��� ������. --> (�޸𸮿��� ������ ��)
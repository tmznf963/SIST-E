
public class SleepDemo implements Runnable {//run() --> Override �ؾ���.
	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();
		SleepDemo sd1 = new SleepDemo();
		
		Thread t = new Thread(sd,"Sally");
		Thread t1 = new Thread(sd1,"Michael");
		
		/*t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY); // �켱���� ������ ���� �ʴ´�.
		 */		
		t.start(); //run() ����
		t1.start();
	}
	@Override
	public void run() {
		for(int i = 0; i <20 ; i++) {
			/*try {
				Thread.sleep(1000);
			}catch(Exception e) {}*/
			Thread.yield();//�纸
			System.out.println(Thread.currentThread().getName() + " --> " + i);
		}
	}
}

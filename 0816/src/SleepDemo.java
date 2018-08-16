
public class SleepDemo implements Runnable {//run() --> Override 해야함.
	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();
		SleepDemo sd1 = new SleepDemo();
		
		Thread t = new Thread(sd,"Sally");
		Thread t1 = new Thread(sd1,"Michael");
		
		/*t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY); // 우선순위 영향을 받지 않는다.
		 */		
		t.start(); //run() 실행
		t1.start();
	}
	@Override
	public void run() {
		for(int i = 0; i <20 ; i++) {
			/*try {
				Thread.sleep(1000);
			}catch(Exception e) {}*/
			Thread.yield();//양보
			System.out.println(Thread.currentThread().getName() + " --> " + i);
		}
	}
}

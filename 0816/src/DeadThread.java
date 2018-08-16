
public class DeadThread {
	public static void main(String[] args)  {
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		t.start();
		try {
			Thread.sleep(3000);//3��
		}catch(InterruptedException e) {	}
		mt.stop();
		
	}
}
class MyThread2 implements Runnable{
	private boolean flag = true; 
	public void stop() {
		this.flag = false;
	}
	
	@Override
	public void run() {//OS�� �ؾ��� ��
		while(flag) {
			try {
				Thread.sleep(1000);//1��				
			}catch(InterruptedException e) {}
			System.out.println("I'm alive....");				
		}
		System.out.println("Thread's dead.....");
	}
}

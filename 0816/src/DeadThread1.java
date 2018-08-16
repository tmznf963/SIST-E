
public class DeadThread1 {
	public static void main(String[] args)  {
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt);
		t.start();
		try {
			Thread.sleep(3000);//3��
		}catch(InterruptedException e) {
			
		}
		t.interrupt();//������ Interrupt --> catch(){}
		//���� : run()�� �ִ� while���� �� �ٷ� catch()�� �Ѿ
	}
}
class MyThread3 implements Runnable{
	@Override
	public void run() {//OS�� �ؾ��� ��
		try {
			while(Thread.interrupted()){//interrupted �Ǿ� �ֳ� - �ȵǸ� true - �ɸ��� false
				//this.isInterrupted()  --> Thread�� �ڽ��� ���
				Thread.sleep(1000);
				System.out.println("I'm alive...");
			}
		}catch(InterruptedException e) {
			
		}finally {
			System.out.println("Thread's dead...");
		}
	}
}


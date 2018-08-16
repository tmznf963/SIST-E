
public class DeadThread1 {
	public static void main(String[] args)  {
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt);
		t.start();
		try {
			Thread.sleep(3000);//3초
		}catch(InterruptedException e) {
			
		}
		t.interrupt();//강제로 Interrupt --> catch(){}
		//장점 : run()에 있는 while문이 길어도 바로 catch()로 넘어감
	}
}
class MyThread3 implements Runnable{
	@Override
	public void run() {//OS가 해야할 일
		try {
			while(Thread.interrupted()){//interrupted 되어 있나 - 안되면 true - 걸리면 false
				//this.isInterrupted()  --> Thread의 자식일 경우
				Thread.sleep(1000);
				System.out.println("I'm alive...");
			}
		}catch(InterruptedException e) {
			
		}finally {
			System.out.println("Thread's dead...");
		}
	}
}


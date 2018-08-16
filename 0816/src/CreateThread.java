
public class CreateThread {
	public static void main(String[] args) {
		MyThread mt = new MyThread("Sally");
		mt.start();//Thread 시작
		System.out.println(Thread.currentThread());//Main Thread 우선순위 높음.
	}
}
class MyThread extends Thread{//쓰레드
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() { //CPU가 작동되는 부분(코드) == OS 는 run()을 돌림.
		System.out.println(Thread.currentThread());
	}
}
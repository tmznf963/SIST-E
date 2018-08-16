
public class CreateThread1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		//mt.start();
		Thread t = new Thread(mt,"MINO"); //상속받으면 start() 를 따로 해줘야함.
		t.start();
		
	}
}

class MyThread1 implements Runnable{ //상속받으면 코드가 짧아짐
	@Override
	public void run(){//부모의 메소드를 재정의 하는것.
		System.out.println(Thread.currentThread());
	}
}
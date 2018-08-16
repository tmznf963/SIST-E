
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException { // try/catch 사용 안하려고
		Thread t = new Thread("MINO") { //어나미머스 클래스 == 상속을 받지않고도 부모의 메소드 재정의
			@Override
			public void run() {
				try {
					Thread.sleep(10000);//10초
				}catch(InterruptedException e) {}
				System.out.println("Thread is over...................");
			}
		};
		t.start();
		t.join();//Thread가 죽을 때 까지 Main 기다린다. InterruptedException
		Thread.sleep(3000);
		System.out.println("Program is over...........................");
	}
}
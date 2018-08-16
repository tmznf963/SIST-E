
public class DaemonThreadDemo {
	public static void main(String[] args) throws InterruptedException { // try/catch 사용 안하려고
		Thread t = new Thread("MINO") { //어나미머스 클래스 == 상속을 받지않고도 부모의 메소드 재정의
			@Override
			public void run() {
				try {
					Thread.sleep(10000);//10초
				}catch(InterruptedException e) {}
				System.out.println("Daemon Thread is over...................");
			}
		};
		t.setDaemon(true); // 무조건 start() 위에
		t.start();
		//Thread.sleep(10000);//10초 대기
		System.out.println("Program is over...........................");
	}
}

//데몬쓰레드가 끝나야 완전한 프로그램이 끝난다. --> (메모리에서 빠지는 것)
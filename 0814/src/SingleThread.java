
public class SingleThread {
	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());//돌아가는 Thread의 이름
		SingleThread st = new SingleThread();
		st.run();
		for(int i = 0 ; i < 10 ; i++) System.out.println("Main()");
	}
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("run()");
		}
	}
}

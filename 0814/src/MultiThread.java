
public class MultiThread extends Thread {
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();
		for(int i = 0 ; i < 1000 ; i++) System.out.println(i+" Main()");
	}
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println(i+ " run()");
		}
	}
}
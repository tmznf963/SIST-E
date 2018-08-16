
public class ATM implements Runnable{
	private int balance = 10_000;
	private /*synchronized*/ void withdraw(int howmuch) {//synchronized == lock
		if(this.balance > 0) {
			this.balance -= howmuch;//������ ����ŭ ����.
			System.out.println(Thread.currentThread().getName() + " -->" + this.balance);
		}
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i <5 ; i++) {
			synchronized(this) {//�κ� lock
				withdraw(1000);				
			}
		}
	}
}


public class ATM implements Runnable{
	private int balance = 10_000;
	private /*synchronized*/ void withdraw(int howmuch) {//synchronized == lock
		if(this.balance > 0) {
			this.balance -= howmuch;//들어오는 값만큼 차감.
			System.out.println(Thread.currentThread().getName() + " -->" + this.balance);
		}
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i <5 ; i++) {
			synchronized(this) {//부분 lock
				withdraw(1000);				
			}
		}
	}
}

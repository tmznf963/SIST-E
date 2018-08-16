
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
			try {
				Thread.sleep(1000);
				synchronized(this) {//부분 lock == 동기화블럭
					withdraw(1000);				
					if(this.balance == 2000 || this.balance == 8000||
							this.balance == 4000 || this.balance == 6000)
						this.wait();//쉬고
					else this.notify();//깨우고
				}
			}catch(Exception e) {}
		}
	}
}

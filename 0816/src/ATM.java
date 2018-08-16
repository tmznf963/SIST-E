
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
			try {
				Thread.sleep(1000);
				synchronized(this) {//�κ� lock == ����ȭ��
					withdraw(1000);				
					if(this.balance == 2000 || this.balance == 8000||
							this.balance == 4000 || this.balance == 6000)
						this.wait();//����
					else this.notify();//�����
				}
			}catch(Exception e) {}
		}
	}
}

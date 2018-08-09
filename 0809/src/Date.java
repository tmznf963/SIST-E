//3. interface는 상속 받을 때 implements 사용
//4. interface의 추상 메소드를 재정의 할때 반드시 public.
public class Date implements Dateable {// 인터페이스 상속
	private int w;
	
	@Override
	public void display() {

	}

	@Override
	public int get() {
		return this.w;
	}

	@Override
	public void set(int w) {
		this.w = w;
	}
	
}

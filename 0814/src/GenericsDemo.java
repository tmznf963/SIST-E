
public class GenericsDemo {
	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(67);
		int num = d.getSu();
		
		Demo<Double> d1 = new Demo<Double>(6.7);
		double avg = d1.getSu();
		
		Demo<String> d2 = new Demo<String>("Hello");
		String str = d2.getSu();
	}
}

class Demo<T> {//Generics == 만능형 타입
	private T su;

	public Demo(T su) {
		this.su = su;
	}

	public T getSu() {
		return su;
	}

	public void setSu(T su) {
		this.su = su;
	}
}

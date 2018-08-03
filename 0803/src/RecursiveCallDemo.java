
public class RecursiveCallDemo {//재귀호출
	public static void main(String[] args) {
		RecursiveCallDemo rcd = new RecursiveCallDemo();
		rcd.print(1);
	}
	void print(int a) {
		System.out.print(a +" ");
		if( a == 5) return;
		else print(++a); //재귀호출 메모리사용 많음 == 필요할 때 사용(피보나치수열),2진탐색,퀵소팅
	}
}

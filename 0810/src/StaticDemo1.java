
public class StaticDemo1 {
	/*static int a = getNum(); //메모리에 가장 먼저 올라온다.
	static int getNum() {//static Method == 주소 없이 접근하기 위해.
		System.out.println("나는 스태틱 메소드");
		return 100;
	}*/
	private int su = 5;
	public static void display() {//this, super 못씀 == 공유 권한이 없어서.
		//su = 1001;// static이 먼저 메모리에 올라와서 멤버변수 접근 못함.
	}
	public void print() {
		su = 100;
	}
	public static void main(String[] args) {
		System.out.println("나는 메인 메소드");
	}
}

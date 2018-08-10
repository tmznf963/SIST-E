
public class StaticDemo2 {
	private int su; //멤버변수
	private final int num;//멤버상수
	private static double avg;//공유변수
	private static final char grade;//공유상수
	
	static{//static 초기화 블럭 //한번만 호출
		avg = 89.5; grade = 'B';
	}
	
	public StaticDemo2 (int su, int num) {//생성자 == 멤버값 초기화
		this.su = su;
		this.num = num;
	}
	public static void main(String[] args) {

	}
}


public class EnumDemo {
	public static void main(String[] args) {
		Week w = Week.SAT;
		//int su = (int)w;
		System.out.println(w);
	}
}

enum Week {//나열형 enum
	SUN, MON, TUE, WED, THU, FRI, SAT;
	//public static final이 생략
}
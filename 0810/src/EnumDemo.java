
public class EnumDemo {
	public static void main(String[] args) {
		Week w = Week.SAT;
		//int su = (int)w;
		System.out.println(w);
	}
}

enum Week {//������ enum
	SUN, MON, TUE, WED, THU, FRI, SAT;
	//public static final�� ����
}

public interface Dateable {// 상수, 추상메소드 구성
	//1. public static final 상수 가능. (모두 생략)
	//상수는 대문자
	int SUN = 0;
	int MON = 1 , TUE = 2 , WED = 3 , THU = 4 , FRI = 5 , SAT = 6;
	
	//2. public abstract 메소드 가능.
	void display();
	
	int get(); //public 생략
	void set(int week);
}

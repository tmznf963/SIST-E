
public enum Week { // 열거형 enum
	SUN(0) , MON(10) , TUE(20), WED(30) , THU(70) , FRI(100) , SAT(1000); //상수
	private int value;
	Week(int value){//접근 제한자 사용 못함(생성자 개념으로 값 넣기)
		this.value = value;
	}
	public int display() {
		return this.value;
	} // 반드시 상수 뒤에 와야 한다.
}
//protected 생성자를 가지고 있어서
//다른 클래스에서 접근 할 수 없다.( Call X )


public class EnumDemo {
	public static void main(String[] args) {
		//Week w = new Week();// new 못 씀. enum이 protected 라서
		Week w = Week.FRI;	//열거형이름.상수명
		Week [] array = w.values();
		
		for(Week week : array) {
			System.out.println(week+ " --> " + week.ordinal() +
					" --> "+week.display());//0부터 시작하는
		}
	}
}
//enum.ordinal() 순서값 
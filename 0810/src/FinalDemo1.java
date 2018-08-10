
public class FinalDemo1 {
	private String name; // 멤버변수
	private final int SALARY; // 멤버상수

	public FinalDemo1(String name, int salary) {// 생성자 == 변수 초기화
		this.name = name;
		this.SALARY = salary;// 상수 초기화 가능
	}

	public static void main(String[] args) {
		FinalDemo1 fd = new FinalDemo1("Sallay",2_000_000);
		System.out.println(fd.name);
		System.out.println(fd.SALARY);
		
		FinalDemo1 fd1 = new FinalDemo1("Sallay",5_000_000);
		System.out.println(fd1.name);
		System.out.println(fd1.SALARY);
	}

}

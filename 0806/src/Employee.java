
public class Employee {
	private String name;
	private double salary;
	{//초기화 블럭
		System.out.println("인스턴스 초기화 블럭");
		this.name="마이클";
		this.salary = 444.77;
	}
	public Employee() {
		System.out.println("기본 생성자");
	}
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
	public void display() {
		System.out.println(name +" "+salary);
	}
}

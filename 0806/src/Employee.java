
public class Employee {
	private String name;
	private double salary;
	{//�ʱ�ȭ ��
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		this.name="����Ŭ";
		this.salary = 444.77;
	}
	public Employee() {
		System.out.println("�⺻ ������");
	}
//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}
	public void display() {
		System.out.println(name +" "+salary);
	}
}

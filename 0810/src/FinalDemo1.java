
public class FinalDemo1 {
	private String name; // �������
	private final int SALARY; // ������

	public FinalDemo1(String name, int salary) {// ������ == ���� �ʱ�ȭ
		this.name = name;
		this.SALARY = salary;// ��� �ʱ�ȭ ����
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

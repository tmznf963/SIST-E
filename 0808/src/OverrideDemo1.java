
public class OverrideDemo1 { // Override = �޼ҵ常 ���� , �θ� �ڽ� ���迡���� ����
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
		System.out.println(d.toString());
	}

}

class Demo extends Object{
	private String name = "Michael";
//	@Override
//	public String toString() {//Object �� �޼ҵ带 Override(������)
//		return "My name is " +this.name;
//	}

	@Override
	public String toString() {
		return "Demo [name=" + name + "]";
	}
	
}

public class HelloWorld3 {
	public static void main(String[] args) {
		Demo d = new Demo();//�ּ�����
		System.out.println("str = " +d.str);
		System.out.println("str = " +new Demo().str);
	}
}

class Demo{//�ּ�
	String str = "Hello, World";
}
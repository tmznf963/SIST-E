
public class StringDemo {//���ڿ� ���� == StringBuffer & StringBuilder
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 500000;i++) {
			sb = sb.append("A");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"ms");
	/*	String str = "Hello";
		StringBuffer sb = new StringBuffer("Hello");
		change(str,sb);
		System.out.println("str = " + str);
		System.out.println("sb = " + sb.toString());*/
	}
/*	static void change(String str, StringBuffer sb) {
		str.concat("World");//String�� ���� �Ұ�
		sb.append("World");//StringBuffer(Builder)�� ���� ����
	}*/
}

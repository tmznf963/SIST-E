import java.util.Stack;
import java.util.Vector;

public class GenericsDemo1 {
	public static void main(String[] args) {
/*		Stack<String> stack = new Stack<String>();
		Stack<Object> obj = new Stack<Object>();
		
		//Object obj1 = new String(); // �θ�-�ڽ� ������ ����ȯ ����
		//obj = stack; //���ʸ��� ����ȯ �Ұ�
		
		Vector<String> vector = new Stack<String>();//Type(String)�� ������ �θ�-�ڽ� ����ȯ ����
*/	
		Stack<? extends Number> stack = new Stack<Double>();//Number�� �ڽĸ� ��� �� �� �ִ�.
		Stack<? extends Number> stack1 = new Stack<Integer>();
		Stack<?> stack2 = new Stack<String>();
		Stack<?> stack3 = new Stack<Demo>(); // ���ʸ� ���迡���� Object
	}
}

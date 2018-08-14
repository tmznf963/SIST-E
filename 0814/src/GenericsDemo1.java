import java.util.Stack;
import java.util.Vector;

public class GenericsDemo1 {
	public static void main(String[] args) {
/*		Stack<String> stack = new Stack<String>();
		Stack<Object> obj = new Stack<Object>();
		
		//Object obj1 = new String(); // 부모-자식 끼리는 형변환 가능
		//obj = stack; //제너릭은 형변환 불가
		
		Vector<String> vector = new Stack<String>();//Type(String)이 같으면 부모-자식 형변환 가능
*/	
		Stack<? extends Number> stack = new Stack<Double>();//Number의 자식만 들어 올 수 있다.
		Stack<? extends Number> stack1 = new Stack<Integer>();
		Stack<?> stack2 = new Stack<String>();
		Stack<?> stack3 = new Stack<Demo>(); // 제너릭 세계에서의 Object
	}
}

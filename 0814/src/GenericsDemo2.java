import java.util.Stack;

public class GenericsDemo2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//stack.push("Hello"); display(stack);
		Stack<Integer> stack1 =new Stack<Integer>();
		stack1.push(100); display(stack1);
		Stack<Double> stack2 = new Stack<Double>();
		stack2.push(20.3); display(stack2);
	}
	static void display(Stack<? extends Number> stack) {  // wild card type  //raw type == type 지정 안한 것
		Number num = stack.pop();
		System.out.println(num);		
	}
		/*Object obj = stack.pop();
		if(obj instanceof Integer) {
			System.out.println(obj);
		}*/
}

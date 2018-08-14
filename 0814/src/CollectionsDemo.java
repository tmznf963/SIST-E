import java.util.Enumeration;
import java.util.Stack;

//Enumeration , Iterator interface
public class CollectionsDemo {
	public static void main(String[] args) {
		Stack<String> singers = new Stack<String>();//List interface
		singers.push("소녀시대");//push, pop, peek, search,empty
		singers.push("BTS");
		singers.push("모모랜드");
		singers.push("워너원");
		
		Enumeration<String> enums = singers.elements();//나열형
		while(enums.hasMoreElements()) {//더이상 elements가 없을 때 까지.
			System.out.println(enums.nextElement());
		}
		
		/*System.out.println(singers.pop());
		System.out.println(singers.pop());
		System.out.println(singers.pop());
		System.out.println(singers.pop());//LIFO == Stack
		 */	
	}
}

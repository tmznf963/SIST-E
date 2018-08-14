import java.util.Enumeration;
import java.util.Stack;

//Enumeration , Iterator interface
public class CollectionsDemo {
	public static void main(String[] args) {
		Stack<String> singers = new Stack<String>();//List interface
		singers.push("�ҳ�ô�");//push, pop, peek, search,empty
		singers.push("BTS");
		singers.push("��𷣵�");
		singers.push("���ʿ�");
		
		Enumeration<String> enums = singers.elements();//������
		while(enums.hasMoreElements()) {//���̻� elements�� ���� �� ����.
			System.out.println(enums.nextElement());
		}
		
		/*System.out.println(singers.pop());
		System.out.println(singers.pop());
		System.out.println(singers.pop());
		System.out.println(singers.pop());//LIFO == Stack
		 */	
	}
}

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue <String> queue = new LinkedList<String>();//�θ�=�ڽ�();
		queue.offer("Pizza");
		queue.offer("Chicken");
		queue.offer("Pasta");
		queue.offer("Spagetti");
		
		System.out.println(queue.poll());//�ϳ��� �̾Ƴ���
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());//�� ���� 
	}
}

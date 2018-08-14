import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue <String> queue = new LinkedList<String>();//부모=자식();
		queue.offer("Pizza");
		queue.offer("Chicken");
		queue.offer("Pasta");
		queue.offer("Spagetti");
		
		System.out.println(queue.poll());//하나씩 뽑아내기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());//맨 위에 
	}
}

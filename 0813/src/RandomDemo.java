import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		//int rand = (int) Math.floor((Math.random()*6+1));
		Random r = new Random();
		int rand = r.nextInt(10);
		
		System.out.println(rand);
		
	}
}

import java.util.Vector;

//컬렉션프레임워크 Vector == 계속 늘어가는 List
public class Main {
	public static void main(String[] args) {
		System.out.println("Program is starting!!!!!!!!!");
		
		
		Vector<Student> vector = new Vector<Student>(1,1);//한칸 시작 --> 한칸씩 증가
		
		Input in = new Input(vector);//input 생성자에게 vector 넘김
		in.input();
		
		Calc c = new Calc(vector);
		c.calc();
		
		Sort sort = new Sort(vector);
		sort.BubbleSort();
		
		Output op = new Output(vector);//생성자
		op.output();//메소드
		
		System.out.println("Program is over.....................");
	}
}

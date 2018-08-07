
public class Main {
	public static void main(String[] args) {
		System.out.println("Program is starting!!!!!!!!!");
		
		
		Student [] array = new Student [100];//학생 수첩 생성
		Input in = new Input(array);//input 생성자에게 배열 넘김
		int count = in.input(); //input --> count 넘어옴
		//System.out.println(count);
		
		Calc c = new Calc(array,count);
		c.calc();
		
		Sort sort = new Sort(array,count);
		sort.BubbleSort();
		
		Output op = new Output(array,count);//생성자
		op.output();//메소드
		
		System.out.println("Program is over.....................");
	}
}

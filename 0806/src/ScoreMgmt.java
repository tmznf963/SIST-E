
public class ScoreMgmt {
	public static void main(String[] args) {
		Student [] s_arr = new Student[2];//ÇÐ»ý¼öÃ¸
		
		Input in = new Input();//Input class
		in.input(s_arr);

		Calc c = new Calc();
		c.calc(s_arr);
		
		Output op = new Output();
		op.output(s_arr);
		
	}
}

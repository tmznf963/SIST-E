
public class TaxMgmt {
	public static void main(String[] args) {
		Db [] d_arr = new Db[5];//¸í¼¼¼­ ¼öÃ¸
			
			Input in = new Input();//Input class
			in.input(d_arr);
	
			Calc c = new Calc();
			c.calc(d_arr);
			
			Output op = new Output();
			op.output(d_arr);
			
	}
}

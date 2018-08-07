
public class TaxMgmt {
	public static void main(String[] args) {
		Db [] d_arr = new Db[100];
			
			Input in = new Input(d_arr);//Input class의 생성자
			int count = in.input(); //count 넘어옴
			
		/*
		    System.out.println("count = "+count);
			System.out.println(d_arr[9].getName());*/
			
			Calc c = new Calc(d_arr,count);
			c.calc();
			
			Sort sort = new Sort(d_arr,count);
			sort.BubbleSort();
			
			Output op = new Output(d_arr, count);
			op.output();
			
	}
}


public class TaxMgmt {
	public static void main(String[] args) {
		Db [] d_arr = new Db[100];
			
			Input in = new Input(d_arr);//Input class�� ������
			int count = in.input(); //count �Ѿ��
			
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


public class Main {
	public static void main(String[] args) {
		System.out.println("Program is starting!!!!!!!!!");
		
		
		Student [] array = new Student [100];//�л� ��ø ����
		Input in = new Input(array);//input �����ڿ��� �迭 �ѱ�
		int count = in.input(); //input --> count �Ѿ��
		//System.out.println(count);
		
		Calc c = new Calc(array,count);
		c.calc();
		
		Sort sort = new Sort(array,count);
		sort.BubbleSort();
		
		Output op = new Output(array,count);//������
		op.output();//�޼ҵ�
		
		System.out.println("Program is over.....................");
	}
}

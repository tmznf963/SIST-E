import java.util.Vector;

//�÷��������ӿ�ũ Vector == ��� �þ�� List
public class Main {
	public static void main(String[] args) {
		System.out.println("Program is starting!!!!!!!!!");
		
		
		Vector<Student> vector = new Vector<Student>(1,1);//��ĭ ���� --> ��ĭ�� ����
		
		Input in = new Input(vector);//input �����ڿ��� vector �ѱ�
		in.input();
		
		Calc c = new Calc(vector);
		c.calc();
		
		Sort sort = new Sort(vector);
		sort.BubbleSort();
		
		Output op = new Output(vector);//������
		op.output();//�޼ҵ�
		
		System.out.println("Program is over.....................");
	}
}

import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	
	public Output(Vector<Student> vector) { //������
		this.vector = vector;
	}
	
	public void output() {
		this.displayLabel();
		for(int i=0 ; i<this.vector.size() ; i++) {
			Student s = this.vector.get(i);//elementAt(i);
			System.out.printf("%-6s%-6s%5d%5d%5d%5d%5d%7.2f%5c\n",
					s.getHakbun(),s.getName(),s.getKor(),s.getEdp(),s.getMat(),s.getEdp(),s.getSum(),s.getAvg(),s.getGrade());
		}
	}
	private void displayLabel() {
		System.out.println("                           <<�ֿ� �������� ���α׷�>>");
		System.out.println("================================================");
		System.out.println("�й�         �̸�          ����       ����       ����       ����      ����        ���             ����");
		System.out.println("================================================");
	}
}

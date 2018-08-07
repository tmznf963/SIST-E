
public class Output {
	private Student [] array;
	private int count;
	
	public Output(Student[] array, int count) { //������
		this.array = array;
		this.count = count;
	}
	
	public void output() {
		this.displayLabel();
		for(int i=0 ; i<this.count ; i++) {
			Student s = this.array[i];
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

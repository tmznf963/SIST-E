
public class Output {
	private Student [] array;
	private int count;
	
	public Output(Student[] array, int count) { //생성자
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
		System.out.println("                           <<쌍용 성적관리 프로그램>>");
		System.out.println("================================================");
		System.out.println("학번         이름          국어       영어       수학       전산      총점        평균             평점");
		System.out.println("================================================");
	}
}

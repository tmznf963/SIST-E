import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	private PrintWriter pw;
	
	public Output(Vector<Student> vector) { //생성자
		this.vector = vector;
		
		File file = new File("C:/temp/result.dat");
		try {
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))));			
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	public void output() {
		this.displayLabel();
		for(int i=0 ; i<this.vector.size() ; i++) {
			Student s = this.vector.get(i);//elementAt(i);
			this.pw.printf("%-6s%-6s%5d%5d%5d%5d%5d%7.2f%5c\n",
					s.getHakbun(),s.getName(),s.getKor(),s.getEdp(),s.getMat(),s.getEdp(),s.getSum(),s.getAvg(),s.getGrade());
			this.pw.println();
			this.pw.flush();
		}
	}
	private void displayLabel() {
		this.pw.println("                           <<쌍용 성적관리 프로그램>>");
		this.pw.println("================================================");
		this.pw.println("학번         이름          국어       영어       수학       전산      총점        평균             평점");
		this.pw.println("================================================");
	}
}

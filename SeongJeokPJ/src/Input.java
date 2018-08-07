import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Input {
	private Student[] array;
	private Scanner scan;
	
	public Input(Student[] array) {//������ //Main���� ���� array �ޱ�
		this.array = array;
		File file = new File("./sungjuk.dat"); // ./������ġ ../�θ���ġ
		try {
			this.scan = new Scanner(file); //scan�� file�� ������ �ִ�.
		} catch (FileNotFoundException e) {//file ��ã����
			System.out.println("File Not Found");
			System.exit(-1);//������ ����   // 0 == ��������
		}
	}
	
	public int input() {
		int count = 0;
		while(this.scan.hasNextLine()) {//������ ���� ������ ���� �� ����
			String line = this.scan.nextLine(); //file ���� �����б� --> scan
			String [] array = line.split("\\s+");//regex == ���Խ����� ä�� �־�� �Ѵ�. \\s+ ����� 1���̻�
			Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),
					Integer.parseInt(array[5]));
			this.array[count++] = s;
		}
		return count;
	}
}

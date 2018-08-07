import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Input {
	private Student[] array;
	private Scanner scan;
	
	public Input(Student[] array) {//생성자 //Main에서 보낸 array 받기
		this.array = array;
		File file = new File("./sungjuk.dat"); // ./현재위치 ../부모위치
		try {
			this.scan = new Scanner(file); //scan이 file을 가지고 있다.
		} catch (FileNotFoundException e) {//file 못찾으면
			System.out.println("File Not Found");
			System.exit(-1);//비정상 종료   // 0 == 정상종료
		}
	}
	
	public int input() {
		int count = 0;
		while(this.scan.hasNextLine()) {//파일의 다음 라인이 없을 때 까지
			String line = this.scan.nextLine(); //file 정보 한줄읽기 --> scan
			String [] array = line.split("\\s+");//regex == 정규식으로 채워 넣어야 한다. \\s+ 빈공간 1번이상
			Student s = new Student(array[0],array[1],Integer.parseInt(array[2]),Integer.parseInt(array[3]),Integer.parseInt(array[4]),
					Integer.parseInt(array[5]));
			this.array[count++] = s;
		}
		return count;
	}
}

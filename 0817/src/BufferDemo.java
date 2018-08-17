import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String line = null;
		try {
			//가나다라마바사아자차카타파하
			br = new BufferedReader(new FileReader("src/BufferDemo.java"));
			bw = new BufferedWriter(new FileWriter("./buffercopy.txt")); //감싸고 감싸고
			while((line = br.readLine()) != null) {//read로 한 줄 씩 읽을때 null이 아닐 동안.
				bw.write(line+"\n");//한 줄 출력
				
			}
			System.out.println("File copy successfully");
		}catch(IOException e) {
			
		}finally {
			try {
				br.close(); bw.close(); // 닫기
			}catch(IOException e) {
				
			}
		}
	}
}

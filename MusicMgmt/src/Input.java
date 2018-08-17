import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
	private Vector<Music> vector;
	private Scanner scan;
	
	public Input(Vector<Music> vector) {//생성자 //Main에서 보낸 vector 받기
		this.vector = vector;
		this.scan = new Scanner(System.in);
	
	}
	
	public void input() {
		int i =0;
		while(i < 7) {//7건 이하로 간주
			System.out.print("소매점번호 : ");   
	         int num = this.scan.nextInt();
	         
	         System.out.print("음악종류코드 : ");
	         String code = this.scan.next();
	         
	         System.out.print("판매수량 : ");
	         int su = this.scan.nextInt();
	         
	         System.out.print("입력/출력 (I/O) ? ");
	         String io = this.scan.next();
			
			Music m = new Music(num, code, su);
			this.vector.addElement(m);//vector 값 추가 == addElement();
			
			if(io.equalsIgnoreCase("O")) {
	            break;
	         }else if(io.equalsIgnoreCase("I")) {
	        	 continue;
	         }else {
	        	 System.out.println("입력/출력 잘 못 입력하셨습니다. 프로그램을 종료.");        	 
	        	 System.exit(-1); 
	         }
			
			i++;
		}
	}
}
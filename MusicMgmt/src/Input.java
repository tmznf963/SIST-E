import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
	private Vector<Music> vector;
	private Scanner scan;
	
	public Input(Vector<Music> vector) {//������ //Main���� ���� vector �ޱ�
		this.vector = vector;
		this.scan = new Scanner(System.in);
	
	}
	
	public void input() {
		int i =0;
		while(i < 7) {//7�� ���Ϸ� ����
			System.out.print("�Ҹ�����ȣ : ");   
	         int num = this.scan.nextInt();
	         
	         System.out.print("���������ڵ� : ");
	         String code = this.scan.next();
	         
	         System.out.print("�Ǹż��� : ");
	         int su = this.scan.nextInt();
	         
	         System.out.print("�Է�/��� (I/O) ? ");
	         String io = this.scan.next();
			
			Music m = new Music(num, code, su);
			this.vector.addElement(m);//vector �� �߰� == addElement();
			
			if(io.equalsIgnoreCase("O")) {
	            break;
	         }else if(io.equalsIgnoreCase("I")) {
	        	 continue;
	         }else {
	        	 System.out.println("�Է�/��� �� �� �Է��ϼ̽��ϴ�. ���α׷��� ����.");        	 
	        	 System.exit(-1); 
	         }
			
			i++;
		}
	}
}
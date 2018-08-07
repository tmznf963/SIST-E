import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Input {
   private Scanner scan;//멤버변수
   private File file;
   private Db [] array;
   
   public Input(Db [] d_arr) {//생성자 [멤버변수 초기화]
	   this.array = d_arr;
	   file = new File("./Input.txt");	   
	   try {
		   scan = new Scanner(file);
	   } catch (FileNotFoundException e) {
		   JOptionPane.showMessageDialog(null, "File Not Found");
		   System.exit(-1);// -1 종료
	   }
   }
		/*
		 * 문자열 parsing 하는 방법 3가지
		 * String class에서 split()
		 * java.util.StringTokenizer class
		 * java.util.Scanner class
		 * 
		 * \s+ 1번 이상
		 * \s* 0번 이상
		 * \s? 0과1     <-- 공백
		 * 
		 * 정규식
		 * \d 숫자
		 * \w 문자
		 * \W 문자제외
		 * \D 숫자제외
		 * \d{3} 10진수 3번 반복 ex)123
		 * 01\d-\d{3,4}-\d{4}
		 * */
		
   public int input(){//메소드
	   int count = 0;
	   while(this.scan.hasNextLine()) {//파일의 내용이 다음 라인이 있을 때 까지
		   
		   String line = this.scan.nextLine();
		   String [] array = line.split("\\s+");
		   
		   int num = Integer.parseInt(array[0]);
		   String tel = array[1];
		   String name = array[2];
		   int time = Integer.parseInt(array[3]);
		   
		   Db db = new Db(num,tel,name,time);
		   this.array[count] = db;
		   
		   count++;//횟수 체크
	   }
	   return count;
	}
	
}//class
	   
      
/*      for(int i =0; i<array.length; i++) {
         
      System.out.print("구분 :");   int num =scan.nextInt();
      System.out.print("전화번호 :");   String tel =scan.next();
      System.out.print("이름 :");   String name =scan.next();
      System.out.print("통화량 :");   int time= scan.nextInt();
      
      Db db = new Db(num,tel, name ,time) ;
        array [i]=db;
      }   */
      
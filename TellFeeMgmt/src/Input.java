import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Input {
   private Scanner scan;//�������
   private File file;
   private Db [] array;
   
   public Input(Db [] d_arr) {//������ [������� �ʱ�ȭ]
	   this.array = d_arr;
	   file = new File("./Input.txt");	   
	   try {
		   scan = new Scanner(file);
	   } catch (FileNotFoundException e) {
		   JOptionPane.showMessageDialog(null, "File Not Found");
		   System.exit(-1);// -1 ����
	   }
   }
		/*
		 * ���ڿ� parsing �ϴ� ��� 3����
		 * String class���� split()
		 * java.util.StringTokenizer class
		 * java.util.Scanner class
		 * 
		 * \s+ 1�� �̻�
		 * \s* 0�� �̻�
		 * \s? 0��1     <-- ����
		 * 
		 * ���Խ�
		 * \d ����
		 * \w ����
		 * \W ��������
		 * \D ��������
		 * \d{3} 10���� 3�� �ݺ� ex)123
		 * 01\d-\d{3,4}-\d{4}
		 * */
		
   public int input(){//�޼ҵ�
	   int count = 0;
	   while(this.scan.hasNextLine()) {//������ ������ ���� ������ ���� �� ����
		   
		   String line = this.scan.nextLine();
		   String [] array = line.split("\\s+");
		   
		   int num = Integer.parseInt(array[0]);
		   String tel = array[1];
		   String name = array[2];
		   int time = Integer.parseInt(array[3]);
		   
		   Db db = new Db(num,tel,name,time);
		   this.array[count] = db;
		   
		   count++;//Ƚ�� üũ
	   }
	   return count;
	}
	
}//class
	   
      
/*      for(int i =0; i<array.length; i++) {
         
      System.out.print("���� :");   int num =scan.nextInt();
      System.out.print("��ȭ��ȣ :");   String tel =scan.next();
      System.out.print("�̸� :");   String name =scan.next();
      System.out.print("��ȭ�� :");   int time= scan.nextInt();
      
      Db db = new Db(num,tel, name ,time) ;
        array [i]=db;
      }   */
      
import java.util.Scanner;

public class Input {
   public void input(Db [] array){   //public �� �ٱ����� ���� �����ϰ�. return���ص� �Ǹ� void.
      Scanner scan = new Scanner(System.in);
      for(int i =0; i<array.length; i++) {
         
      System.out.print("���� :");   int num =scan.nextInt();
      System.out.print("��ȭ��ȣ :");   String tel =scan.next();
      System.out.print("�̸� :");   String name =scan.next();
      System.out.print("��ȭ�� :");   int time= scan.nextInt();
      
      Db db = new Db(num,tel, name ,time) ;
      if(num==1) {
    	  db.setDef_tax(6000);
      }else if(num==2) {
    	  db.setDef_tax(4800);
      }else
    	  db.setDef_tax(3000);
          array [i]=db;
      }   
   }
}
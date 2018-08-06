import java.util.Scanner;

public class Input {
   public void input(Db [] array){   //public 은 바깥에서 접근 가능하게. return안해도 되면 void.
      Scanner scan = new Scanner(System.in);
      for(int i =0; i<array.length; i++) {
         
      System.out.print("구분 :");   int num =scan.nextInt();
      System.out.print("전화번호 :");   String tel =scan.next();
      System.out.print("이름 :");   String name =scan.next();
      System.out.print("통화량 :");   int time= scan.nextInt();
      
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
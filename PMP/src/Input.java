import java.util.Scanner;

class Input {
   private Pmp[] p;
   private Scanner scan;
   private int count;
   public Input(Pmp[] p) {
      this.scan = new Scanner(System.in);
      this.p = p;
   }
   public int input() {
      int count = 0;
      for(int i = 0 ; i < p.length ; i++) {
         System.out.print("��ȣ");   
         int num = this.scan.nextInt();
         System.out.print("�����ڵ�");
         String code = this.scan.next();
         System.out.print("�Կ��ϼ�");
         int days = this.scan.nextInt();
         System.out.print("����");
         int age = this.scan.nextInt();
         System.out.print("�Է�/��� (I/O)?");
         String io = this.scan.next();
         
         Pmp d = new Pmp(num, code, days, age);
          p[i]=d;
          count++;
         if(io.equalsIgnoreCase("O")) {
            break;
         }
      }
      return count;
   }//input end
}
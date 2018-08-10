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
         System.out.print("번호");   
         int num = this.scan.nextInt();
         System.out.print("진료코드");
         String code = this.scan.next();
         System.out.print("입원일수");
         int days = this.scan.nextInt();
         System.out.print("나이");
         int age = this.scan.nextInt();
         System.out.print("입력/출력 (I/O)?");
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

public class Output {
   private Pmp [] array;
   private int count;
   public Output(Pmp[] array, int count) {
      this.array = array;
      this.count = count;
   }
   public void output () {
      this.displayLabel();
      for(int i =0 ; i < this.count ; i++) {
         Pmp p = this.array[i];
         System.out.printf("%d %s %d %d %d\n",
               p.getNum(), p.getPart(), p.getFee(), p.getCost(), p.getPrice());
      }
      System.out.println("------------------------------------");   
   }
   private void displayLabel() {
      System.out.println("       <<���� ���� ���α׷�>>");
      System.out.println("------------------------------------");
      System.out.println("��ȣ     �����μ�       ������      �Կ���     ����� ");
      System.out.println("------------------------------------");
      
   }
   
   
}
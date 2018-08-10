
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
      System.out.println("       <<병원 관리 프로그램>>");
      System.out.println("------------------------------------");
      System.out.println("번호     진찰부서       진찰비      입원비     진료비 ");
      System.out.println("------------------------------------");
      
   }
   
   
}
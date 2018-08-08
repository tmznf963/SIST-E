
public class Output {
   private Product [] array;
   private int count;
   public Output(Product[] array, int count) {
      this.array = array;
      this.count = count;
   }
   public void output () {
      this.displayLabel();
      for(int i =0 ; i < this.count ; i++) {
         Product p = this.array[i];
         System.out.printf("%s %d %d  %d  %d  %d  %.2f\n",
               p.getName(), p.getSu(), p.getSell_price(), 
               p.getBuy_price(), p.getFee(), p.getCost(), 
               p.getPer_cost());
      }
      
   }
   private void displayLabel() {
      System.out.println("                 <<상품별 판매 이익금 및 이용요금>>");
      System.out.println("-----------------------------------------------------------");
      System.out.println("상품명                  수량     판매단가     매입단가      운송료        이익금       이익률 ");
      System.out.println("-----------------------------------------------------------");
      
   }

}
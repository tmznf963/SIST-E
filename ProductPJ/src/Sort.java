public class Sort {
   private Product [] array; 
   private int count;
   public Sort(Product[] array, int count) {
      this.array = array;
      this.count = count;
   }
   public void bubbleSort() {
      for(int i = 0 ; i < this.count - 1 ; i++) {
         for(int j = 0 ; j < this.count - 1 ; j++) {
            if((this.array[j].getPer_cost())*100 < (this.array[j+1].getPer_cost())*100) {
               swap(j, j+1);
            }//*100 이유 : 실수값을 비교하기위해.
         }
      }
   }
   private void swap(int a, int b) {
      Product temp = this.array[a];
      this.array[a] = this.array[b];
      this.array[b] = temp;
   }
}
public class Sort {
   private Pmp [] array;
   private int count;
   public Sort(Pmp[] array, int count) {
      this.array = array;
      this.count = count;
   }
   public void bubbleSort() {
      for(int i = 0 ; i < count - 1 ; i++) {
         for(int j = 0 ; j < count - 1 ; j++) {
            if(this.array[j].getNum() > this.array[j+1].getNum()) {
               swap(j, j+1);
              
            }
         }
      }
   }
      private void swap(int a, int b ) {
         Pmp temp = this.array[a];
          this.array[a] = this.array[b];
          this.array[b] = temp;
      }
   }
public class Main {
   public static void main(String[] args) {

      Product [] array =new Product[100 ];  
            Input input = new Input(array);  
            int count =input.input();
            
            Calc calc = new Calc(array,count);   
            calc.calc();
            
//            Sort  sort = new Sort(array,count);   
//            sort.bubbleSort();
            Sort1  sort = new Sort1(array,count);   
            sort.selectionSort(); 
            
            Output output = new Output(array, count);   
            output.output();   
   }
}
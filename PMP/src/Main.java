//�����������α׷�
public class Main {
  public static void main(String[] args) {
   
     Pmp [] array = new Pmp [3];
     
     Input input = new Input(array);
    int count = input.input();
     
     Calc calc = new Calc(array,count);
     calc.calc();
     
     Sort sort = new Sort(array,count);
     sort.bubbleSort();
     
     Output output = new Output(array,count);
     output.output();
     

     }
}
import java.util.Vector;

public class Main { 
   public static void main(String[] args) {

      Vector <Music> vector = new Vector <Music> (1,1);
      Input input = new Input(vector); 
      input.input();
      
      Calc calc = new Calc(vector);
      calc.calc();

      Output output = new Output(vector);
      output.output();

   }
}
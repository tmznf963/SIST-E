
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
   private Product[] data;
   private Scanner scan;
   public Input(Product[] data) {
      this.data = data;
      File file = new File("./productdata.dat");
      try {
         this.scan = new Scanner(file);
         System.out.println("File Find");
      } catch (FileNotFoundException e) {
         System.out.println("File Not Found");
         System.exit(-1);
      }
   }
   public int input() {
      int count = 0;
      
      while(this.scan.hasNextLine()) {
         String line = scan.nextLine();
         String [] data = line.split("\\s+");
         Product  p = new Product(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
               Integer.parseInt(data[3]),Integer.parseInt(data[4]));
         this.data[count++] = p;
         }
      return count;
   }
}
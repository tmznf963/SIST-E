import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("mspaint");//½ÇÇà
		
		/*Runtime r1 = Runtime.getRuntime();
		
		System.out.println(r +"\n"+ r1);*/
	}
}

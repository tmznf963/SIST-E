//default package
import com.javasoft.libs.finance.Money;
import com.javasoft.libs.hr.Employee;
import static java.lang.System.out;
import static java.lang.Math.random;

public class ImportDemo extends Employee {
	public static void main(String[] args) {
		//Employee e = new Employee();
		ImportDemo id = new ImportDemo();
		
		
		/*Money m = new Money();
		out.println("price = " + m.price);
		
		int rand = (int) (Math.random()*6+1);//1 ~6
		out.println("rand = " + rand );
		
		double rand1 = random();
		out.println("rand1 = "+rand1);*/
	}
	static double random() {
		return 3.14;
	}
}

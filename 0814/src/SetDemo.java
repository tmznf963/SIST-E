import java.util.HashSet;
import java.util.Set;

public class SetDemo {//List interface
	public static void main(String[] args) {//ctrl + shift + o
		Set<String> set = new HashSet<String>(); //부모형 = 자식형()
		
		set.add("JAVA");
		set.add("Python");
		set.add("C");
		set.add("Big-Data");
		set.add("HTML5");
		set.add("C");
		set.add("JAVA");
		
		System.out.println(set);
	}
}

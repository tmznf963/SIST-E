import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {//List interface
	public static void main(String[] args) {//ctrl + shift + o
		//Set<String> set = new HashSet<String>(); //부모형 = 자식형()
		Set<String> set = new TreeSet<String>();//자동 sorting
		set.add("JAVA");
		set.add("Python");
		set.add("C");
		set.add("Big-Data");
		set.add("HTML5");
		set.add("C");
		set.add("JAVA");//중복 허용안함
		
		Iterator<String> iters = set.iterator();
		while(iters.hasNext()) {
			System.out.println(iters.next());
		}
		
		System.out.println();
		System.out.println(set);
	}
}

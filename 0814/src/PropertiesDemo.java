import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		/*System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperties());
		*/
		
		Properties info = System.getProperties();
		System.out.println(info.keySet());//Set == 중복 없음
		
		Enumeration<Object> enums = info.keys();//열거형
		while(enums.hasMoreElements()) {
			String key = (String)enums.nextElement();
			System.out.println(key + " --> " + System.getProperty(key));
		}
	}
}

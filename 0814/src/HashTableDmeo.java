import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class HashTableDmeo {
	public static void main(String[] args) {
		Date now = new Date();
		//System.out.println(now);
		StringTokenizer st = new StringTokenizer(now.toString());
		String [] array =new String[ st.countTokens()];//방 갯수
		
		int count = 0;
		while(count < array.length) {
			array[count++]= st.nextToken();
		}
		String year = array[5];
		String month = array[1];
		String day = array[2];
		System.out.println("Today is " + year + "년 "+ getMonth(month)+"월 "+day+"일 입니다.");
		
			
	}
	static int getMonth(String month) {
		Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("Jan", 1); ht.put("May", 5); ht.put("Sep", 9);
		ht.put("Feb", 2); ht.put("Jun", 6); ht.put("Oct", 10);
		ht.put("Mar", 3); ht.put("Jul", 7); ht.put("Nov", 11);
		ht.put("Apr", 4); ht.put("Aug", 8); ht.put("Dec", 12);
		return ht.get(month);
	}
}

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String line = "1101 한송이 78 87 90 95";
		/*String [] array = line.split("\\s+");//정규식
		System.out.println(array[0]);*/
		
		StringTokenizer st = new StringTokenizer(line);//("2018-08-14" , "-") --> 짜를 문자열 , 짜를 단위
		String [] array = new String[st.countTokens()];//짜른 갯수만큼 배열 만들기
		int count = 0;
		while(count <array.length) {
			array[count++] = st.nextToken();
		}
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);			
		}
	}
}

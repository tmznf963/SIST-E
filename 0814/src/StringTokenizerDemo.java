import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String line = "1101 �Ѽ��� 78 87 90 95";
		/*String [] array = line.split("\\s+");//���Խ�
		System.out.println(array[0]);*/
		
		StringTokenizer st = new StringTokenizer(line);//("2018-08-14" , "-") --> ¥�� ���ڿ� , ¥�� ����
		String [] array = new String[st.countTokens()];//¥�� ������ŭ �迭 �����
		int count = 0;
		while(count <array.length) {
			array[count++] = st.nextToken();
		}
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);			
		}
	}
}

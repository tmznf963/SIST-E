
public class ArrayDemo1 {
	public static void main(String[] args) {
		//byte, short, int, long --> 0 으로 초기화
		//float, double --> 0.0
		//boolean --> false
		//char --> null값, '\0', '\u0000' 	[ASCII 0]
		//참조형(String, Class, Interface) --> null번지
		
		char [] array = new char[4];
		for(int i = 0 ; i <4 ; i++) {
			System.out.println("array"+i+" = "+array[i]);
		}
		
	}
}

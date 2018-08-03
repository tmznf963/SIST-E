
public class CallByRefDemo1 {
	public static void main(String[] args) {
		int [] arr = {3,4};
		String str = "Hello";
		double pi = 3.14;
		change(arr,str,pi);
		System.out.printf("%d  %s  %f",arr[0],str,pi);
		//주소에 의한 호출 == 참조형 ex)배열 == 바뀐다
		//값에 의한 호출 == primitive 8가지 , String(상수) == 바뀌지 않음
	}
	static void change(int[] arr , String str, double pi) {
		arr[0] = 100;
		str = "World";
		pi = 4.14;
		
	}
}

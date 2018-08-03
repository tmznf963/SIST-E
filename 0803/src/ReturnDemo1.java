import java.util.Arrays;
public class ReturnDemo1 {
	public static void main(String[] args) {

		int [] arr = new int[] {1,2,3,4};
		arr = demo(arr);
		System.out.println(Arrays.toString(arr));//나열함수
	}
	static int [] demo(int [] arr1) {//int [] arr1 = arr   //주소복사
		arr1 = new int[] {10,9,8,7,6,5,4,3,2,1};
		return arr1;
	}//리턴타입 메소드이름 괄호 ex) void demo ()
}

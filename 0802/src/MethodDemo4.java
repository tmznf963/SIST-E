
public class MethodDemo4 {
	public static void main(String[] args) {
		MethodDemo4 md4 = new MethodDemo4();

		int[] arr = {5,9};
		System.out.println("변경 전");
		System.out.printf("a=%d   b=%d \n",arr[0],arr[1]);
		md4.swap(arr);
		System.out.println("변경 후");
		System.out.printf("a=%d   b=%d \n",arr[0],arr[1]);
		
	}
	void swap(int [] arr2) {//Call By Reference //배열의 주소복사
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		
		System.out.println("===메소드===");
		System.out.printf("a=%d b=%d \n",arr2[0],arr2[1]);
		System.out.println("===메소드===");
	}
}

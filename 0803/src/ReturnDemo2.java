import java.util.Scanner;
import java.util.Arrays;
public class ReturnDemo2 {
	public static void main(String[] args) {
		int [] arr = null;
		ReturnDemo2 rd = new ReturnDemo2();
	arr = rd.input(arr); //입력
	arr = rd.sort(arr); //정렬
	rd.output(arr); //출력
	System.out.println("Program is over.........");
	}
	
	 int [] input(int [] arr){
		 Scanner scan = new Scanner(System.in);
		 arr = new int[4]; //배열 생성
		 for(int i = 0 ; i< arr.length ; i++) {
			 arr[i] = scan.nextInt();
		 }
		return arr;
	}
	 
	 int [] sort(int [] arr){
		 Arrays.sort(arr);//오름차순
		return arr;
	}
	 
	 void output(int [] arr){
		 System.out.println(Arrays.toString(arr));//Arrays.toString(arr)
	 }

}//메소드 사용 이유 : 유지보수 & 재활용

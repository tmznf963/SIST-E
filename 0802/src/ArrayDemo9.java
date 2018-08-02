
public class ArrayDemo9 {
	public static void main(String[] args) {

		// 1st way
		int[][] arr; // 선언
		arr = new int[4][3];// 행- 열|
		arr[0][0] = 4;

		// 2nd way
		int[][] arr1;
		arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		// 3rd way
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
//		System.out.println("행" + arr.length); 		  //4
//		System.out.println("열" + arr[0].length); //3

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf("%d행 %d열 = %d    ", i, j, arr1[i][j]);
			}
			System.out.println();
		}
	}
}

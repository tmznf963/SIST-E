
public class ArrayDemo10 {
	public static void main(String[] args) {
		//jagged Array 열마다 수가 다른 배열
		
		int [][] array; //참조배열
		array = new int[4][];
		
		array[0] = new int[2];
		array[0][0] = 4 ; array[0][1] =2;
		array[1] = new int[3];
		array[2] = new int[5];
		array[3] = new int[1];
		
		//2nd way
		int [][] arr;
		arr = new int[4][];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {3,1,2};
		arr[2] = new int[] {1};
		arr[3] = new int[] {5,7,4,1,2};
		
		//3rd way
		int [][] arr1 = {
				{1,2},{4,5,6},{7},{8,9,10,11}
		};
		
		for(int i = 0 ; i < arr1.length ; i++) {//행
			for (int j=0; j<arr1[i].length;j++) {//열
				System.out.printf("%d %d = %d  ",i,j,arr1[i][j]);
			}
			System.out.println();
		}
		
	}
}

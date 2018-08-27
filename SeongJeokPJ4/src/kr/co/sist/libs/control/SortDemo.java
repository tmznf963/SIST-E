package kr.co.sist.libs.control;

public class SortDemo {
	public static void main(String[] args) {
		int[] array = {4,7,1,2,9,3,5,4};
		System.out.println("소팅 전 : ");
		print(array);
		insertionSrot(array);
		System.out.println("\n소팅 후 : ");
		print(array);
	}
	static void print(int[] array) {for(int su : array) System.out.print(su +"  ");}
	static void bubbleSort() {}
	static void selectionSort() {}
	
	static void insertionSrot(int[] array) {
		int i, j , key;
		for(i = 1 ; i < array.length ; i++) {
			key = array[i];
			for(j = i-1 ; j >=0 && array[j] < key ; j--) { //내림차순
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}
	}
}

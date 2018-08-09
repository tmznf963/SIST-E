
public class Sort {
	private Product [] array;
	private int count;
	public Sort(Product [] array, int count) {
		this.array = array;
		this.count = count;
	}
	public void selectionSort() {
		for(int i = 0 ; i < count-1 ; i++) {
			for(int j = i +1 ; j < count ; j++) {
				
			}
		}
	}
	private void swap(int a, int b) {
		Product temp = this.array[a];
		this.array[a] = this.array[b];
		this.array[b] = temp;
	}
}

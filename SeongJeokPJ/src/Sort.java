
public class Sort {
	private Student[] array;
	private int count;
	public Sort(Student[] array, int count) {//생성자
		this.array = array;
		this.count = count;
	}
	public void BubbleSort() {
		for(int i = 0 ; i< count -1 ; i++) {
			for(int j = 0 ; j < count -1 ; j++) {
				if(this.array[j].getSum() < this.array[j+1].getSum()) {//내림차순
					this.swap(j,j+1);//j번째, j+1번째 비교
				}
			}
		}
	}
	private void swap(int a , int b) {
		Student temp = this.array[a];
		this.array[a] = this.array[b];
		this.array[b] = temp;
	}
}

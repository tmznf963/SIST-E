
public class Sort {
	private Student[] array;
	private int count;
	public Sort(Student[] array, int count) {//������
		this.array = array;
		this.count = count;
	}
	public void BubbleSort() {
		for(int i = 0 ; i< count -1 ; i++) {
			for(int j = 0 ; j < count -1 ; j++) {
				if(this.array[j].getSum() < this.array[j+1].getSum()) {//��������
					this.swap(j,j+1);//j��°, j+1��° ��
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


public class Sort {
	private Db[] array;
	private int count;

	public Sort(Db[] array, int count) {// ������
		this.array = array;
		this.count = count;
	}
	public void BubbleSort() {
		for(int i = 0 ; i<count-1 ; i++) {//n-1 �� ����
			for(int j = 0; j < count-1 ; j++) {
				if(this.array[j].getSum() < this.array[j+1].getSum()) {//�հ� �������� #������
					Db temp = this.array[j];
					this.array[j] = this.array[j+1];
					this.array[j+1] = temp; 
				}
			}
		}
	}
}

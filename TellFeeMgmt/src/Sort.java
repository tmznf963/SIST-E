
public class Sort {
	private Db[] array;
	private int count;

	public Sort(Db[] array, int count) {// 생성자
		this.array = array;
		this.count = count;
	}
	public void BubbleSort() {
		for(int i = 0 ; i<count-1 ; i++) {//n-1 번 까지
			for(int j = 0; j < count-1 ; j++) {
				if(this.array[j].getSum() < this.array[j+1].getSum()) {//합계 내림차순 #정수비교
					Db temp = this.array[j];
					this.array[j] = this.array[j+1];
					this.array[j+1] = temp; 
				}
			}
		}
	}
}

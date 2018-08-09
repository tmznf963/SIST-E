public class Sort1{
	private Product [] array;
	private int count;
	public Sort1(Product [] array, int count) {
		this.array = array;
		this.count = count;
	}
	public void selectionSort() {//선택정렬
		for(int i = 0 ; i < count-1 ; i++) {
			for(int j = i +1 ; j < count ; j++) {
				if((int)(this.array[i].getPer_cost()*100) <
						(int)(this.array[j].getPer_cost()*100)) {
					//swap(i,j);//스왑핑
					int ranking = this.array[i].getRanking();
					ranking++;
					this.array[i].setRanking(ranking);
				}else if((int)(this.array[i].getPer_cost()*100) >
						(int)(this.array[j].getPer_cost()*100)) {
					int ranking = this.array[j].getRanking();
					ranking++;
					this.array[j].setRanking(ranking);
				}
			}
		}
	}
	private void swap(int a, int b) {
		Product temp = this.array[a];
		this.array[a] = this.array[b];
		this.array[b] = temp;
	}
}
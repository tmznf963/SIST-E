import java.util.Vector;

public class Sort {
	private Vector<Student> vector;
	public Sort(Vector<Student> vector) {//생성자
		this.vector = vector;
	}
	
	public void BubbleSort() {
		for(int i = 0 ; i< this.vector.size() -1 ; i++) {
			for(int j = 0 ; j < this.vector.size() -1 ; j++) {
				if(this.vector.get(j).getSum() < this.vector.get(j+1).getSum()) {//내림차순
					this.swap(j,j+1);//j번째, j+1번째 비교
				}
			}
		}
	}
	private void swap(int a , int b) {
		Student temp = this.vector.elementAt(a);
		this.vector.setElementAt(this.vector.elementAt(b), a);
		this.vector.setElementAt(temp, b);//앞에번째 껄 뒤에번쨰로 바꿈
		
	}
}

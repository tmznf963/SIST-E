import java.util.Vector;

public class Sort {
	private Vector<Student> vector;
	public Sort(Vector<Student> vector) {//������
		this.vector = vector;
	}
	
	public void BubbleSort() {
		for(int i = 0 ; i< this.vector.size() -1 ; i++) {
			for(int j = 0 ; j < this.vector.size() -1 ; j++) {
				if(this.vector.get(j).getSum() < this.vector.get(j+1).getSum()) {//��������
					this.swap(j,j+1);//j��°, j+1��° ��
				}
			}
		}
	}
	private void swap(int a , int b) {
		Student temp = this.vector.elementAt(a);
		this.vector.setElementAt(this.vector.elementAt(b), a);
		this.vector.setElementAt(temp, b);//�տ���° �� �ڿ������� �ٲ�
		
	}
}

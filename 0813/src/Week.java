
public enum Week { // ������ enum
	SUN(0) , MON(10) , TUE(20), WED(30) , THU(70) , FRI(100) , SAT(1000); //���
	private int value;
	Week(int value){//���� ������ ��� ����(������ �������� �� �ֱ�)
		this.value = value;
	}
	public int display() {
		return this.value;
	} // �ݵ�� ��� �ڿ� �;� �Ѵ�.
}
//protected �����ڸ� ������ �־
//�ٸ� Ŭ�������� ���� �� �� ����.( Call X )

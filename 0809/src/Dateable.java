
public interface Dateable {// ���, �߻�޼ҵ� ����
	//1. public static final ��� ����. (��� ����)
	//����� �빮��
	int SUN = 0;
	int MON = 1 , TUE = 2 , WED = 3 , THU = 4 , FRI = 5 , SAT = 6;
	
	//2. public abstract �޼ҵ� ����.
	void display();
	
	int get(); //public ����
	void set(int week);
}

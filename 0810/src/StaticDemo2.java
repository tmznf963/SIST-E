
public class StaticDemo2 {
	private int su; //�������
	private final int num;//������
	private static double avg;//��������
	private static final char grade;//�������
	
	static{//static �ʱ�ȭ �� //�ѹ��� ȣ��
		avg = 89.5; grade = 'B';
	}
	
	public StaticDemo2 (int su, int num) {//������ == ����� �ʱ�ȭ
		this.su = su;
		this.num = num;
	}
	public static void main(String[] args) {

	}
}

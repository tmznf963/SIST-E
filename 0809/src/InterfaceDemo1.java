
public class InterfaceDemo1 {
	public static void main(String[] args) {
		// 5. interface�� �߻�Ŭ������ ���� �ν��Ͻ��� ���� ���Ѵ�.
		// �ݵ�� ���������� ����
		Dateable date = new Date(); //�ڽ� ���(�߻�ȭ, �������̽�)
		
		date.set(Dateable.THU);//�ڽ��� set
		System.out.println("������ " +date.get()+"�� ° �����Դϴ�.");//�ڽ��� get
	}
}

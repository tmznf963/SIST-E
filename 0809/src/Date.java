//3. interface�� ��� ���� �� implements ���
//4. interface�� �߻� �޼ҵ带 ������ �Ҷ� �ݵ�� public.
public class Date implements Dateable {// �������̽� ���
	private int w;
	
	@Override
	public void display() {

	}

	@Override
	public int get() {
		return this.w;
	}

	@Override
	public void set(int w) {
		this.w = w;
	}
	
}

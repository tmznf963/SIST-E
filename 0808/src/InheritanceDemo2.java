
public class InheritanceDemo2 {
	private int num = 5; // �������(instance) //�ּ��ʿ�
	public static void main(String[] args) {
		InheritanceDemo2 id2 = new InheritanceDemo2();
		System.out.println(id2.num);
	}	
	void display() { //this, super �� static(��������) �� ���� ��� �Ұ�.
		System.out.println("display() = "+ this.num);
	}
}

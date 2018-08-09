
public class InterfaceDemo2 implements Father , Mother {//�������̽��� ���� ��� ����
	@Override
	public void grandFather() {System.out.println("�Ҿƹ��� ����");}
	public void grandMather() {System.out.println("�ҸӴ� ����");}
	public void father() {System.out.println("�ƹ��� ����");}
	public void mother() {System.out.println("��Ӵ� ����");}
	//���� ��� == ��� ������(Override) �ؾ���.
	public void display() {System.out.println("Call by display()");}
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();//������ ���� �θ� = �ڽ�();
		gf.grandFather();
		// 7. �� interface ���������� ������ interface���� ����� �޼ҵ常 ���� ����.
		
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMather gm = id;//������
		gm.grandMather();
		
		Father f = new InterfaceDemo2();
		f.father(); f.grandFather(); f.grandMather();
		// 8. �ڽ� interface�� ��ӹ��� �θ� interface�� �޼ҵ� ���� ����
		//f.display();
		// 9. �θ��� ���������� �ڽ��� ��� �޼ҵ� ������ �ƴ϶� �����ǵ� �޼ҵ常 ���� ����
		
		Mother [] array = new Mother[3];
		array[0] = new InterfaceDemo2();//������ ����
		array[0].mother();//mother �ּ��̱⿡ mother �� ����
		// 10. interface�� �迭 ���� ����
		
		System.out.println("Father name = " + Father.NAME);
		System.out.println("Mother name = " + Mother.NAME);//interface �̸�.��� --> ����
	}
}

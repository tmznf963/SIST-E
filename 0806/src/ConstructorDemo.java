
public class ConstructorDemo {
	public static void main(String[] args) {
		Point p = new Point(50,80);//�����ڿ��� �� �ֱ�
		p.display();
		p.set(400, 700);
		p.display();
	}
}

class Point{
	//private int x=100, y = 200;
	private int x,y; //�ʱⰪ = 0
	
	Point(int x, int y){//������ , ��� �������� �ʱⰪ
		System.out.println("��ü�� �����ڿ� ��Ƚ��ϴ�.");
		this.x = x; this.y = y;//���� �ʱ�ȭ
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void display() {
		System.out.printf("%d , %d \n",x,y);
	}
}


public class ConstructorDemo {
	public static void main(String[] args) {
		Point p = new Point(50,80);//생성자에게 값 주기
		p.display();
		p.set(400, 700);
		p.display();
	}
}

class Point{
	//private int x=100, y = 200;
	private int x,y; //초기값 = 0
	
	Point(int x, int y){//생성자 , 멤버 변수들의 초기값
		System.out.println("객체가 생성자에 들렸습니다.");
		this.x = x; this.y = y;//변수 초기화
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void display() {
		System.out.printf("%d , %d \n",x,y);
	}
}

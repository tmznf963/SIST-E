
public class Point extends Object{//equals()는 Object가 가지고 있음.
	private int x, y;

	public Point(int x, int y) {// 생성자
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;//강제 형변환
		if(this.x == other.x && this.y == other.y)
			return true;
		else return false;
	}
}


public class Point extends Object{//equals()�� Object�� ������ ����.
	private int x, y;

	public Point(int x, int y) {// ������
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;//���� ����ȯ
		if(this.x == other.x && this.y == other.y)
			return true;
		else return false;
	}
}

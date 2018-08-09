// 6. interface 끼리의 상속은 extends , 다중상속 가능
public interface Father extends GrandFather, GrandMather{
	public static final String NAME = "Michael";
	void father();
}

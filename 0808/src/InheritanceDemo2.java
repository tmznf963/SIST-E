
public class InheritanceDemo2 {
	private int num = 5; // 멤버변수(instance) //주소필요
	public static void main(String[] args) {
		InheritanceDemo2 id2 = new InheritanceDemo2();
		System.out.println(id2.num);
	}	
	void display() { //this, super 는 static(공유지역) 과 같이 사용 불가.
		System.out.println("display() = "+ this.num);
	}
}

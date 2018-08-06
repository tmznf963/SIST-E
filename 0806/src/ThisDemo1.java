
public class ThisDemo1 {
	public static void main(String[] args) {
		A a = new A();
		a.copy();
	}
}
class A {
	public String name = "Aclass";
	public A() {	System.out.println("A+방금 생성");	}
	public void copy() {
		B b = new B();
		b.copy(this);//나(A)를 넘겨
	}
}
class B {
	public void copy(A a_other) {
		System.out.println("B+"+a_other.name);
	}
}
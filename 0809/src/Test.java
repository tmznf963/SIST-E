	//추상클래스
	//반드시 자식을 만들어서 다형성으로 구현해야함.
	//new Test(); 못함
abstract class Test {
	private String name;

	public Test(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}

}
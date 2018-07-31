
public class ClassVariableDemo {
	public static void main(String[] args) {
		int kor =90;//지역변수(반드시 초기화 값)
		System.out.println("E_num ="+Employee.E_num);//주소를 알려줘야 함.
	}
}

class Employee{
	static String E_num = "2018-07";
	//사번 static = 공유변수(스태틱변수,클래스변수) = class가 없어도 생성됨
	int salary = 200;//멤버변수
}

class Person{
	static String E_num = "2016-01";
}
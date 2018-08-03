
public class Student {
	private String name; //Encapsulation 은닉화
	private int kor;
	
	public void setName(String irum) {
		name = irum;;
	}
	public String getName() { //리턴타입 String
		return name;
	}
	
	public void setKor(int k) {
		kor = k;
	}
	public int getKor() { //리턴타입 int
		return kor;
	}
}

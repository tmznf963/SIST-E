
public class EnCapDemo {
	public static void main(String[] args) {
		Student std = new Student();
		//std.name = "��ö��";
		std.setName("ö��Ŵ");
		
		//std.kor = 80;
		std.setKor(80);
		
		System.out.println("name = "+std.getName());
		System.out.println("name = "+std.getKor());
	}
}

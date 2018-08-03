
public class EnCapDemo {
	public static void main(String[] args) {
		Student std = new Student();
		//std.name = "±èÃ¶¼ö";
		std.setName("Ã¶¼öÅ´");
		
		//std.kor = 80;
		std.setKor(80);
		
		System.out.println("name = "+std.getName());
		System.out.println("name = "+std.getKor());
	}
}

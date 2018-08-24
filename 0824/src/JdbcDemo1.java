import kr.co.sist.model.StudentDTO;

//User, Developer , View 역할
public class JdbcDemo1 {
	public static void main(String[] args) {
		String data = "1101   한송이   78   87   83   78";
		String[] array = data.split("\\s+");
		
		StudentDTO s = new StudentDTO(array[0],array[1],
				Integer.parseInt(array[2]),Integer.parseInt(array[3]),
				Integer.parseInt(array[4]),	Integer.parseInt(array[5]));
		Calc calc = new Calc(s);
		calc.calc();
		SeongjeokController.insert(s);
	}
}

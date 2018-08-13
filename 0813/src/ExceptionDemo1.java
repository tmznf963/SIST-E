
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int [] array = {1,2,3};
		for(int i = 0 ; i <= 3 ; i++) {
			try {
				System.out.println(array[i]);				
			}catch(NullPointerException e) { 
				System.out.println("값이 없습니다.");
			}catch(ArithmeticException e) {
				System.out.println("분모는 0이 될 수 없습니다.");
			}catch(RuntimeException e) { //부모형 RuntimeException  == 범위가 넓음 , 제일 밑으로 와야함.
				System.out.println("배열의 수를 초과하였습니다.");
			}catch(Exception e) {
				System.out.println("최상위 부모 Exception 처리");
			}
		}
	}
}////배열의 수 초과 예외처리

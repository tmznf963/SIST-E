
public class ExceptionDemo4 {
	public static void main(String[] args) {
		try {
			System.out.println(4/0);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally.............");
		}
	}
}
/*
1.try/catch
2.try/finally
3.try/catch/finally
*/

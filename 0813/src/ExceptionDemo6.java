
public class ExceptionDemo6 {
	public static void main(String[] args) {
		HackSaeng hs = null;
		try{
			hs =new HackSaeng(100,-90);//KoreanException�����ڴ� Exception ó�� �ؾ���. == try/catch
		}catch(KoreanException e) {
			System.out.println(e.getMessage());
			//System.out.println(e);//toString();
		}
	}
}

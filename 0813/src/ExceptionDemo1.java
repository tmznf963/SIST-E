
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int [] array = {1,2,3};
		for(int i = 0 ; i <= 3 ; i++) {
			try {
				System.out.println(array[i]);				
			}catch(NullPointerException e) { 
				System.out.println("���� �����ϴ�.");
			}catch(ArithmeticException e) {
				System.out.println("�и�� 0�� �� �� �����ϴ�.");
			}catch(RuntimeException e) { //�θ��� RuntimeException  == ������ ���� , ���� ������ �;���.
				System.out.println("�迭�� ���� �ʰ��Ͽ����ϴ�.");
			}catch(Exception e) {
				System.out.println("�ֻ��� �θ� Exception ó��");
			}
		}
	}
}////�迭�� �� �ʰ� ����ó��


public class AssertionDemo { //���� �ۼ��� �ڵ带 ����. for���� ���� 10�� ���Ҵ���.
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 1 ; i <11 ; i++) {
			sum+=i;
		}
		assert i == 11 : "Not OK"; //message //cmd --> java -ea AssertionDemo
		System.out.println("OK");
		
		/*if(i == 11)System.out.println("OK");
		else System.out.println("Not OK");*/
	}
}

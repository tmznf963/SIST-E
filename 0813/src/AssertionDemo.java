
public class AssertionDemo { //내가 작성한 코드를 검증. for문이 정말 10번 돌았는지.
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

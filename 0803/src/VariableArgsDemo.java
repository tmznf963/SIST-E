
public class VariableArgsDemo {
	public static void main(String[] args) {

//		print(2,3,4,5);//갯수가 가변적이다
		print(3,"Hello",false,'A'); //Type 다를 때
	}
//	static void print(int ... arr) {//배열 --> ... 함축어(배열) //받는 갯수를 모를때 사용
//		System.out.println(arr.length);
//	}
	
	static void print(Object ... oj) {//Type 다를 때 부모 Object 
		for(int i = 0 ; i < oj.length ; i++) {
			System.out.println("oj["+i+"] = " + oj[i]);
		}
	}
}

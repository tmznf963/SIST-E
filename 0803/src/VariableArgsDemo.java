
public class VariableArgsDemo {
	public static void main(String[] args) {

//		print(2,3,4,5);//������ �������̴�
		print(3,"Hello",false,'A'); //Type �ٸ� ��
	}
//	static void print(int ... arr) {//�迭 --> ... �����(�迭) //�޴� ������ �𸦶� ���
//		System.out.println(arr.length);
//	}
	
	static void print(Object ... oj) {//Type �ٸ� �� �θ� Object 
		for(int i = 0 ; i < oj.length ; i++) {
			System.out.println("oj["+i+"] = " + oj[i]);
		}
	}
}

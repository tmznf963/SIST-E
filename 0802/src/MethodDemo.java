
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo(); //����
		md.calcSum();
	}
	
	void calcSum(){//�޼ҵ�(function)//�������ó�� �ҷ����Ѵ�. ������
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			sum +=i;
		}
		System.out.println("1~100 sum = "+sum);
	}
	
}


public class MethodDemo3 {
	public static void main(String[] args) {
		MethodDemo3 md3 = new MethodDemo3();
//		int su = 5;
//		md3.change(su); //Call By Value
//		System.out.println("su = " + su);
		int a =5 , b=9;
		System.out.println("���� ��");
		System.out.printf("a=%d   b=%d \n",a,b);
		md3.swap(a,b);
		System.out.println("���� ��");
		System.out.printf("a=%d   b=%d \n",a,b);
		
	}
	void swap(int first,int second) {//int num = su //�� ���� //���� ���� x
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("===�޼ҵ�===");
		System.out.printf("a=%d b=%d \n",first,second);
		System.out.println("===�޼ҵ�===");
	}
}

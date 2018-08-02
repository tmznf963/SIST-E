
public class MethodDemo3 {
	public static void main(String[] args) {
		MethodDemo3 md3 = new MethodDemo3();
//		int su = 5;
//		md3.change(su); //Call By Value
//		System.out.println("su = " + su);
		int a =5 , b=9;
		System.out.println("변경 전");
		System.out.printf("a=%d   b=%d \n",a,b);
		md3.swap(a,b);
		System.out.println("변경 후");
		System.out.printf("a=%d   b=%d \n",a,b);
		
	}
	void swap(int first,int second) {//int num = su //값 복사 //서로 영향 x
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("===메소드===");
		System.out.printf("a=%d b=%d \n",first,second);
		System.out.println("===메소드===");
	}
}

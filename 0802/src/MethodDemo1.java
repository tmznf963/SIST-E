
public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1 md1 = new MethodDemo1();
		md1.calcSum(7,50);
		md1.calcSum(50,80);
		md1.calcSum(50,100);//Call By Value(pass by Value)
	}
	void calcSum(int start,int end) {
		int sum = 0;
		for(int i = start ; i <end ; i++) {
			sum += i;
		}
		System.out.printf("%d~%d sum = %d \n",start,end,sum);
	}
}

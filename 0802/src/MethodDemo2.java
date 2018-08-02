
public class MethodDemo2 {
	public static void main(String[] args) {
		MethodDemo2 md2 = new MethodDemo2();
		int a = 30 , b =50 ; //argument
		int sum = md2.calcSum(a,b);//값을 가져옴.
		
		System.out.printf("sum = %d \n",sum);//Call By Reference (pass by reference)
	}//main
	
	int calcSum(int start,int end) {//parameter
		int sum = 0;
		for(int i = start ; i <end ; i++) {
			sum += i;
		}
		return sum; //void ---> int (return 타입) //값을 넘김
	}
	
}//end

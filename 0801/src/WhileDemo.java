
public class WhileDemo {

	public static void main(String[] args) {
//		for(int i = 0 ; i<5 ; i++) {
//			
//		}
//		int j = 0;
//		while(j<100) {
//			System.out.print(" "+j);
//			j++;
//		}
		/*int x,y;
		for(x = 1,y=100; x<101 ; x+=2,y-=3) {
			if(x>y) break;
		}
		System.out.printf("x=%d, y= %d \n",x,y);*/
		
		int i = 1;//초기
		int count = 0;
		while(i<101) {//조건
			System.out.printf("%d ",i);
			count++;
			if(count % 7 ==0) System.out.println();
			i++;//증감
		}
	}
}

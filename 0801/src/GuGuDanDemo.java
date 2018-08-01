
public class GuGuDanDemo {

	public static void main(String[] args) {
//		for(int i = 1; i<6 ; i++) { //세로
//			for(int j =5;i<=j;j--) { //가로
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("==================");
//		for(int i = 1; i<6 ; i++) {
//			for(int j =1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1 ; i<10 ; i++) {
			for(int j = 2 ; j<10 ; j++){
				System.out.printf("%d * %d = %d  ",j,i,(j*i));
			}
			System.out.println();
		}
	}
}

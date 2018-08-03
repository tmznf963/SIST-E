
public class Lab2 {
	public static void main(String[] args) {
		sosu(50);
	}
	static void sosu(int num) {
		int su =0;
		for(int i =2 ; i<num ; i++) {
			for(int j = 2; j <i; j++) {
				if(i%1 ==0 && i%j ==0) {
					System.out.print(" "+i);
				}
			}
		}
	}
}


public class ForDemo1 {

	public static void main(String[] args) {
		for(int i= 0; i<10;i++) {
			
		}
		int [] a = {4,5,6,7,8};
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for(int num : a){// 출력변수 : 반복대상
			System.out.println(num);
		}
	}

}


public class ArrayDemo3 {
	public static void main(String[] args) {
//		int [] array = {1,2,3};
//		
//		int [] temp = new int [array.length*2];
//		
//		for(int i = 0 ; i< array.length;i++) {
//			temp[i] = array[i];
//		}
//		for(int i = 0 ; i< temp.length;i++) {
//			System.out.println(temp[i]);
//		}
		
//		short [] org = {3,4,5,6}; //memory heap address
//		short [] tar = {1,2,7,8,9,10,11,12,13};
//		
//		System.out.println("변경전");
//		System.out.println("org[0]"+org[0]);
//		
//		System.out.println("변경후");
//		org = tar; //주소복사
//		System.out.println("org[0]" + org[0]);
//		tar[0] = 100;
//		System.out.println("org[0]"+org[0]);
//		
//		System.out.println("org[2]"+org[2]);
		
		short [] org = {1,2,3,4};
		short [] tmp = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("변경전");
		System.out.println("tmp[0]  "+tmp[0]);
		
		System.arraycopy(org, 0, tmp, 0, 4);//배열의 값 복사 (주소복사x)
		
		System.out.println("변경후");
		System.out.println("tmp[0]  "+tmp[0]);
		
	}
}

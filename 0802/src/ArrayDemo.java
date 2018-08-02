
public class ArrayDemo {

	public static void main(String[] args) {
		int kor; 		//선언 
		kor = 90;		//할당
		
		int eng = 75; //초기화
		
		int mat;		//값변수
		
		//1st way
		int [] array = new int[4];	//(참조)주소변수 --> 생성(new)
		array[0] = 90;
		array[1] = 44;
		array[2] = 33;
		array[3] = 22;
		for(int i = 0 ; i < 4 ; i++) {
			System.out.printf("array[%d] = %d \n",i,array[i]);
		}
//		System.out.println("array[0] = " + array[0]);
//		System.out.println("array[1] = " + array[1]);
//		System.out.println("array[2] = " + array[2]);
//		System.out.println("array[3] = " + array[3]);
		
//		//2nd way
//		int [ ] c;
//		c = new int[] {4,5,6,7};//생성 할당
//		
//		//3rd way
//		int [] d = {4,5,6,7};
	}
}

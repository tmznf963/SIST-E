
public class ArrayDemo2 {
	public static void main(String[] args) {
		double [] array = new double[] {2.3,4.5,6.7,8.9};
		for(int i = 0; i < array.length ; i++) {
			System.out.println("array["+ i + "]="+array[i]);
		}
		System.out.println("배열의 수 : "+array.length);
	}
}

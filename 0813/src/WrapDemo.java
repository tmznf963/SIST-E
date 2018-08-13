
public class WrapDemo {
	public static void main(String[] args) {
		int su = 5;
		Integer in = su+100; //AutoBoxing
		//Integer in = new Integer(su+100);
		int num = in-5; //AutoUnBoxing
		//in.intValue()-5;
		System.out.println("num = "+num);
		
		/*Integer in = new Integer(su); //wrapping, boxing
		int num = in.intValue(); //unwrapping , unboxing
		System.out.println("num = " + num);*/
	}
}

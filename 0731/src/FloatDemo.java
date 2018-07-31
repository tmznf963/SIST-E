
public class FloatDemo {
public static void main(String[] args) {
	float height = 175.3f;
	//실수의 기본값은 double
	//(double)8바이트가 (float)4바이트로 못들어간다.
	
	double avg = 89.5;
	System.out.printf("avg = %f\n",avg); //실수형
	System.out.printf("avg = %e\n",avg); //지수형
	
	double avg2 = 8.95e-03; //지수
	System.out.printf("avg2 = %f\n",avg2); //실수형
	System.out.printf("avg2 = %e\n",avg2); //지수형
	
	float f = 0.123456789123456789f;
	double d = 0.123456789123456789;
	System.out.println("f = " +f);
	System.out.println("d = " +d);
}
}

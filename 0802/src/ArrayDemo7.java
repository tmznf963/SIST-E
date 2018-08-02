
public class ArrayDemo7 {
	public static void main(String[] args) {
		
		if(args.length!=3) {
			System.out.println("에러 : [첫번째 수] [연산자] [두번째 수]");
			System.exit(-1);
		}
		
		int first = Integer.parseInt(args[0]); //글자 --> 숫자
		int second = Integer.parseInt(args[2]);
		
		switch(args[1]){
		case "+" : System.out.printf("%d + %d = %d \n",first , second , (first+second)); break;
		case "-" : System.out.printf("%d - %d = %d \n",first , second , (first-second)); break;
		case "*" : System.out.printf("%d * %d = %d \n",first , second , (first*second)); break;
		case "/" : System.out.printf("%d / %d = %d \n",first , second , (first/second)); break;
		case "%" : System.out.printf("%d %% %d = %d \n",first , second , (first%second)); break;
			default : System.out.println("Not operater"); break;
		}
	
		
//		for(int i = 0 ; i < args.length ; i++) {
//			System.out.printf("agrs[%s] = %s \n",i,args[i]);
//			
//		}
	}
}

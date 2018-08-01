
public class ForDemo {
	public static void main(String[] args) {
//		//반복변수 i j k
//		int j = 0;
//		for (int i = 1 ; i < 101 ; i++) {
//			if (i%7==0) {
//				System.out.print(i+"\t"); 
//				j++;
//			}
//		}
//		System.out.println("7의 배수 : "+ j);

	/*	for (int i = 65; i < 91; i++) {//A65 Z90
			System.out.printf("%c ",(char)i);
		}*/
		
		/*int count =0;
		for (int i = 1 ; i<101;i++) {
			System.out.print(i+" ");
			count++;
			if(count % 6 == 0) System.out.println();
		}*/
		/*int count = 0;
		for (int i = 65; i < 91; i++) {// A65 Z90
			count++;
			if(count<=5) {
				System.out.printf("%c ",(char)i);
				if(count % 5==0)System.out.println();
			}else if(6<=count && count <=10) {
				System.out.printf("%c ",(char)(i+32));
				if(count % 5==0)System.out.println();
			}else if(11<=count && count <=15) {
				System.out.printf("%c ",(char)(i));
				if(count % 5==0)System.out.println();
			}else if(16<=count && count <=20) {
				System.out.printf("%c ",(char)(i+32));
				if(count % 5==0)System.out.println();
			}else if(21<=count && count <=25) {
				System.out.printf("%c ",(char)(i));
				if(count % 5==0)System.out.println();
			}else {
				System.out.printf("%c ",(char)(i+32));
			}
			
		}*/
		int count = 0, line = 1;
		for(int i = 65; i <91 ; i++) {
			if(line %2 ==1) System.out.printf("%c ",(char)i);
			else if(line %2 ==0) System.out.printf("%c ",(char)(i+32));
			count ++;
			if(count % 5 ==0) {
				System.out.println();
				line++;
			}
		}
	}
}

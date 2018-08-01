
public class DoDemo2 {

	public static void main(String[] args) {
		int r1,r2,r3,r4,r5,r6;
	do {
			r1 = (int)(Math.random()*45+1);
			r2 = (int)(Math.random()*45+1);
			r3 = (int)(Math.random()*45+1);
			r4 = (int)(Math.random()*45+1);
			r5 = (int)(Math.random()*45+1);
			r6 = (int)(Math.random()*45+1);
	}while(r1==r2 || r1==r3 || r1==r4 || r1==r5 || r1==r6 ||
			r2==r3|| r2==r4 || r2==r5 || r2==r6 || 
			r3==r4|| r3==r5 || r3==r6 ||
			r4==r5|| r4==r6 ||
			r5==r6);
		System.out.printf("%d %d %d %d %d %d",r1,r2,r3,r4,r5,r6);
	}

}

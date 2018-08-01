
public class WhileDemo2 {
	public static void main(String[] args) {
		int i=1;
		while(i<11) {
			System.out.printf("%d\t\t",i);
			int j = 1;
			while(j<11) {
				System.out.printf("%d\t",(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

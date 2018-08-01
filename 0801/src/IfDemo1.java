import java.util.Scanner;
public class IfDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("¿Ã∏ß : ");	String name = scan.nextLine();

		System.out.print("√‚ª˝≥‚µµ(ex 1994) : "); int sin = scan.nextInt();
		
		if(sin%12 == 0) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"ø¯º˛¿Ã");
		else if(sin%12==1) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"¥ﬂ");
		else if(sin%12==2) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"∞≥");
		else if(sin%12==3) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"µ≈¡ˆ");
		else if(sin%12==4) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"¡„");
		else if(sin%12==5) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"º“");
		else if(sin%12==6) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"»£∂˚¿Ã");
		else if(sin%12==7) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"≈‰≥¢");
		else if(sin%12==8) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"øÎ");
		else if(sin%12==9) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"πÏ");
		else if(sin%12==10) System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"∏ª");
		else System.out.printf("%s¥‘¿∫ %dªÏ¿Ã∞Ì, %s∂Ï ¿‘¥œ¥Ÿ.",name,(2018-sin+1),"æÁ");
 }
}

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(1,1); //초기치 1개 , 증가치 1개
		//System.out.println(vector.capacity());//Vector의 크기
		
		vector.addElement("Apple");
		vector.addElement("Mango");
		vector.addElement("Melon");
		vector.addElement("Grape");//값 대입
		
		//System.out.println(vector.get(3));
		
		for(int i = 0 ; i < vector.size() ; i++) {
			System.out.println(vector.elementAt(i));
		}
	}
}

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(1,1); //�ʱ�ġ 1�� , ����ġ 1��
		//System.out.println(vector.capacity());//Vector�� ũ��
		
		vector.addElement("Apple");
		vector.addElement("Mango");
		vector.addElement("Melon");
		vector.addElement("Grape");//�� ����
		
		//System.out.println(vector.get(3));
		
		for(int i = 0 ; i < vector.size() ; i++) {
			System.out.println(vector.elementAt(i));
		}
	}
}

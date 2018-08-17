import java.util.Vector;

public class Calc {
	private Vector<Music> vector;
	
	public Calc(Vector<Music> vector) { //생성자 Constructor
		this.vector = vector;
	}
	
	public void calc() {
		for(int i = 0 ; i < this.vector.size() ; i++) {
			Music s = this.vector.get(i);//또는 ElementAt();
			
		}//for
	}
}

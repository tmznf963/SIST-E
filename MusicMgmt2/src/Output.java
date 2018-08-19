import java.util.ArrayList;
import java.util.Vector;

class Output {
	private ArrayList<Account> array;
	private Vector<Janre> vector;
	
	Output(ArrayList<Account> array, Vector<Janre> vector){
		this.array = array;
		this.vector = vector;
	}
	
	void display(){
		int total = 0;
		System.out.println("                            <<���ݰ��� ���α׷�>>");
		writeDash();
		System.out.println("����            ��������Ǹž�            ���������Ǹž�            ��û�����Ǹž�      �Ǹŷ�");
		writeDash();
		for(int i = 0 ; i < this.vector.size() ; i++){
			System.out.printf("%s\t\t%d\t\t\t\t%d\t\t\t%d\t\t%d\n",
					this.vector.elementAt(i).getName(), this.vector.elementAt(i).getKyongi(),
					this.vector.elementAt(i).getYoungnam(), this.vector.elementAt(i).getChoongchung(),
					this.vector.elementAt(i).getNum());
			total += this.vector.elementAt(i).getNum();
		}
		writeDash();
		System.out.println("\n");
		System.out.println("���հ��Ǹŷ� : " + total);
		System.out.println("�Էµ�����");
		write();
	}
	
	private void writeDash(){
		for(int i = 0 ; i < 75 ; i++) System.out.print("-");
		System.out.println();
	}
	
	private void write(){
		for(int i = 0 ; i < this.array.size() ; i++){
			System.out.printf("%d\t%s\t%d\n", 
					this.array.get(i).getBunho(), this.array.get(i).getCode(),
					this.array.get(i).getSu());
		}
	}
}

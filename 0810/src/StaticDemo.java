
public class StaticDemo {
	public static void main(String[] args) {
		Demo [] array = new Demo[3];//Demo��ø �����
		
		for(int i = 0; i< array.length ; i++) {
			array[i] = new Demo();//������
		}
		for(Demo d : array) {
			d.display();
		}
	}
}

class Demo{
	int a;
	static int b;//��������
	public Demo() {
		b++;
		a++;
	}
	public void display() {
		System.out.printf("a = %d , b = %d \n",a,b);
	}
}

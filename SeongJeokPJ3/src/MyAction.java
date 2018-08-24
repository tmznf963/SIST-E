//1. import �Ѵ�
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
public class MyAction implements ActionListener{//2. implements �Ѵ�.
	private Vector<Student> vector;
	private Output output;
	
	public MyAction(Vector<Student> vector, Output output) {//������
		this.vector = vector;
		this.output = output;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {//���ڿ� ��
		case "����ϱ�" : calc(); break;
		case "�����ϱ�" : sort(); break;
		case "�����ϱ�" : save(); break;
		}
	}
	private void calc() {
		Calc calc = new Calc(this.vector);
		calc.calc();
		this.output.refresh(this.vector);
	}
	private void sort() {
		Sort sort = new Sort(this.vector);
		sort.BubbleSort();
		this.output.refresh(this.vector);
	}
	private void save() {
		
	}
}

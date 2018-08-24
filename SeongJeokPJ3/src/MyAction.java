//1. import 한다
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
public class MyAction implements ActionListener{//2. implements 한다.
	private Vector<Student> vector;
	private Output output;
	
	public MyAction(Vector<Student> vector, Output output) {//생성자
		this.vector = vector;
		this.output = output;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {//문자열 비교
		case "계산하기" : calc(); break;
		case "정렬하기" : sort(); break;
		case "저장하기" : save(); break;
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

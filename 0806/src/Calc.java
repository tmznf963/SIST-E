
public class Calc {
	public void calc(Student[] s_arr){
		for(int i=0; i<s_arr.length;i++) {
			Student s = s_arr[i]; //학생생성
			int sum = s.getKor() + s.getEng() + s.getMat();
			s.setSum(sum);
			double avg = sum/3.;
			s.setAvg(avg);
		}
	}
}

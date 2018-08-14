
public class Student<T> implements Comparable<T> {
	private String name;
	private int sum;
	public Student(String name, int sum) {
		this.name = name;
		this.sum = sum;
	}
	@Override //¿Á¡§¿«
	public int compareTo(T o) {
		Student obj = (Student) o;
		return this.sum - obj.sum;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, sum=%d", name, sum);
	}
	
}

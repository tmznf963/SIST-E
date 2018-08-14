import java.util.Arrays;

public class GenericsDemo3 {
	public static void main(String[] args) {
		String [] array = {"Hello","한지민","이미자","World"};
		sort(array);
	}
	static void sort(String[] array) {
		Arrays.sort(array);
		for(String str : array)System.out.println(str);
	}
}

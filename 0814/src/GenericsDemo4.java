
public class GenericsDemo4 {
	public static void main(String[] args) {
		/*Car[] array = {new Car("Sonata",25_000_000),
					   			new Car("Carnival",20_000_000),
								new Car("Matiz",10_000_000),
								new Car("Bentz",80_000_000)
								};*/
		Student[] array = {new Student("한지민",300),
										 new Student("이미자",400),
										 new Student("조용필",320),
										 new Student("김민호",500)
										
		};
		sort(array); 
		display(array);
	}//main
	
	static<T> void display(T [] array) { //만능메소드
		for(T t : array) System.out.println(t);
	}
	
	//Comparable<T> 자식만 메소드
	static <T extends Comparable<T>>void sort(T [] array){//Comparable 자식 <T>만 받는다.
		for(int i = 0 ; i < array.length-1 ; i++) {
			for(int j = 0 ;  j < array.length-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {//Car.price 오름차순
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
}//class

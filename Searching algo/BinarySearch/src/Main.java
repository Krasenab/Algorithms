import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 List<Integer> input = List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50,95,110,225,777,1777,2002,3003,10555,105505,11145455);
		BinarySearch search = new BinarySearch();
		int result =search.getIndexOfElement(input, 11145455);
		
		System.out.println(result);
	}
	
	
	

}

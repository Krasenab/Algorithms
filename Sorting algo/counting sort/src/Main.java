import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] someNum = {10,15,20,10,4,4,4,5,6,7,11,12};
		
		CountingSort c = new CountingSort();
		
	 	int[] result = c.sortArr(someNum);
		
	 	for(int a =0;a<result.length;a++) 
	 	{
	 		System.out.println(result[a] + ", ");
	 	}
	}
	

}

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Search non binary :;
		//List<Integer> input = List.of(10,15,20,3,1,0,5,3,5,6,7,9,10);
		//Collections.sort(input);
		
		//int getIndex = searchNonBinary(input,10);
		//System.out.println("result: " +getIndex);
		 List<Integer> input = List.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50,95,110,225,777,1777);
		int index = testBinarySearch(input,25);
		System.out.println(index);
	}
	public static int searchNonBinary(List<Integer>input,int elemntForSearch) 
	{
		int resultIndex = -1;
		int countOfChecks = 1;
		for(int a=0;a<input.size();a++) 
		{
			countOfChecks++;
			if(elemntForSearch==input.get(a)) 
			{
				
				resultIndex = a;
			}
		}
		System.out.println("Брой проверки : " + countOfChecks);
		return resultIndex;
	}
	
	public static int testBinarySearch(List<Integer> input,int numberForSearch) 
	{
		int index = 0;
	    int left = 0;
	    int right = input.size()-1;
	    
	    while(left<=right) 
	    {
	    	int middle = left+((right-left)/2);
	    	
	    	if(input.get(middle)<numberForSearch) 
	    	{
	    		left = middle +1;
	    	}
	    	else if(input.get(middle)>numberForSearch) 
	    	{
	    		right = middle-1;
	    	}
	    	else if(input.get(middle)==numberForSearch) 
	    	{
	    		index = middle;
	    		break;
	
	    	}
	    }
		
		return index;
	}

}

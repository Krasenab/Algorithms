import java.util.Arrays;

public class CountingSort {

	public  CountingSort() 
	{
		
	}
	
	public int[] sortArr(int[]inputArr)
	{
		int max = Arrays.stream(inputArr).max().getAsInt();
		int min = Arrays.stream(inputArr).min().getAsInt();
		
		int range = max-min+1;
		
		int[] countArr = new int[range];
		
		for(int a=0;a<inputArr.length;a++) 
		{
			int currentElement = inputArr[a];
			int indexForElementSum = currentElement - min;
			countArr[indexForElementSum]++;
		}
		
		// Кумулативната сума
		for(int b=1;b<countArr.length;b++) 
		{
			countArr[b] = countArr[b-1] + countArr[b];
		}
		
		
	
		
		int[] sortedArr = new int[inputArr.length];
		
		for(int c = inputArr.length-1;c>=0;c--) 
		{
			int currentElement = inputArr[c];
			int index = currentElement - min;
			countArr[index]--;
			int indexForOutput = countArr[index];
			
			sortedArr[indexForOutput] = currentElement;
		}
		
		return sortedArr;
	}
}

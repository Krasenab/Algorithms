import java.util.List;

public class BinarySearch {

	public BinarySearch() 
	{
		
	}
	
	public int getIndexOfElement(List<Integer> input,int element) 
	{
		int indexResult = -1;
		
		int left = 0;
		int right = input.size()-1;
		
		while(left<=right) 
		{
			int mid = left +((right-left)/2);
			
			if(input.get(mid)>element) 
			{
				right = mid-1;
			}
			else if(input.get(mid)<element) 
			{
				left = mid+1;
			}
			else if(input.get(mid)==element) 
			{
				indexResult = mid;
				break;
			}
		}
		
		return indexResult;
	}
	
}

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] someNum = {10,15,20,10,4,4,4,5,6,7,11,12};
		
		int max = Arrays.stream(someNum).max().getAsInt();
		int min = Arrays.stream(someNum).min().getAsInt();
		
		int range = max-min+1;
		
		int[] countArr = new int[range];
		
		for(int a=0;a<someNum.length;a++) 
		{
			int currentNum = someNum[a];
			int indexPosition = currentNum-min;
			
			countArr[indexPosition]+=1;
		}
		
		// kumulativno sabirane
		for(int b=1;b<countArr.length;b++) 
		{
			countArr[b] = countArr[b] + countArr[b-1];
		}
		
		for(int index=0;index<countArr.length;index++) 
		{
			System.out.println(countArr[index] + ", ");
		}
	}

}

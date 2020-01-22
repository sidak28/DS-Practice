import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		
		int n;
		
		n = S.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0;i<n;i++) 
		{
			arr[i] = S.nextInt();
		}
		
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0;i<n;i++) 
		{
 
			if (arr[i] > largest) 
			{	
				secondLargest = largest;
				largest = arr[i];
			} 
			else if (arr[i] > secondLargest) 
			{
				secondLargest = arr[i];
			}
		}
 
		System.out.println(secondLargest);
	}

}

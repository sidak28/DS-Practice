import java.util.*;

public class HighestFrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		
		String str = S.next();
		
		int i,j;
		int l = str.length();
		char ar[] = new char[l];
		int freq[] = new int[l];
		char count[] = new char[l];
		
		for(i=0;i<l;i++)
		{
			freq[i] = 1;
		}
		
		for(i=0;i<l;i++)
		{
			ar[i] = str.charAt(i);
		}
		
		for(i=0;i<l;i++)
		{
			for(j=i+1;j<l;j++)
			{
				if(ar[i] == ar[j])
					freq[i]++;
			}
		}
		
		int max = freq[0];
		
		for(i=0;i<l;i++)
		{
			if(freq[i] >  max)
			{
				max = freq[i];
				count[max] = str.charAt(i);
			}	
		}
		
		for(i=0;i<l;i++)
		{
			System.out.print(count[i]);
		}
	}
	

}

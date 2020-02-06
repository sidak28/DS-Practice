import java.util.*;

public class LeaderElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		
		int i,j,n,count=0,ct=0;
		
		n = S.nextInt();
		
		int ar[] = new int[n];
		int br[] = new int[n];
		
		for (i=0;i<n;i++) 
		{
			ar[i] = S.nextInt();
		}
		for(i=0;i<n;i++) 
		{
			for(j=i+1;j<n-1;j++)
			{
				if(ar[i] >= ar[j])
				{
					ct++;
					if(ct == n-i-2)
					{
						br[count] = ar[i];
						count++;
						ct = 0;
					}
					
				}
				else
					break;
			}
		}

		for(i=0;i<count;i++) 
		{
			System.out.print(br[i] + " ");
		}
		System.out.println(ar[n-1]);
	}

}

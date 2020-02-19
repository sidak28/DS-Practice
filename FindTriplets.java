import java.util.*;

public class FindTriplets {

	public static boolean findTriplets(int ar[])
	{
		int i,j,k;
		int n = ar.length;
		boolean flag = false;
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(ar[i] + ar[j] + ar[k] == 0)
						flag = true;
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		
		int t,i,j,n;
		
		t = S.nextInt();
		
		for(i=0;i<t;i++)
		{
			n = S.nextInt();
			
			int ar[] = new int[n];
			
			for(j=0;j<n;j++)
			{
				ar[i] = S.nextInt();
			}
			
			System.out.println(findTriplets(ar));
		}
		
	}

}

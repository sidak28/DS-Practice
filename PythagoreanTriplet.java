import java.util.*;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		
		int i,j,k,n,a,b,c;
		int count = 0;
		
		n = S.nextInt();
		
		int ar[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			ar[i] = S.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			a = ar[i];
			for(j=0;j<n;j++)
			{
				b = ar[j];
				for(k=0;k<n;k++)
				{
					c = ar[k];
					if(c*c == (a*a + b*b))
						count++;
				}
			}
		}
		if(count > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

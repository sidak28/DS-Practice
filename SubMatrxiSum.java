import java.util.*;

public class SubMatrxiSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		
		int r,c,i,j,x1,x2,y1,y2,sum=0;
		
		r = S.nextInt();
		c = S.nextInt();
		
		int ar[][] = new int[r][c];
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ar[i][j] = S.nextInt();
			}
		}
		
		x1 = S.nextInt();
		y1 = S.nextInt();
		x2 = S.nextInt();
		y2 = S.nextInt();
		
		x1--;
		y1--;
		x2--;
		y2--;
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
		for(i=x1;i<=x2;i++)
		{
			for(j=y1;j<=y2;j++)
			{
				sum += ar[i][j];
			}
		}
		System.out.println(sum);
		
	}

}

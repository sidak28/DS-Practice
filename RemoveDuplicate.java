import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		
		int i,count=0;
		
		String str = S.next();
		
		char ar[] = new char[str.length()];
		char br[] = new char[str.length()];
		
		for(i=0;i<str.length();i++)
		{
			ar[i] = str.charAt(i);
		}
		for(i=0;i<str.length()-1;i++)
		{
			if(ar[i] != ar[i+1])
			{
				br[i] = ar[i];
			}
		}
		for(i=0;i<str.length();i++)
		{
			System.out.print(br[i]);
		}
	}

}

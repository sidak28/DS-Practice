import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		
		int i,n;
		int count = 1;
				
		String s = "";
		
		s = S.next();
		
		String ar[] = s.split("\\.");
		
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '.')
				count++;
		}
		
		System.out.print(ar[count-1]);
		
		for(i=count-2;i>=0;i--)
		{
			System.out.print( "." + ar[i]);
		}
	}
}

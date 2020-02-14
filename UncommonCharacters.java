import java.util.*;

public class UncommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		
		int i,j,count1=0,count2=0;
		
		String s1 = S.next();
		String s2 = S.next();
		
		String s3 = "";
		
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s2.length();j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					count1++;
					break;
				}	
			}
			if(count1 == 0)
				s3 += s1.charAt(i);
			
			count1 = 0;
		}
		for(j=0;j<s2.length();j++)
		{
			for(i=0;i<s1.length();i++)
			{
				if(s2.charAt(j) == s1.charAt(i))
				{
					count2++;
					break;
				}	
			}
			if(count2 == 0)
				s3 += s2.charAt(j);
			
			count2 = 0;
		}
		if(s3.length() == 0)
			System.out.println("-1");
		else
			System.out.println(s3);
	}

}

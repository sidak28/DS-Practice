import java.util.*;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "())()(";
		
		int i,count1=0,count2=0;
		
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '(')
				count1++;
			
			else if(str.charAt(i) == ')')
				count2++;
		}
		if(count1 == count2)
		{
			if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
				System.out.println("Balanced");
			else
				System.out.println("Not Balanced");
		}
		else
			System.out.println("Not Balanced");
		
	}

}

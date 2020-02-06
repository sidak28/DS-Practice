import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		
		int i,n;
		String name = "";
		String naam = "";
		int num;
		
		System.out.println("Enter number of records");
		n = S.nextInt();
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter name");
			S.nextLine();
			name = S.nextLine();
			
			System.out.println("Enter number");
			num = S.nextInt();
			
			hm.put(name, num);
		}
		
		System.out.println("Enter name you want to search");
		S.nextLine();
		naam = S.nextLine();
		
		if(hm.containsKey(naam))
		{
			int ph = hm.get(naam);
			System.out.println(ph);
		}
		else
			System.out.println("Not Found");
	}

}

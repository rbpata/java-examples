import java.util.*;
class stringvalid2{
	
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("\nEnter String :- ");
		str = sc.nextLine();
		
		if(str.length() < 5)
		{
			System.out.print("\nENter valid string greater than 5 Char..");
		}
		else if(!str.matches(".*\\d.*"))
			System.out.print("\nENter valid string using 1 digit..");
		else
			System.out.print("\nValid..");
	}
	
}
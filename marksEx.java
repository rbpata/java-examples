import java.util.*;
import java.lang.*;

class RangeExeption extends Exception{
	
	public RangeExeption(String str)
	{
		super(str);
	}
}

class marksEx{
	
	public static void main(String args[])
	{
		int arr [] = new int[3];
		Scanner sc = new Scanner(System.in);
		try{
		System.out.print("\nEnter 3 Marks :- ");
		for(int i=0;i<3;i++)
		{
			arr[i] = sc.nextInt();
			
			if(arr[i]<0 || arr[i] > 100)
				throw new RangeExeption("\nRange is OUT!!");
			
		}
		if(arr[0] > 40 && arr[1] > 40 && arr[2] > 40)
			System.out.print("\nPASS");
		else
			System.out.print("\nFAIL");
		
		}catch(RangeExeption r)
		{
			System.out.print(r.getMessage());
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}
	
}
import java.lang.*;


class OddException extends Exception
{
	public OddException(int no)
	{
		System.out.print("\nOdd Number :- "+no);
	}
	
}
public class oddcount{
	
	public static void main(String args[])
	{
		int arr[] = new int[5];
		for(int i=0;i<5;i++)
		{
		try{
		
			arr[i] = Integer.parseInt(args[i]);
			if(arr[i]%2 != 0)
				throw new OddException(arr[i]);	
		}
		catch(OddException o)
		{
			o.getMessage();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		}
	}
	
}
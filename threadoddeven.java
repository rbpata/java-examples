
class odd implements Runnable{
	
	int s,e;
	public odd(int s,int e)
	{
		this.s = s%2==0?s+1:s;
		this.e = e;
	}
	public void run()
	{
		for(int i=s;i<e;i+=2)
		{
			System.out.print("\n"+(i));
			try{
		Thread.sleep(300);
		}
		catch(Exception e)
		{
			
		}
		}
		
		
	}
	
}
class even implements Runnable{
	
	int s,e;
	public even(int s,int e)
	{
		this.s = s%2==0?s:s+1;
		this.e = e;
	}
	public void run()
	{
		for(int i=s;i<e;i+=2)
		{
			System.out.print("\n"+(i));
			try{
		Thread.sleep(300);
		}
		catch(Exception e)
		{
			
		}
		}
		
	}
	
}

public class threadoddeven{

	public static void main(String args[])
	{
	
		int start,end;
		start = Integer.parseInt(args[0]);
		end = Integer.parseInt(args[1]);
		
		odd obj1 = new odd(start,end);
		even obj2 = new even(start,end);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		try{
			
			t1.start();
			t2.start();
			System.out.print("\nCompleted..");
			
		}
		catch(Exception e)
		
		{
			e.getMessage();
			
		}
	
	
	
	}

}
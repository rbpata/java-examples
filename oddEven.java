import java.util.*;


class oddnumbers implements Runnable
{
	int start,end;
	public oddnumbers(int start,int end)
{
	this.start = start % 2==0?start+1:start;
	this.end = end;
}
	public void run()
{
	for(int i=start;i<end;i+=2)
{
	try{
	System.out.print("\n"+(i));
	Thread.sleep(300);
	}
	catch(Exception e)
	{
	}
}
}
	
}
public class oddEven{

	public static void main(String args[])
	{
		int start,end;
		start = Integer.parseInt(args[0]);
		end = Integer.parseInt(args[1]);
		oddnumbers obj = new oddnumbers(start,end);
		Thread t1 = new Thread(obj);
	
		try{
		t1.start();
		t1.join();
}
catch(Exception e)
{
}
	}
}
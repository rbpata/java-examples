abstract class calc{
	
	abstract void area();

}
class rectangle extends calc{
	
	int l,b;
	rectangle(int l,int b)
	{
		this.l = l;
		this.b = b;
	}
	void area()
	{
		System.out.print("\narea of a rectangle is :- "+l*b);
	}
	
}

class triangle extends calc{
	
	int l,b;
	triangle(int l,int b)
	{
		this.l = l;
		this.b = b;
	}
	void area()
	{
		System.out.print("\narea of a rectangle is :- "+(l*b)/2);
	}
	
}
public class abstractclass
{
	public static void main(String args[])
	{
		
		rectangle obj = new rectangle(4,5);
		obj.area();
		
	}
}

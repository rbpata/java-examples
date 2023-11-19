


abstract class vegetable 
{
	String color;
	public abstract String toString();
	
}
class carrot extends vegetable
{
	
	public String toString(){
		return "carrot :- "+color;
	}
}
public class vegColor{
	
	public static void main(String args[])
	{
		carrot obj = new carrot();
		obj.color = "red";
		System.out.print(obj.toString());
	}
}
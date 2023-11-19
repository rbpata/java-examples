//Write an interface called Exam with a method Pass(int mark) that returns a Boolean. Write
//another interface called Classify with a method Division(int average) which returns a string.
//Write a class called Result which implements both Exam and Classify. The pass method should
//return true if the marks is greater than or equal to 35 else false. The division method must
//return “First” when the parameter average is 60 or more, “second” when average is 50 or more
//but below 60, “no division” when average is less than 50.

interface Exam{
	
	public boolean Pass(int mark);
	
}
interface classify
{
	public String division(int average);
}
class Result implements Exam,classify{
	public boolean Pass(int mark){

		if(mark >= 35){
			return true;
		}
		else{
			return false;
		}
	}

public String division(int average){
	if(average >=60){
		return "first";
	}
	else if(average >=50 && average<=60)
		return "second";
	else 
		return "no division";
}	
}
public class demoinface{
	
	public static void main(String[] args){
		
		Result obj = new Result();
		System.out.print("\nPassing Status :- "+obj.Pass(45));
		
		System.out.println("\nDivision :- "+obj.division(45));
		
	}
	
}
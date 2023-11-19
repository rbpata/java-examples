//A motorcycle dealer sells two wheelers to his customer on loan, which is to be repaid in
//5 years. The dealer charges simple interest for the whole term on the day of giving the
//loan itself. The total amount is then divided by 60(months) and is collected as equated
//monthly instalment (EMI). Write a program to calculate the EMI for a loan of Rs. X,
//where X is a command line argument. Print the EMI value in rupees.

import java.util.*;
import java.lang.*;

class calc{
	
	double emi;
	calc(double p,double r,double m)
	{
		//this.emi = p*r*(Math.pow(r+1,m))/(Math.pow(r+1,m)-1);
		this.emi = p*r*(Math.pow(r+1,m))/(Math.pow(r+1,m)-1);
		
	Compound intrest:- 

		ci = p*((Math.pow(r-1),n)-1);

	Emi:-

		emi = p*r*(Math.pow(r-1),m)/(Math.pow(r-1,m)-1);
														
	}
	void show()
	{
		System.out.print("Emi :- "+emi);
	}
	
}
public class emi{
	
	public static void main(String args[])
	{
		double p,r,m,temp=12;
		p = Integer.parseInt(args[0]);
		r = temp/(12*100);
		m = 60;
		
		calc obj = new calc(p,r,m);
		
		obj.show();
	}
}
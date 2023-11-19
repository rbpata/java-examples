The abstract Vegetable class has four subclasses named Cabbage,
 Carrot, Brinjal and Potato.Declare one instance variable of type 
 string that indicates the color of vegetable. Create and display instances 
 of these object. Override the toString() method of object to return a string with 
 the name of the vegetable and its color.


abstract class vegetable 
{
	String color;
	abstract String toString();
	
}
class carrot extends vegetable
{
	
	string toString(){
		return "carrot :- "+color;
	}
	
}
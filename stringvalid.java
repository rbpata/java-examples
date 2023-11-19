// Display each character on separate line in reverse order
// Count total number of characters and display each character’s position too.
// Identify that whether the string is palindrome or not
// Count total number of uppercase and lowercase characters in it.


class stringvalid{
	
	public static void main(String args[])
	{
		String str;
		str = args[0];
		
		int len = str.length();
		for(int i=len - 1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(str.charAt(i)+" position :- "+(i+1));
		}
		
		
		
		
		
		boolean isPalindrome = true;
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i) != str.charAt(len-i-1))
			{
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome){
			System.out.print("\nPallindrome...");
		}
		else{
			System.out.print("\n Not Pallindrome...");
		}
		int up=0,low=0;
		for(int i=0;i<len;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				up++;
			else
				low++;
			
		}
		System.out.print("\n uppper :- "+up+" low :- "+low);
	}
	
}
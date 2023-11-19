// Write a program that accepts a String from command line and perform the following operations:
//  Display each character on separate line in reverse order
//  Count total number of characters and display each character’s position too.
//  Identify that whether the string is palindrome or not
//  Count total number of uppercase and lowercase characters in it.
import java.lang.*;

class third {
    public static void main(String[] args) {

        String str = "RamPata";
        // str = args[0];


        int len = str.length();
        System.out.print("\nCharacters In Reverse Order :- \n");
        for (int i = len; i > 0; i--) {
            System.out.println(str.charAt(i));
        }

       

        System.out.println("Total number of characters: " + len);
        System.out.println("Position of each character: ");

        for (int i = 0; i < len; i++) {
            System.out.println(str.charAt(i) + " - " + (i + 1));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The String is a palindrome.");
        } else {
            System.out.println("The String is not a palindrome.");
        }

        int upCount = 0, lowCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upCount++;
            } else if (Character.isLowerCase(ch)) {
                lowCount++;
            }
        }
        System.out.println("Total number of uppercase characters: " + upCount);
        System.out.println("Total number of lowercase characters: " + lowCount);
    }
}

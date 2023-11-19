// Write a program that takes a string from the user and validate it. The string should be at least 5
// characters and should contain at least one digit. Display an appropriate valid message.
import java.util.Scanner;
public class regex {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nENter String :- ");
        String str = sc.nextLine();


        if(str.length() < 5 )
            System.out.print("\nLength is Not Valid..");
        
        
            else if(!str.matches(".*\\d.*"))
            {
                System.out.print("\n not Valid...");
            }
            else
                System.out.print("\nValid..");

        


    }

}

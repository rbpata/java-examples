
import java.lang.*;

class unitException extends Exception{

    unitException()
    {
        super();
    }

}
public class exception {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(args[0]);
        String str = args[1];

        try{

            if(str.equals("cm"))
        {
            double meter = num/100;
            System.out.print("meter :- "+meter);
        }
        else if(str.equals("m"))
        {
            int cm = num *100;
            System.out.print("\nCM :- "+cm);
        }
        else{
            throw new unitException();
        }
        }
        catch(unitException u)
        {
            System.out.println("error!!");
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }


}

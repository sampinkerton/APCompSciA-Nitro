import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        // ASK STRINGS
        System.out.print("First String?");
        String stringOne = input.next();
        
        System.out.print("Second String?");
        String stringTwo = input.next();
        
        System.out.print("Third String?");
        String stringThree = input.next();
        
        //check the things
        if(stringThree.equals(stringOne + stringTwo))
        {
            System.out.println(stringOne + " + " + stringTwo + " is equal to " + stringThree + "!");
        }
        else
        {
            System.out.println(stringOne + " + " + stringTwo + " is not equal to " + stringThree + "!");
        }
    }
}

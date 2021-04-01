import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes ext = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the Maximum value of an integer");
        int NUMBER = input.nextInt();
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by "+ext.maxDiff(NUMBER));
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("Guess the Minimum value of an integer");
        NUMBER = input.nextInt();
        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by "+ext.minDiff(NUMBER));
        
    }
}

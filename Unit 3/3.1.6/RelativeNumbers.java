import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for two numbers
        int a,b;
        System.out.println("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        // Compare the numbers as instructed
        
        // Display the results
        System.out.println("" + a + " < " + b + ": " + (a < b) );
        System.out.println("" + a + " == " + b + ": " + (a == b) );
        System.out.println("" + a + " > " + b + ": " + (a > b) );
    }
}

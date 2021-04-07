import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        System.out.println(calcFactorial(number));
    }
    
    public static int calcFactorial(int x)
    {
        // Write a base case
        //0! = 1
        if(x == 0)
            return 1;
        // Call the simplified solution
        return calcFactorial(x-1) * x;
    }
}

import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numOne, numTwo;
        
        System.out.println("Input a number.");
        numOne = input.nextInt();
        
        System.out.println("Input another one.");
        numTwo = input.nextInt();
        
        System.out.println( numOne / (double)numTwo);
        

    }
}

import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double number;
        System.out.println("Input a number, User!");
        
        number = input.nextDouble();
        
        System.out.println( (int) number);
    }
}

import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(number > 0)
        {
            System.out.println("The number is positive!");
        }
        else if(number < 0)
        {
            System.out.println("The number is negative!");
        }
        else
        {
            System.out.println("The number is neither positive nor negative!");
        }
    }
}

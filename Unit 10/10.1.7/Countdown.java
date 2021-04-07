import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       // Start here
       Scanner ip = new Scanner(System.in);
       System.out.println("Please enter a number to start:");
       System.out.print(countdown( ip.nextInt() ));
       
    }
    
    public static String countdown(int number)
    {
       
       // Base case - return Blastoff!
       if(number == 0)
            return "Blastoff!";
       // Recursive call
       return number + " " + countdown(number - 1);
       
    }
}

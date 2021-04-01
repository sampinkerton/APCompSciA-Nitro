import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        Hello test = new Hello("Pinkerton");
        test.english();
        test.spanish();
        test.russian();
    }
}

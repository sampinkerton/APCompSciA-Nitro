import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction halfFract = new Fraction(1,2);
        int a = 1;
        int b = 2;
        int c, d;
        
        
        // Ask for input
        System.out.println("Enter a numerator");
        c = input.nextInt();
        System.out.println("Enter a denominator");
        d = input.nextInt();
        Fraction userFract = new Fraction(c, d);
        
        // Add the fractions
        Fraction endFract = new Fraction((a*d + b*c),(b*d));
        // Make use of the getDenominator and getNumerator methods
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(halfFract + " + " + userFract + " = " + endFract);
        
    }
}

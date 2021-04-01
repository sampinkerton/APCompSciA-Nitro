import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        
        Scanner kb = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        double a, b;
        System.out.println("Enter Two Doubles");
        
        a = kb.nextDouble();
        b = kb.nextDouble();
        
        calc.sum(a,b);
        calc.subtract(a,b);
        calc.divide(a,b);
        calc.multiply(a,b);
    }
}

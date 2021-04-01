import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a, b;
        Calculator calc = new Calculator();
    
        a = input.nextDouble();
        b = input.nextDouble();
        System.out.println("" + a + " + " + b + " = " + calc.sum(a,b));
        System.out.println("" + a + " - " + b + " = " + calc.subtract(a,b));
        System.out.println("" + a + " * " + b + " = " + calc.multiply(a,b));
        System.out.println("" + a + " / " + b + " = " + calc.divide(a,b));
    }
}

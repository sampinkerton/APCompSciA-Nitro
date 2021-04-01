import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int boards;
        int windows;
        double salesTax;
        
        double totalCost;
        
        System.out.println("Enter the sales tax rate: ");
        salesTax = input.nextDouble();
        System.out.println("How many boards do you need? ");
        boards = input.nextInt();
        System.out.println("How many windows do you need? ");
        windows = input.nextInt();
        
        Construction construct = new Construction(8,11, salesTax);
        
        totalCost = construct.lumberCost(boards) + construct.windowCost(windows);
        
        System.out.println("Total: " + totalCost + "\nGrand Total: " + construct.grandTotal(totalCost));
    }
}

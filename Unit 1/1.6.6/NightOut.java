import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double dCost, mGolf, dessertCost;
        System.out.println("The cost of dinner?");
        dCost = input.nextDouble();
        System.out.println("Cost of minigolf?");
        mGolf = input.nextDouble();
        System.out.println("Cost of dessert?");
        dessertCost = input.nextDouble();
        System.out.print("Grand Total: $");
        System.out.print(dCost+2.0*mGolf+dessertCost);
    }
}

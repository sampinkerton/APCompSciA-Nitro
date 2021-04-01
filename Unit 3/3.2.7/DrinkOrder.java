import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String drink;
        int sugar;
        
        System.out.println("What do you want to drink?");
        drink = input.nextLine();
        
        System.out.println("How many teaspoons of sugar do you want?");
        sugar = input.nextInt();
        
        System.out.println("Confirming your order. You wanted:");
        if(sugar > 0 )
        {
            System.out.println(drink + " with sugar");
        }
        else
        {
            System.out.println(drink);
        }
    }
}

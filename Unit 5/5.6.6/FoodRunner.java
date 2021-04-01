import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner cheese = new Scanner(System.in);
        Food one = new Food("one", 1);
        Food two = new Food("two", 2);
        Food thr = new Food("thr", 3);
        
        System.out.println(one);
        System.out.println("How many would you like?");
        int oneOne = cheese.nextInt();
        
        System.out.println(two);
        System.out.println("How many would you like?");
        int twoTwo = cheese.nextInt();
        
        System.out.println(thr);
        System.out.println("How many would you like?");
        int thrThr = cheese.nextInt();
        
        System.out.println("Your meal will have a total of " + (oneOne*one.getCalories()
            + twoTwo*two.getCalories() + thrThr*thr.getCalories()) + " calories");
    }
}

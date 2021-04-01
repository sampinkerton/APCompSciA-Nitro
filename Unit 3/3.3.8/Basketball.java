import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //ask for name1
        System.out.println("Enter player one's name:");
        String pOne = input.next();
        //ask for name2
        System.out.println("Enter player two's name:");
        String pTwo = input.next();
        // ask for score1
        System.out.println("Enter "+ pOne + "'s score");
        int sOne = input.nextInt();
        //ask for score 2
        System.out.println("Enter "+ pTwo + "'s score");
        int sTwo = input.nextInt();
        //summarize
        if(pOne.compareTo(pTwo) < 0)
        {
            System.out.println(pOne + " scored " + sOne + " points");
            System.out.println(pTwo + " scored " + sTwo + " points");
        }
        else
        {
            System.out.println(pTwo + " scored " + sTwo + " points");
            System.out.println(pOne + " scored " + sOne + " points");
        }
        //who wins
        if(sOne > sTwo)
        {
            System.out.println(pOne + " wins!");
        }
        else
        {
            System.out.println(pTwo + " wins!");
        }
    }
}

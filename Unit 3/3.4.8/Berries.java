import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for a berry initial
        char berry = input.next().charAt(0);
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        
        //test if not r h or g
        if (berry == 'r' || berry == 'h' || berry == 'g')
        {
            switch(berry)
            {
                case 'r': 
                    System.out.println("You ordered raspberry");
                    break;
                case 'h': 
                    System.out.println("You ordered huckleberry");
                    break;
                case 'g': 
                    System.out.println("You ordered goji berry");
                    break;
            }
        }
        else
        {
            System.out.println("Berry not recognized");
        }
    }
}

import java.util.Scanner;
public class Letter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        System.out.println("Enter your word:");
        String userWord = input.nextLine();
        
        System.out.println("Enter the letter you want to replace:");
        String replaceLetter = input.nextLine();
        
        System.out.println("Enter the replacing letter: ");
        String letter = input.nextLine();
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println( replaceLetter(userWord, replaceLetter, letter) );
        
    }
    
    // Modify this method so that it will take a third parameter from a user that is the String they want to
    //to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String letterReplace)
    {
        
        String RETURNTHIS = "";
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                RETURNTHIS += letterReplace;
            } else
            {
                RETURNTHIS += word.substring(i,i+1);
            }
            
        }
        return RETURNTHIS;
    }
}

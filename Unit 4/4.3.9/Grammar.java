import java.util.Scanner;
public class Grammar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        System.out.println("Enter a sentance that uses the word 2 instead of to");
        String incorrectSent = input.nextLine();
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println( useProperGrammar(incorrectSent) );
        
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        int mistakeCount = 0;
        String RETURNTHIS = "";
        for(int i = 0; i < theText.length(); i++)
        {
            if(theText.charAt(i) == '2')
            {
                RETURNTHIS += "to";
                mistakeCount++;
            }
            else
            {
                RETURNTHIS += theText.charAt(i);
            }
        }
        return RETURNTHIS + "\n Fixed " + mistakeCount + " grammatical errors";
    }
}

import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a quote
        // Ask for the author
        System.out.println("quote");
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        String quote = input.nextLine();
        System.out.println("author");
        String author = input.nextLine();
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
        System.out.println("\"" + quote + "\"\n" + author);
    }
}

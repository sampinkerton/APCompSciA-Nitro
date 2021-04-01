import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a Word");
        WordGames game = new WordGames(input.next());
        // Scramble it
        // Print out scrambled word
        System.out.println(game.scramble());
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(game.bananaSplit(idx,word));
        
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter a char");
        String insertAt = input.next();
        System.out.println("Enter a random word");
        String insertWord = input.next();
        System.out.println(game.bananaSplit(insertAt,insertWord));
        
    }
}

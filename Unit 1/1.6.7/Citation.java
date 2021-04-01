import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String author, title, publisher = "";
        int date;
        
        System.out.println("Enter the author's name as 'Last name, First name': ");
        author = input.nextLine();
        
        System.out.println("Enter the title of the book: ");
        title = input.nextLine();
        
        System.out.println("Enter the publisher of the book: ");
        publisher = input.nextLine();
        
        System.out.println("Enter the year the book was published: ");
        date = input.nextInt();
        
        System.out.println(author + ". " + title + ".\n" + publisher + ", " + date + "." );
        
    }
}

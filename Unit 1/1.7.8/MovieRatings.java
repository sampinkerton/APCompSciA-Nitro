import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double rating;
        rating = input.nextDouble() + 0.5;
        System.out.println("Rating rounded: " + (int)rating);
    }
}

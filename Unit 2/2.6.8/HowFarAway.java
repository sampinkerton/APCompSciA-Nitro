import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double latOne, lonOne, latTwo, lonTwo;
        System.out.println("Enter the latitude of the starting location: ");
        latOne = input.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        lonOne = input.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        latTwo = input.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        lonTwo = input.nextDouble();
        
        GeoLocation one = new GeoLocation(latOne, lonOne);
        GeoLocation two = new GeoLocation(latTwo, lonTwo);
        
        System.out.println("The distance is " + one.distanceFrom(two) + " miles.");
    }
}

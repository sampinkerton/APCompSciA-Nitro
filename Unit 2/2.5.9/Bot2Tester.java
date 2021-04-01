import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String name, fAnimal, home;
        int fNumber;
        
        
        System.out.println("Hello. What is your name?");
        name = input.next();
        Bot2 hal = new Bot2(name);
        hal.greeting();
        
        System.out.println("What is your favorite animal?");
        fAnimal = input.next();
        hal.favoriteAnimal(fAnimal);
        
        System.out.println("Where do you live? \n pond");
        home = input.next();
        hal.home(home);
        
        System.out.println("What is your favorite number?");
        fNumber = input.nextInt();
        hal.favoriteNumber(fNumber);
        
        hal.goodbye();
    }
}

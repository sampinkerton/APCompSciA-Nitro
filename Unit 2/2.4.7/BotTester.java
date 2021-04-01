import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Bot halNineK = new Bot("Tracy");
        
        halNineK.greeting();
        halNineK.help();
        System.out.println("Hello. What is your name? What's the weather like?");
        halNineK.weather();
        System.out.println("How many feet in a mile?");
        halNineK.feetInMile();
        halNineK.goodbye();
    }
}

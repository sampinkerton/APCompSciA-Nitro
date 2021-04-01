import java.util.Scanner;
//Refer to your code from the previous My Age exercise. 
// Modify it using the Scanner class to take user input instead of hard coding in your age. 

public class MyAge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Current Age is: " + age);
        age++;
        System.out.println("Age in one year is: " +age);
        age--;
        System.out.println("Current Age is once again: " + age);
    }
}

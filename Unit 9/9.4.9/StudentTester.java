import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner man = new Scanner(System.in);
        // Prompt the user for name, test scores, and service hours
        System.out.println("Please enter the student name:");
        String name = man.next();
        System.out.println("Please enter the Math Score:");
        int math = man.nextInt();

        System.out.println("Please enter the ELA Score:");
        int ela = man.nextInt();

        System.out.println("Please enter the Service Hours:");
        int sh = man.nextInt();
        // Create a HSStudent object
        HSStudent man2 = new HSStudent(name, math, ela, sh);
        // Print the results
        System.out.println("Pass Math? " + man2.passMath());
        System.out.println("Pass ELA? " + man2.passEla());
        System.out.println("Completed Service Hours? " + man2.completeService());
        System.out.println(man2);
    }
}

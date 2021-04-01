import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ender a number. (-1 to quit):");
        
        int current = input.nextInt();
        int largest = current;
        int smallest = current;
        
        while(current != -1)
        {
            if(smallest > current) smallest = current;
            if(largest < current) largest = current;
            
            System.out.println("Smallest # so far: " + smallest);
            System.out.println("Largest # so far: " + largest);
            
            System.out.println("Enter a number. (-1 to quit):");
            current = input.nextInt();
        }
    
        
        
    }
}

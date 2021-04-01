import java.util.ArrayList;

public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add 5 numbers to `numbers`
        int i = 5;
        while(i-- != 0)
        {
            numbers.add(i-3);
        }
        // Print out the first element in `numbers`
        System.out.println(numbers.get(0));
        
    }
}

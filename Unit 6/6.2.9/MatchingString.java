public class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!"};
    
    public static int findString(String myString)
    {
        // your code goes here!
        int i = arr.length;
        while(0 != i--)
        {
            if(arr[i] == myString)
            {
                return i;
            }
            
        }
        return -1;
    }
}

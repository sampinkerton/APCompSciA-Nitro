public class PrintOdd 
{
    public static void main(String[] args)
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    
    public static void printOddIndices(int[] arr)
    {
        // your code goes here!
        int i = 0;
        while(i<arr.length)
        {
            if(i%2==1)
            {
                System.out.println(arr[i]);
            }
            i++;
        }
    }
}

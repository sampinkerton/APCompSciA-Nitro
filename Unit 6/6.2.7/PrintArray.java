public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"a", "b", "c"};
        printArr(arr);
    }
    
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        int i = 0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
}

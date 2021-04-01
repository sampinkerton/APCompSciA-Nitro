import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> arr)
    {
        int i = arr.size()-1;
        while(i > 0)
        {
            String temp = arr.remove(i);
            if(arr.contains(temp))
            {
                System.out.println(temp + " has been removed.");
                i--;
            } else
            {
                arr.add(i, temp);
                i--;
            }
        }
    }
    public static void removeAOL(ArrayList<String> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).contains("aol.com"))
            {
                arr.remove(i);
                i--;
            }
        }
    }
    public static boolean containsOnlyEmails(ArrayList<String> arr)
    {
        for(int i = 0; i < arr.size(); i++)
            if( !arr.get(i).contains("@") || !arr.get(i).contains(".") )
                return false;
        return true;
    }
}

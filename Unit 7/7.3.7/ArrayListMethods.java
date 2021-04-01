import java.util.ArrayList;
public class ArrayListMethods
{
    public static void print(ArrayList<String> rae)
    {
        for(int i = 0; i < rae.size(); i++)
        {
            System.out.println(rae.get(i));
        }
    }
    public static void condense(ArrayList<String> rae)
    {
        int i = 0;
        while(i < rae.size()-1)
        {
            rae.set(i, rae.get(i) + rae.remove(i+1));;
            i++;
        }
    }
    public static void duplicate(ArrayList<String> rae)
    {
        int i = 0;
        while(i<rae.size())
        {
            rae.add(i, rae.get(i));
            i +=2;
        }
    }
}

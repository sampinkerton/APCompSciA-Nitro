public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] t = {"Welcome", "to", "the snap shot", "app!"};
        
        int i = 0;
        while(i<t.length)
        {
            System.out.println(t[i]);
            i++;
        }
        System.out.println();
        
        
        t[0] = "Upgrade";
        t[3] = "premium app!";
        
        
        
        i = 0;
        while(i<t.length)
        {
            System.out.println(t[i]);
            i++;
        }
        
    }
}

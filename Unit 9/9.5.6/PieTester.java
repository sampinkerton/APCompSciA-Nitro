import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        // Start here!
        Pie[] pies = new Pie[3];
        pies[0] = new Pie("cheese", 1);
        pies[1] = new PumpkinPie(3, true);
        pies[2] = new ApplePie(3);
        for(Pie i : pies)
        {
            System.out.println("Pie: "+ i.getType());
        }
    }
}

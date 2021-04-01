import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
    
    public void add(Musician artist)
    {
        if(top10.size() < 10 && artist.getIsPlatinum())
            top10.add(artist);
        else if(!artist.getIsPlatinum())
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
        else 
            replace(artist);
    }
    public void replace(Musician artist)
    {
        boolean removed = false;
        
        int ileastWeeks = 0;
        for(int i = 1; i < 10; i++)
        {
            if(top10.get(i).getWeeksInTop40() < top10.get(ileastWeeks).getWeeksInTop40())
                ileastWeeks = i;
        }
        if(top10.get(ileastWeeks).getWeeksInTop40() > artist.getWeeksInTop40())
            System.out.println("Sorry, " + artist + " has less weeks in the Top 40 than the other musicians.");
        else
            {
                
                System.out.println("The musician " + top10.get(ileastWeeks).getName() + " has been replaced by " + artist.getName() + ".");
                top10.remove(ileastWeeks);
                top10.add(ileastWeeks, artist);
            }
    }
 
 
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}

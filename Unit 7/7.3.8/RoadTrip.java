import java.util.ArrayList;

public class RoadTrip
{
    ArrayList<GeoLocation> loclist = new ArrayList<GeoLocation>();
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        loclist.add(new GeoLocation(name, latitude, longitude));
    }
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return loclist.size();
    }
    // Get the total miles of the trip
    public double getTripLength()
    {
        double rethis = 0;
        
        for(int i = 0; i < loclist.size()-1; i++)
        {
            rethis += loclist.get(i).distanceFrom(loclist.get(i+1));
        }
        return rethis;
    }
    // Return a formatted toString of the trip
    public String toString()
    {
        String rethis = "";
        for(int i = 0; i < loclist.size(); i++)
        {
            rethis += (i+1);
            rethis += ". ";
            rethis += loclist.get(i).getName();
            rethis += " (";
            rethis += loclist.get(i).getLatitude();
            rethis += ", ";
            rethis += loclist.get(i).getLongitude();
            rethis += ")\n";
        }
        rethis += "\n";
        //rethis += "Stops: " + loclist.size();
        return rethis;
    }
}

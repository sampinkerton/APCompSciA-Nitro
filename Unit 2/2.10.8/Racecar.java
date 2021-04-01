public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double RETURNTHIS;
        RETURNTHIS = 2 * distance / accel;
        
        RETURNTHIS = Math.sqrt(RETURNTHIS);
        RETURNTHIS *= 100;
        RETURNTHIS = Math.round(RETURNTHIS);
        RETURNTHIS /= 100;
        
        return RETURNTHIS;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}

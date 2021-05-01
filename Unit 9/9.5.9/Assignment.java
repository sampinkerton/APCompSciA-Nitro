public class Assignment
{
    private String name;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, double availablePoints, double earnedPoints)
    {
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    
    public double getAvailablePoints()
    {
        return availablePoints;
    }
    public void setAvailablePoints(double a)
    {
        availablePoints = a;
    }
    
    public double getEarnedPoints()
    {
        return earnedPoints;
    }
    public void set(double e)
    {
        earnedPoints = e;
    }
}

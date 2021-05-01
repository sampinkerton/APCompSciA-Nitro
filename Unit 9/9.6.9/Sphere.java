import java.lang.Math;

public class Sphere extends Solid
{
    private double r;
    
    // Sphere constructor should take name then radius
    public Sphere(String name, double r)
    {
        super(name);
        this.r = r;
    }
    
    
    public double volume()
    {
        return (4.0/3) * Math.PI * Math.pow(r,3);
    }
    
    public double surfaceArea()
    {
        return 4 * Math.PI * r * r;
    }
}

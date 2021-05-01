import java.lang.Math;

public class Cylinder extends Solid
{
    private double r, h;
    // Cylinder constructor should take name, radius, height
        // in that order
    public Cylinder(String name, double r, double h)
    {
        super(name);
        this.r = r;
        this.h = h;
    }
    public double volume()
    {
        return Math.PI * r * r * h;
    }
    public double surfaceArea()
    {
        return Math.PI*r*r*2 + 2*Math.PI*r*h;
    }
}

import java.lang.Math;

public class Pyramid extends Solid
{
    private double l, w, h;
    // Pyramid constructor should take name, length, width, height
    public Pyramid(String name, double l, double w, double h)
    {
        super(name);
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
    public double volume()
    {
        return ( l * w * h ) / 3;
    }
    public double surfaceArea()
    {
        return l * w + l * Math.sqrt(Math.pow(w / 2, 2) + Math.pow(h, 2)) + w * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2));
    }
}

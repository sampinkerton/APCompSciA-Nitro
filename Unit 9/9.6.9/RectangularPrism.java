public class RectangularPrism extends Solid
{
    // RectangularPrism constructor should take name, 
        // length, width, height in that order
    private double l, w, h;
    public RectangularPrism(String name, double l, double w, double h )    
    {
        super(name);
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
    public double volume()
    {
        return l*w*h;
    }
    public double surfaceArea()
    {
        return 2*l*w + 2*l*h + 2*w*h;
    }
}

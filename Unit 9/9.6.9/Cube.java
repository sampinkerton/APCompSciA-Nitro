public class Cube extends RectangularPrism
{
    private double side;
    // Cube constructor should take name then side length
    
    public Cube(String name,double side)
    {
        super(name,side, side, side);
    }
    
}

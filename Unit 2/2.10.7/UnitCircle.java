public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // Put your code here!
        double angle0 = 0.0;
        double angleHalfPi = Math.PI/2;
        double anglePi = Math.PI;
        
        double cosine;
        double sine;
        
        cosine = Math.round(Math.cos(angle0) * 100) / 100.0;
        sine = Math.round(Math.sin(angle0) * 100) / 100.0;
        System.out.println(angle0 + ": " + cosine + ", " + sine);
        
        cosine = Math.round(Math.cos(angleHalfPi) * 100) / 100.0;
        sine = Math.round(Math.sin(angleHalfPi) * 100) / 100.0;
        System.out.println(angleHalfPi + ": " + cosine + ", " + sine);
        
        cosine = Math.round(Math.cos(anglePi) * 100) / 100.0;
        sine = Math.round(Math.sin(anglePi) * 100) / 100.0;
        System.out.println(anglePi + ": " + cosine + ", " + sine);
    }
}

public class Dog 
{
    private String breed;
    private String name;
    // Add an instance variable here for name.
    
    public Dog(String theBreed, String theName)
    {
        breed = theBreed;
        name = theName;
    }
    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + breed;
    }
}

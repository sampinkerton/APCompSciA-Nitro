public class Food
{
    //Declare instance variables
    String name;
    int calories;
    
    //Create Food Constructor
    public Food(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }
    
    //Add getter and setter methods for calories
    public int getCalories()
    {
        return calories;
    }
    public void setCalories(int calories)
    {
        this.calories = calories;
    }
    //Add getter and setter methods for name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Add toString method
    public String toString()
    {
        return name + " have " + calories + " calories";
    }
}

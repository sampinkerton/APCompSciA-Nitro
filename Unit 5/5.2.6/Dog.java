public class Dog
{
    private String name;
    private int age;
    private double weight;

    // Add your constructors here
    public Dog(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 0;
    }
    public String toString(){
        return "Name: " + name + "\nWeight: " + weight +  "\nAge: " + age;
    }
}

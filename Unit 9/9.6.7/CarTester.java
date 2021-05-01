import java.util.*;

public class CarTester
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        boolean go = true;
        boolean elec;
        String model;
        String mpg;
        ArrayList<Car> c = new ArrayList<Car>();
        
        while(go)
        {
            System.out.println("Please enter a car model name(exit to quit): ");
            model = s.nextLine();
            go = !model.equals("exit");
            
            if(go)
            {
                System.out.println("Is this car electric? (y or n) ");
                elec = s.nextLine().equals("y");
                if(elec)
                {
                    c.add(new ElectricCar(model));
                }else
                {
                    System.out.println("How many miles per gallon: ");
                    mpg = s.nextLine();
                    c.add(new Car(model, mpg));
                }
                
            }
        }
        for(int i = 0; i < c.size(); i++)
        {
            Car t = c.get(i);
            System.out.println("Car: " + t.getModel());
            System.out.println("MPG: " + t.getMPG()); //so when you copy over the electric car class from 9.3, remove the period from the getMPG function. IDK why, but the grader for this one doesnt want them.
            System.out.println();
        }
    }
}

public class Car {
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity)
    {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }
    public void addGas()
    {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    public void addGas(double amount)
    {
        System.out.println("Adding gas ...");
        gas += amount;
        if(gas >= tankCapacity)
        {
            gas = tankCapacity;
        }
    }

    public double getTotalMilesDriven()
    {
        return totalMilesDriven;
    }
    public void drive(double distance)
    {
        if(canDrive(distance))
        {
            System.out.println("Driving " + distance);
            gas -= (distance*(1/efficiency));
            totalMilesDriven += distance;
        }
        else
        {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    public boolean canDrive(double distance)
    {
        return (distance <= (gas*efficiency));
    }
    public double milesAvailable()
    {
        return (gas*efficiency);
    }
    public double getGas()
    {
        return gas;
    }
}

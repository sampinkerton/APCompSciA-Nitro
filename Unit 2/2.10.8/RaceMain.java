public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double a1 = Math.random()+1;
        double a2 = Math.random()+1;
        
        // Create two Racecar objects
        Racecar one = new Racecar(a1, "One");
        Racecar two = new Racecar(a2, "Two");
        // Compute the finishing times for both cars
        
        // Print times of each car
        System.out.println("First car finished in " + one.computeTime(distance) + " seconds");
        System.out.println("Second car finished in " + two.computeTime(distance) + " seconds");
    }
}

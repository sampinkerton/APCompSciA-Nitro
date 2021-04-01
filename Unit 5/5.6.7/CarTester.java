public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car herbie = new Car(20, 15);
        //Fill up the gas tank
        herbie.addGas();
        //Check the miles available
        System.out.println("Miles available: " + herbie.milesAvailable());
        //Drive 100 miles
        herbie.drive(100);
        //Check the miles available
        System.out.println("Miles available: " + herbie.milesAvailable());
        //Add 2 gallons to the gas tank
        herbie.addGas(2);
        //Check the miles available
        System.out.println("Miles available: " + herbie.milesAvailable());
        //Try driving more miles than available
        herbie.drive(1000);
        //Drive 200 miles
        herbie.drive(200);
        //Check how much gas you have left
        System.out.println("Gas remaining: " + herbie.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " + herbie.getTotalMilesDriven());
    }
}

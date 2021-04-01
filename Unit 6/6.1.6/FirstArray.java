public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String cities[] = {"Las Vegas", "Minsk", "Sao Paulo"};
        int temps[] = {104, 73, 80};
        double rains[] = {4.17, 26.7, 55.0};
      // Print all 3 arrays according to the output in the description
    for(int i = 0; i < 3; i++)
    {
        System.out.println(cities[i] + " has an average annual precipitation of " + rains[i] + " inches.");
        System.out.println(cities[i] + " has an average annual high temp of " + temps[i] + " degrees Fahrenheit.");
    }
    }
}

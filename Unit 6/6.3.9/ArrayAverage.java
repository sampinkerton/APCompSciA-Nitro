public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     int total = 0;
     for(int s : values)
     {
         total += s;
     }

     return (double)( (double)total/values.length);
     // your code goes here!
   }
}

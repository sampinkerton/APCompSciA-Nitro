public class Ball
{
   private String color;
   
   public Ball(String color){
       this.color = color;
   }
   
   public String getColor(){
       return color;
   }
   
   // Write an equals method here that returns true if
   // the colors are the same.
   public boolean equals(Ball other)
   {
       return other.getColor() == this.getColor();
   }
   // Write a toString statement here, for example:
   // Color: Red
   public String toString()
   {
       return "Color: " + color;
   }
   
}
//do what the assignment says to do and copy the code for testEquals from the previous problem -MP

public class PizzaTester 
{
    public static void main(String[] args)
    {
        Pizza pOne = new Pizza("one", "two", 1);
        Pizza pTwo = new Pizza("three", "four", 2);
        Pizza pThree = new Pizza("five", "size", 3);
        
        System.out.println(pOne);
        System.out.println(pTwo);
        System.out.println(pThree);
    }
}

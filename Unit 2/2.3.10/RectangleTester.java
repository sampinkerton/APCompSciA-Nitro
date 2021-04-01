public class RectangleTester
{
    public static void main(String[] args)
    {
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(1,1);
        Rectangle fencePost = new Rectangle(1,3);
        
        System.out.println(brick.toString());
        System.out.println(fencePost.toString());
        
        // Change the fencePost dimensions
        Rectangle newFencePost = new Rectangle(1, 5);
        System.out.println(newFencePost.toString());
        
    }
}

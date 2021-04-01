public class WorkShift
{
    public static void main(String[] args)
    {
        int h, m, s;
        h = 20;
        m = 42;
        s = 16;
        
        m += h*60;
        s += m*60;
        System.out.println(s);
    }
}

public class AddFractions 
{
    public static void main(String[] args)
    {
        int n1 = 1;
        int n2 = 2;
        int d1 = 3;
        int d2 = 4;
        
        int top = n1*d2 + n2 * d1;
        int bottom = d1*d2;
        
        String str1 = n1 + "/" + d1;
        String str2 = n2 + "/" + d2;
        String str3 = top +"/" + bottom;
        
        
        System.out.print(str1 + " + " + str2 + " = " + str3);
    }
}

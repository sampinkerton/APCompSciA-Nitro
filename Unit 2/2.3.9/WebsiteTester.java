public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website test = new Website();
        //public Website(String domainName, String topDomain, int numPeople)
        Website google = new Website("google", "com");
        Website two = new Website("testsiet2","org",123456789);
        
        System.out.println(test.toString());
        System.out.println(google.toString());
        System.out.println(two.toString());
        
        
        
    }
}

public class Salutations
{
    private String name;
    
    public Salutations(String nameGiven)
    {
        name = nameGiven;
    }
    
    
    
    // Dear, name
    public void addressLetter()
    {
        System.out.println("Dear " + name);
    }
    
    //Sincerely, \n name
    public void signLetter()
    {
        System.out.println("Sincerely,\n" + name );
    }
    
    //To whom it may concern
    public void addressMemo()
    {
        System.out.println("To whom it may concern");
    }
    
    public void signMemo()
    {
        System.out.println("Best,\n" + name);
    }
    
}

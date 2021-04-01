import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        Scanner input = new Scanner(System.in);
        String pass = input.nextLine();
        
        System.out.println(passwordCheck(pass));
    }
    
    public static boolean passwordCheck(String password)
    {
        String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        //check lenght
        if(password.length() < 8)
        {
            return false;
        }
        
        //check chars
        
        for(int i = 0; i < password.length(); i++)
        {
            if(validChars.indexOf(password.substring(i, i+1)) < 0 )
            {
                return false;
            }
        }
        
        return true;
    }
}

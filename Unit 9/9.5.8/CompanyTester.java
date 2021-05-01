import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<Company>();
        
        boolean go = true;
        String input;
        boolean online;
        String name;
        String wAddress;
        String street;
        String city;
        String state;
        
        while(go)
        {
            System.out.println("Please enter a company name, enter 'exit' to quit: ");
            name = s.nextLine();
            go = !name.equals("exit");
            
            if(go)
            {
                System.out.println("Is this an online company, 'yes' or 'no': ");
                online = s.nextLine().equals("yes");
                if(online)
                {
                    System.out.println("Please enter the website address: ");
                    wAddress = s.nextLine();
                    companies.add(new OnlineCompany(name, wAddress));
                }else
                {
                    System.out.println("Please enter the street address: ");
                    street = s.nextLine();
                    System.out.println("Please enter the city address: ");
                    city = s.nextLine();
                    System.out.println("Please enter the state address: ");
                    state = s.nextLine();
                    companies.add(new Company(name, street, city, state));
                }
            }
        }
        
        
        
        for(int i = 0; i < companies.size(); i++)
        {
            System.out.println( companies.get(i) );
        }
    }
}

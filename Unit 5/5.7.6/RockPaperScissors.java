import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String comp)
    {
        if(user == comp)
        {
            return TIE;
        }
        
        if(user == "rock" && comp == "paper")
        {
            return  COMPUTER_PLAYER;
        }
        if(user == "rock" && comp == "scissors")
        {
            return USER_PLAYER;
        }
        if(user == "paper" && comp == "scissors")
        {
            return COMPUTER_PLAYER;
        }
        if(user == "paper" && comp == "rock")
        {
            return USER_PLAYER;
        }
        if(user == "scissors" && comp == "paper")
        {
            return USER_PLAYER;
        }
        if(user == "scissors" && comp == "rock")
        {
            return COMPUTER_PLAYER;
        }
        return TIE;
    }
    
    public static void main(String[] args)
    {   
        Scanner ahah = new Scanner(System.in);
        
        while(ahah.hasNext())
        {
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String user = ahah.next();
            System.out.println("User: " + user);
            
            String comp = "";
            switch(Randomizer.nextInt(0,2))
    		{
    			case 0:
    				comp = "scissors";
    				break;
    			case 1:
    				comp = "rock";
    				break;
    			case 2: 
    				comp = "paper";
    				break;
    		}
    		System.out.println("Computer: " + comp);
    		System.out.println(getWinner(user, comp));
        }
    }
}

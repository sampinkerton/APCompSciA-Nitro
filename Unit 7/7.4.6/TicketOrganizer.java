import java.util.ArrayList;
public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }
    public void printPassengersByBoardingGroup()
    {
        String printThis = "";
        //groups
        for(int i = 1; i < 6; i++)
        {
            printThis += "Boarding Group " + i + ":\n";
            for(int j = 0; j < tickets.size(); j++)
                if(tickets.get(j).getBoardingGroup() == i)
                    printThis += tickets.get(j).getName() + "\n";
        }
        System.out.print(printThis);
        
    }
    public void canBoardTogether()
    {
        String printThis = "";
        for(int i = 0; i < tickets.size()-1; i++)
            if(tickets.get(i).getRow() == tickets.get(i+1).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(i+1).getBoardingGroup())
                printThis += tickets.get(i).getName() + " can board with " + tickets.get(i+1).getName() + ".";
        System.out.print(printThis);
        if(printThis.equals(""))
            System.out.println("There are no passengers with the same row and boarding group.");
    }
}

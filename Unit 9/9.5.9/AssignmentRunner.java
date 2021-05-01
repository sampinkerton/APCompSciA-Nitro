import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {

        ArrayList<Assignment> ass = new ArrayList<Assignment>();
        Scanner s = new Scanner(System.in);
        
        boolean go = true;
        String name;
        double aPoints;
        double ePoints;
        String date;
        String TP;
        boolean groups;
        
        while(go)
        {
            System.out.println("Please enter an assignment name (exit to quit): ");
            name = s.nextLine();
            go = !name.equals("exit");
            
            if(go)
            {
                System.out.println("Please enter the available points: ");
                aPoints = s.nextDouble();
                s.nextLine();
                
                System.out.println("Please enter the earned points: ");
                ePoints = s.nextDouble();
                s.nextLine();
                
                System.out.println("Is this a (t)est or (p)roject: ");
                TP = s.nextLine();
                if(TP.equals("p"))
                {
                    System.out.println("Please enter the due date: ");
                    date = s.nextLine();
                    System.out.println("Group project? true or false: ");
                    groups = s.nextBoolean();
                    s.nextLine();
                    ass.add(new Project(name, aPoints, ePoints, date, groups));
                }else
                {
                    System.out.println("Please enter the test date: ");
                    date = s.nextLine();
                    ass.add(new Test(name, aPoints, ePoints, date));
                }
            }
        }
        System.out.println("Your average: " + average(ass));
    }

    public static double average(ArrayList<Assignment> assignments) {
       double a = 0.0;
       double b = 0.0;
       for(int i = 0; i < assignments.size(); i++)
       {
           a += assignments.get(i).getEarnedPoints();
           b += assignments.get(i).getAvailablePoints();
       }
       return a / b * 100;
       
    }
}

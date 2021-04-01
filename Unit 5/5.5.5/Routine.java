public class Routine
{
    double sleep, fun, school, sports = 0;
    public Routine()
    {
        
    }
    public void setSleep(double hoursSleep)
    {
        sleep = hoursSleep;
    }
    public void setFun(double hoursFun)
    {
        fun = hoursFun;
    }
    public void setSchool(double hoursSchool)
    {
        school = hoursSchool;
    }
    public void setSports(double hoursSports)
    {
        sports = hoursSports;
    }
    public void printTotal()
    {
        System.out.println("Weekly Totals");
        System.out.println("Sleep: " + 7*sleep);
        System.out.println("School: " + 7*school);
        System.out.println("Sports: " + 7*sports);
        System.out.println("Fun: " + 7*fun);
        System.out.println("Grand Total: " + (7*(sleep+school+sports+fun)));
        System.out.println("Hours left over: " + (168-7*(sleep+school+sports+fun)));
    }
    
}

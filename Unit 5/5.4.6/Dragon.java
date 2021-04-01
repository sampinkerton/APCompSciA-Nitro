public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int level, String attack)
    {
        this.attack = attack;
        this.level = level;
    }
    // Put getters here
    public String getAttack()
    {
        return attack;
    }
    public int getLevel()
    {
        return level;
    }
    // Put other methods here
    public String fight()
    {
        String returnthis = "";
        int i = level;
        while( i-- != 0)
        {
            returnthis += attack;
        }
        return returnthis;
    }
    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}

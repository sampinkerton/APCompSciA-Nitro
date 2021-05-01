public class OnlineCompany extends Company{
    //company class can be copied from 9.3.8
    //for some reason it says that you can copy it, but the toString in this class is different
    //so i put it here because its not the same as the version seen in 9.3.8. -MP
    private String webAddress;

    public OnlineCompany(String name, String webAddress){
        super(name);
        this.webAddress = webAddress;
    }

    //Return the website address

    public String address(){
        return webAddress;
    }

    /**
    * Remember To get name from superclass, use super.getName()
    * 
    * Example Output:
    * CodeHS
    * www.codehs.com
    */
    
    public String toString(){
        String rethis = "";
        rethis += super.getName() + "\n";
        rethis += "Website: " + address();
        return rethis;
    }
}

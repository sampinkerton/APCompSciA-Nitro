public class Company {
    
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Set missing values to null
    public Company(String name){
        this.name = name;
        streetAddress = null;
        city = null;
        state = null;
    }
    

    public Company(String name, String streetAddress, String city, String state){
       this.name = name;
       this.streetAddress = streetAddress;
       this.city = city;
       this.state = state;
    }

    public String getName(){
      return name;
    }

    /**
    * Example output:
    * 123 Main St
    * Springfield, OH
    */
    public String address(){
       String rethis = "";
       rethis += streetAddress + "\n";
       rethis += city + ", " + state;
       return rethis;
        
    }

    /**
    * Example output:
    * Widget Company
    * 123 Main St
    * Springfield, OH
    */
    public String toString(){
       String rethis = "";
       rethis += name + "\n";
       rethis += address();
       return rethis;
    }
}

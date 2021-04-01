public class CoinTester
{
    public static void main(String[] args) {

       Coins piggyBank = new Coins(4,3,2,1);
       piggyBank.bankValue();
       
       piggyBank.addPenny(); //1.42 | $.70 left; 2 quarters, 2 dimes
       piggyBank.addQuarter(); 
       piggyBank.addQuarter();
       piggyBank.addDime();
       piggyBank.addDime();
       
       piggyBank.bankCount();
       piggyBank.bankValue();
    }
}

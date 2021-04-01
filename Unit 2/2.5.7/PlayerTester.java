public class PlayerTester
{
    public static void main(String[] args) {
       
       BasketballPlayer playerOne = new BasketballPlayer("One", "The Best Team");
       BasketballPlayer playerTwo = new BasketballPlayer("two");
       
       playerOne.addGame(1,2);
       playerOne.addGame(3,4);
       playerOne.addGame(5,6);
       playerOne.addGame(7,8);
       
       playerTwo.addGame(9,10);
       playerTwo.addGame(11,12);
       playerTwo.addGame(13,14);
       playerTwo.addGame(15,16);
       
       
       System.out.println("Player One Stats:");
       playerOne.printPPG();
       playerOne.printAPG();
       System.out.println(playerOne);
       System.out.println();
       
       System.out.println("Player Two Stats:");
       playerTwo.printPPG();
       playerOne.printAPG();
       System.out.println(playerTwo);
       System.out.println();
    }
}

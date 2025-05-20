import java.util.Scanner;

public class SimulatedGame extends RulesOfTheGame
{
    Scanner input = new Scanner(System.in);
    
    public SimulatedGame(String name)
    {
        super(name);
    }
    
    
    
    public String SimulatedGame(casino account) //Uses the other methods to simulate a game of war
    {
        int bet = 0;
        int buffer = 0;
        int wins = 0;
        int losses = 0;
        
        super.createdDeck();
        super.shuffledDeck();

        super.DecksIntoTwoPiles(pile1,pile2);
        
        while(pile1.size() > 0 && buffer != 2)
        {
            System.out.println("How much do you want to bet: ");
            while(1==1)
            {
                bet = input.nextInt();

                if(bet <= account.totalinBank())
                {
                    break;
                }
                else
                {
                    System.out.println("enter a value that is within your budget");
                }
            }
            
            if(pile1.get(0) > pile2.get(0))
            {
                
                WinCase();
                account.wonChips(bet);
                wins++;
            }
            else if(pile1.get(0) == pile2.get(0))
            {
                System.out.println("\n" + "It is a tie: " + pile1.get(0) + " == " + pile2.get(0) + "\n");
                
                tieCase(account,bet);
                
            }
            else
            {
                LostCase();
                account.lossChips(bet);
                losses++;
            }
            
            if(account.totalinBank() <= 0)
            {
                return "wins: \n" + "you" + ": " + wins + "\n" + "opponent: " + losses;
            }
            System.out.println("press 1 to keep playing and press 2 to quit");
            buffer = input.nextInt();
        }
        //System.out.println(pile1);
        return "wins: \n" + "you" + ": " + wins + "\n" + "opponent: " + losses;
    }
   
}
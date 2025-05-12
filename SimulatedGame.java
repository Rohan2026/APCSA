import java.util.Scanner;
//import java.util.ArrayList;

public class SimulatedGame extends RulesOfTheGame
{
    private String name;
    
    Scanner input = new Scanner(System.in);
    public SimulatedGame(String name)
    {
        this.name = name;
    }
    
    
    
    public String aSimulatedGame() //Uses the other methods to simulate a game of war
    {
        int buffer = 0;
        int wins = 0;
        int losses = 0;
        
        super.createdDeck();
        super.shuffledDeck();

        super.DecksIntoTwoPiles(pile1,pile2);
        
        while(pile1.size() > 0 && buffer != 2)
        {
            
            if(pile1.get(0) > pile2.get(0))
            {
                WinCase();
                wins++;
            }
            else if(pile1.get(0) == pile2.get(0))
            {
                System.out.println("\n" + "It is a tie: " + pile1.get(0) + " == " + pile2.get(0) + "\n");
                
                tieCase();
                
            }
            else
            {
                LostCase();
                losses++;
            }
            
            System.out.println("press 1 to keep playing and press 2 to quit");
            buffer = input.nextInt();
        }
        //System.out.println(pile1);
        return "wins: \n" + name + ": " + wins + "\n" + "opponent: " + losses;
    }
   
}
import java.util.Scanner;
import java.util.ArrayList;

/**
 * The {@code RulesOfTheGame} class extends the {@code ArrayofCards} class and represents
 * the rules and mechanics of a card game. It includes methods to handle specific scenarios
 * such as tie cases during gameplay.
 */
public class RulesOfTheGame extends ArrayofCards
{
    Scanner input = new Scanner(System.in); // Scanner for user input
    
    ArrayList<Integer> pile1 = new ArrayList<Integer>(); // Represents the first player's pile of cards
    ArrayList<Integer> pile2 = new ArrayList<Integer>(); // Represents the second player's pile of cards
    
    /**
     * Constructs a new {@code RulesOfTheGame} object with the specified casino name.
     *
     * @param name the name of the casino
     */
    public RulesOfTheGame(String name)
    {
        super(name);
    }
    
    /**
     * Handles the scenario where the top cards of both players' piles are tied.
     * Players continue to remove cards from their piles until one player's card
     * is greater than the other's. The number of cards involved in the tie is tracked.
     *
     * @param account   the {@code casino} object representing the player's account
     * @param betAmount the amount of the bet placed by the player
     */
    public void tieCase(casino account, int betAmount)
    {
        System.out.print("Press any number to continue: ");
        input.nextInt();
        
        boolean indicator = false;
        int cardsinDecision = 2; // Tracks the number of cards involved in the tie

        while(indicator == false)
        {
            pile1.remove(0);
            pile2.remove(0);

            if(pile1.get(0) == pile2.get(0))
            {
                System.out.println("\n" + "It is a tie: " + pile1.get(0) + " == " + pile2.get(0) + "\n");
                cardsinDecision++;
            }
            else
            {
                indicator = true;
            }
        }
        if(pile1.get(0) > pile2.get(0))
        {
            // Logic for when pile1's card is greater
        }
        else
        {
            // Logic for when pile2's card is greater
        }
    }
}
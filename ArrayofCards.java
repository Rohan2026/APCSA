import java.util.ArrayList;
import java.util.Random;

/**
 * The {@code ArrayofCards} class extends the {@code casino} class and represents
 * a deck of cards. It provides methods to create, iterate through, and shuffle
 * the deck of cards.
 */
public class ArrayofCards extends casino
{
    private ArrayList<Integer> cards = new ArrayList<Integer>(); // List to store the cards in the deck
    
    /**
     * Constructs a new {@code ArrayofCards} object with the specified casino name.
     *
     * @param name the name of the casino
     */
    public ArrayofCards(String name)
    {
        super(name);
    }
    
    /**
     * Creates a standard deck of cards with 52 cards.
     * Each card value (1 to 13) is added four times to represent the four suits.
     */
    public void createdDeck()
    {
        for(int i = 1; i <= 13; i++)
        {
            for(int e = 0; e <= 3; e++)
            {
                cards.add(i);
            }
        }
    }
    
    /**
     * Iterates through the deck of cards and prints each card value.
     */
    public void iteratedDeck()
    {
        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }
    }
    
    /**
     * Shuffles the deck of cards randomly using the Fisher-Yates shuffle algorithm.
     */
    public void shuffledDeck()
    {
        Random random = new Random();
        
        for(int i = cards.size() - 1; i > 0; i--)
        {
            int index = random.nextInt(i + 1); // Returns a random number in the range [0, i]
            
            int temp = cards.get(index);
            cards.set(index, cards.get(i));
            cards.set(i, temp);
        }
    }
}
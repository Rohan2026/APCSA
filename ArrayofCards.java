import java.util.ArrayList;
import java.util.Random;

public class ArrayofCards 
{
    private ArrayList<Integer> cards = new ArrayList<Integer>();
    
    public void createdDeck() //makes a deck of cards
    {
        for(int i = 1; i <= 13; i++)
        {
            for(int e = 0; e <= 3; e++)
            {
                cards.add(i);
            }
        }
    }
    public void iteratedDeck() //iterates a deck of cards, printing out the numbers
    {
        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }
    }
    
    public void shuffledDeck() //shuffles the deck of cards
    {
        Random random = new Random();
        
        for(int i = cards.size()-1; i > 0; i--)
        {
            int index = random.nextInt(i + 1); //returns a random number in the range(0,i+1)
            
            int temp =cards.get(index);
            cards.set(index,cards.get(i));
            //cards[index] = cards[i];
            cards.set(i,temp);
        
        }
    }
    public void DecksIntoTwoPiles(ArrayList<Integer> pile1, ArrayList<Integer> pile2) //splits the deck of cards into two separate piles
    {
        for(int i = 0; i < cards.size(); i++)
        {
            
            if(i%2 == 0)
            {
                pile1.add(cards.get(i));
            }
            else if(i%2 == 1)
            {
                pile2.add(cards.get(i));
            }
        }
    }
    
}
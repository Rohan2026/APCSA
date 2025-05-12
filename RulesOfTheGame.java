import java.util.Scanner;
import java.util.ArrayList;

public class RulesOfTheGame extends ArrayofCards
{
    Scanner input = new Scanner(System.in);
    
    ArrayList<Integer> pile1 = new ArrayList<Integer>();
    ArrayList<Integer> pile2 = new ArrayList<Integer>();
    
    public void tieCase() //the case for when the cards are tied
    {
        System.out.print("Press any number to continue: ");
        
        input.nextInt();
        
        boolean indicator = false;
        //int i = 1; -- might need to change this part later

        
        while(indicator == false)
        {
            pile1.remove(0);
            pile2.remove(0);
            
            if(pile1.get(0) == pile2.get(0))
            {
                System.out.println("\n" + "It is a tie: " + pile1.get(0) + " == " + pile2.get(0) + "\n");
            }
            else
            {
                indicator = true;
            }
        }
        if(pile1.get(0) > pile2.get(0))
        {
            System.out.println("");
            WinCase();
        }
        else
        {
            System.out.println("");
            LostCase();
        }
    }
    
    public void WinCase() //case for when your card is higher than the other
    {
        if(pile1.get(0) > pile2.get(0))
            {
                System.out.println("nice you won " + pile1.get(0) + " > " + pile2.get(0));
                pile1.remove(0);
                pile2.remove(0);
            }
    }
    
    public void LostCase() //case for when the opponents card is higher than the other
    {
                System.out.println("nice you lost " + pile1.get(0) + " < " + pile2.get(0));
                pile1.remove(0);
                pile2.remove(0);
    }
}
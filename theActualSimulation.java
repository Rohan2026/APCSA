
import java.util.Scanner;

public class theActualSimulation
{
    public static void simulation()
    {
        boolean gameLoop = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String yourName = input.nextLine();
        
        SimulatedGame finalPlay = new SimulatedGame(yourName);
        Guess theOtherPlay = new Guess(yourName);
        System.out.println(finalPlay.totalinBank());
        
        while(gameLoop == true)
        {
            System.out.println("Choose what you want to do:" + "\n" + 
                                "1. Quit" + "\n" +
                                "2. Play a game of war" + "\n" + 
                                "3. Play guessing game");

            
            int decision = input.nextInt();
            System.out.println();
            
            if(decision == 1 || finalPlay.totalinBank() <= 0)
            {
                break;
            }
            else if(decision == 2)
            {
                System.out.println(finalPlay.SimulatedGame(finalPlay));
                System.out.println("Chips left: " + finalPlay.totalinBank());

            }
            else
            {
                System.out.println(theOtherPlay.otherSimulatedGame(finalPlay));
            }
        }
        System.out.println("Either you are out of chips or you quit playing; balance--> " + finalPlay.totalinBank());

    }
}
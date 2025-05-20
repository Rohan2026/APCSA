import java.util.Scanner;

/**
 * The {@code theActualSimulation} class serves as the main driver for the casino simulation.
 * It allows the user to interact with the program by choosing between different games,
 * such as "War" and a guessing game, or quitting the simulation.
 */
public class theActualSimulation
{
    /**
     * Starts the casino simulation. The user is prompted to enter their name and is then
     * presented with a menu to choose between playing a game of "War," a guessing game,
     * or quitting the simulation. The simulation continues until the user chooses to quit
     * or their bank account balance reaches zero.
     */
    public static void simulation()
    {
        boolean gameLoop = true; // Controls the main game loop
        Scanner input = new Scanner(System.in); // Scanner for user input
        
        System.out.println("Enter your name: ");
        String yourName = input.nextLine(); // Reads the user's name
        
        // Create instances of the games with the user's name
        SimulatedGame finalPlay = new SimulatedGame(yourName);
        Guess theOtherPlay = new Guess(yourName);
        System.out.println(finalPlay.totalinBank()); // Display the initial bank balance
        
        // Main game loop
        while (gameLoop == true)
        {
            System.out.println("Choose what you want to do:" + "\n" + 
                                "1. Quit" + "\n" +
                                "2. Play a game of war" + "\n" + 
                                "3. Play guessing game");

            int decision = input.nextInt(); // Reads the user's choice
            System.out.println();
            
            // Exit the simulation if the user chooses to quit or has no chips left
            if (decision == 1 || finalPlay.totalinBank() <= 0)
            {
                break;
            }
            // Play the "War" game
            else if (decision == 2)
            {
                System.out.println(finalPlay.SimulatedGame(finalPlay));
                System.out.println("Chips left: " + finalPlay.totalinBank());
            }
            // Play the guessing game
            else
            {
                System.out.println(theOtherPlay.otherSimulatedGame(finalPlay));
            }
        }
    }
}
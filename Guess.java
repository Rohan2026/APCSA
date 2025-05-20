import java.util.Scanner;
import java.util.Random;

public class Guess extends casino
{
    public Guess(String name)
    {
        super(name);
    }
    public String otherSimulatedGame(casino account)
    {
        int bet = 0;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Instructions: choose a multiplier amount in which you will have to guess the \n" + 
                            "number, guess correctly; then you will win the multiplied amount. If you lose then \n" + 
                            "you lose that amount \n");
        System.out.println("Type in how much you want to bet: ");
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

        System.out.println("Select your multiplier: \n" + "1 = 2X \n" + "2 = 3X \n" + "3 = 4X");
        int multiplier = input.nextInt();
        
        if(multiplier == 1)
        {
            System.out.println("I am thinking of a number either 0 or 1. What is it?");
            int choice = input.nextInt();
            int randomNumber = random.nextInt(2);
            int amount = bet*2;

            if(choice == randomNumber)
            {
                System.out.println("Congrats; you got the number right");
                account.wonChips(amount);
                
            }
            else
            {
                System.out.println("you got it wrong; it was " + randomNumber);
                account.lossChips(amount);
            }
        }
        else if(multiplier == 2)
        {
            System.out.println("I am thinking of a number between 0 to 2. What is it?");
            int choice = input.nextInt();
            int randomNumber = random.nextInt(3);
            int amount = bet*3;
            
            if(choice == randomNumber)
            {
                System.out.println("Congrats; you got the number right");
                account.wonChips(amount);
                
            }
            else
            {
                System.out.println("you got it wrong; it was " + randomNumber);
                account.lossChips(amount);
            }
        }
        else
        {
            System.out.println("I am thinking of a number between 0 to 3. What is it?");
            int choice = input.nextInt();
            int randomNumber = random.nextInt(4);
            int amount = bet*4;
            
            if(choice == randomNumber)
            {
                System.out.println("Congrats; you got the number right");
                account.wonChips(amount);
                
            }
            else
            {
                System.out.println("you got it wrong; it was " + randomNumber);
                account.lossChips(amount);
            }
        }
        return "thanks for playing";
    }
}
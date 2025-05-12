import java.util.ArrayList;
import java.util.Scanner;

public class myProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input your name: ");
        String name = input.nextLine();
        
        SimulatedGame finalResult = new SimulatedGame(name);
        System.out.println(finalResult.aSimulatedGame());
    }
}
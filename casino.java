/**
 * The {@code casino} class represents a casino entity with a name and a bank account balance.
 * It provides methods to update the bank account balance based on winnings or losses
 * and retrieve the current balance or the casino's name.
 */
public class casino 
{
    private String name; // The name of the casino
    private int bankAccount; // The bank account balance of the casino
    
    /**
     * Constructs a new {@code casino} object with the specified name.
     * The initial bank account balance is set to 5000.
     *
     * @param Thename the name of the casino
     */
    public casino(String Thename)
    {
        name = Thename;
        bankAccount = bankAccount + 5000;
    }
    
    /**
     * Updates the bank account balance by adding the specified amount of chips won.
     * Prints the amount won and the updated balance.
     *
     * @param bet the amount of chips won
     */
    public void wonChips(int bet)
    {
        bankAccount = bankAccount + bet;
        System.out.println("+" + bet);
        System.out.println("amount left: " + bankAccount);
    }
    
    /**
     * Updates the bank account balance by subtracting the specified amount of chips lost.
     * Prints the amount lost and the updated balance.
     *
     * @param bet the amount of chips lost
     */
    public void lossChips(int bet)
    {
        bankAccount = bankAccount - bet;
        System.out.println("-" + bet);
        System.out.println("amount left: " + bankAccount);
    }
    
    /**
     * Returns the total amount in the bank account.
     *
     * @return the current bank account balance
     */
    public int totalinBank()
    {
        return bankAccount;
    }
    
    /**
     * Returns the name of the casino.
     *
     * @return the name of the casino
     */
    public String returnName()
    {
        return name;
    }
}
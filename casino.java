public class casino 
{
    private String name;
    private int bankAccount;
    
    public casino(String Thename)
    {
        name = Thename;
        bankAccount = bankAccount + 5000;
    }
    public void wonChips(int bet)
    {
        bankAccount = bankAccount + bet;
        System.out.println("+" + bet);
        System.out.println("amount left: " + bankAccount);
    }
    public void lossChips(int bet)
    {
        bankAccount = bankAccount - bet;
        System.out.println("-" + bet);
        System.out.println("amount left: " + bankAccount);
    }
    public int totalinBank()
    {
        return bankAccount;
    }
    public String returnName()
    {
        return name;
    }
    
    
}
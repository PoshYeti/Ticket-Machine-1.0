public class TicketMachineVariety
{
    private int priceShort;
    private int priceLong;
    private int balance;
    private int total;
    
    private boolean shortTrip;
    private boolean longTrip;

    public TicketMachineVariety(int ticketShort, int ticketLong)
    {
        priceShort = ticketShort;
        priceLong = ticketLong;
        shortTrip = false;
        longTrip = false;
        balance = 0;
        total = 0;
    }

    public int updatePriceShort()
    {
        
    }
    
    public int getPriceShort()
    {
        System.out.println("The price for a short journey is: " + priceShort;
        return priceShort;
    }
    
    public int getPriceLong()
    {
        System.out.println("The price for a long journey is: " + priceLong;
        return priceLong;
    }

    public int getBalance()
    {
        System.out.println("Your current balance is: " + balance;
        return balance;
    }

    public void insertMoney(int amount)
    {
        if (amount <= 0)
        {
            System.out.println("The amount inserted is not correct");
            System.out.println("Insert a positive amount, you idiot");
            System.out.println();
        }
        else
        {
        balance = balance + amount;
        }
    }
    
    public void returnMoney()
    {
        System.out.println("##################");
        System.out.println("Amount of money returned to your account: " + balance);
        System.out.println();
        
        balance -= balance;
        
        System.out.println("The amount remaining is now: " + balance);
        System.out.println("You really don't want to tip me?");
        System.out.println("##################");
        System.out.println();
    }
    
    public void shortTrainTrip()
    {
        System.out.println("We're going on a short trip? How fun!");
        System.out.println();
        longTrip = false;
        shortTrip= true;
    }
    
    public void longTrainTrip()
    {  
        System.out.println("We're going on a long trip? Better pack my bags!");
        System.out.println();
        shortTrip = false;
        longTrip = true;
    }

    public void printTicket()
    {
        if (shortTrip == true && longTrip == false)
        {
            if(balance >= priceShort)
            {
                System.out.println("##################");
                System.out.println("# Zachorian Express");
                System.out.println("# Ticket");
                System.out.println("# " + priceShort + " kroner.");
                System.out.println("##################");
                System.out.println();
        
                total = total + balance;
                balance -= priceShort;
                
                System.out.println("$$$$$$$$$$$$$$");
                System.out.println("Balance now: " + balance);
                System.out.println("$$$$$$$$$$$$$$");
                System.out.println();
            }
            else
            {
                System.out.println("##################");
                System.out.println("You have not deposited enough money");
                System.out.println("Amount deposited: " + balance);
                System.out.println("Deposit more money to ride the short Zachorian Express");
                System.out.println("##################");
                System.out.println();
            }
        }
        else if (longTrip == true && shortTrip == false)
        {
            if (balance >= priceLong)
            {
                System.out.println("##################");
                System.out.println("# Zachorian Express");
                System.out.println("# Ticket");
                System.out.println("# " + priceLong + " kroner.");
                System.out.println("##################");
                System.out.println();
                
                total = total + balance;
                balance -= priceLong;
                
                System.out.println("$$$$$$$$$$$$$$");
                System.out.println("Balance now: " + balance);
                System.out.println("$$$$$$$$$$$$$$");
                System.out.println();
            }
            else
            {
                System.out.println("##################");
                System.out.println("You have not deposited enough money");
                System.out.println("Amount deposited: " + balance);
                System.out.println("Deposit more money to ride the short Zachorian Express");
                System.out.println("##################");
                System.out.println();
            }
        }
        else
        {
            System.out.println("##################");
            System.out.println("You have not specified if you want the short, or long train trip");
            System.out.println("##################");
            System.out.println();
        }
    }
}

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticket)
    {
        price = ticket;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public boolean insertMoney(int amount)
    {
        if(amount > 0)
        {
            balance += amount;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void returnMoney()
    {
        System.out.println("##################");
        System.out.println("Amount of money returned to your account: " + balance);
        balance -= balance;
        System.out.println("The amount remaining is now: " + balance);
        System.out.println("##################");
        System.out.println();
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        if(balance >= price)
        {
            System.out.println("##################");
            System.out.println("# Zachorian Express");
            System.out.println("# Ticket");
            System.out.println("# " + price + " kroner.");
            System.out.println("##################");
            System.out.println();
    
            // Update the total collected with the balance.
            total = total + balance;
            // Clear the balance.
            balance -= price;
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
            System.out.println("Deposit more money to ride the Zachorian Express");
            System.out.println("##################");
            System.out.println();
        }
    }
}

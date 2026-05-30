class Accounter
{
    protected double amount;

    public Accounter(double amount)
    {
        this.amount = amount;
    }

    public void showBalance()
    {
        System.out.println("Current Balance : " + amount);
    }
}

public class BankAccount extends Accounter
{
    int accountNumber;
    String holderName;

    public BankAccount(int accountNumber, String holderName, double amount)
    {
        super(amount);
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public void showDetails()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + holderName);
        showBalance();
    }

    public void deposit(double money)
    {
        amount += money;
        System.out.println("Deposited Amount : " + money);
        System.out.println("Updated Balance : " + amount);
    }

    public void withdraw(double money)
    {
        if(money <= amount)
        {
            amount -= money;
            System.out.println("Withdrawn Amount : " + money);
            System.out.println("Updated Balance : " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args)
    {
        BankAccount b = new BankAccount(101, "Akhila", 50000);

        b.showDetails();

        System.out.println();

        b.deposit(10000);

        System.out.println();

        b.withdraw(5000);
    }
}
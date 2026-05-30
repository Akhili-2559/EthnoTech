class bank
{
    protected int balance;

    public bank(int balance)
    {
        this.balance = balance;
    }

    public void displayinfo()
    {
        System.out.println("Balance : " + balance);
    }
}

class Main extends bank
{
    int ac_no;

    public Main(int ac_no, int balance)
    {
        super(balance);
        this.ac_no = ac_no;
    }

    @Override
    public void displayinfo()
    {
        super.displayinfo();
        System.out.println("Account Number : " + ac_no);
    }

    void deposit(int amount)
    {
        balance += amount;
        System.out.println("After deposit balance is : " + balance);
    }

    void withdraw(int amount)
    {
        balance -= amount;
        System.out.println("After withdraw balance is : " + balance);
    }

    public static void main(String[] args)
    {
        Main b = new Main(1234, 10000);

        b.displayinfo();
        b.deposit(10000);
        b.withdraw(1000);
    }
}
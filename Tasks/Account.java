class Account {

    protected String accHolder;
    protected int accNo;
    protected double balance;

    public Account(String accHolder, int accNo, double balance) {
        this.accHolder = accHolder;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Holder : " + accHolder);
        System.out.println("Account Number : " + accNo);
        System.out.println("Balance : " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount : " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw Amount : " + amount);
    }

    public double getBalance() {
        return balance;
    }
}



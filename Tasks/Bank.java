class Bank extends Account {

    private String branch;

    public Bank(String accHolder, int accNo, double balance, String branch) {
        super(accHolder, accNo, balance);
        this.branch = branch;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Branch : " + branch);
    }

    public void showAmount() {
        System.out.println("Current Balance : " + getBalance());
    }
}
class Balance{
    private int balance;
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
    	Balance b = new Balance();
        b.setBalance(50000);
        System.out.println(b.getBalance());
    }
}

public class MainClass {

    public static void main(String[] args) {

        Bank b = new Bank("Akhila", 101, 50000, "Madanapalle");

        b.displayInfo();

        System.out.println("\nAfter Deposit");
        b.deposit(10000);
        b.showAmount();

        System.out.println("\nAfter Withdraw");
        b.withdraw(5000);
        b.showAmount();

        System.out.println("\nFinal Balance : " + b.getBalance());
    }
}
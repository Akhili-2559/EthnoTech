class Employee {
    void name() {
        System.out.println("Akhila");
    }
}

class Tester extends Employee {
    void role() {
        System.out.println("Software Engineer");
    }
}

public class Company extends Tester {
    void income() {
        double amount = 50000.50;
        System.out.println(amount);
    }

    public static void main(String[] args) {
        Company c = new Company();

        c.name();
        c.role();
        c.income();
    }
}
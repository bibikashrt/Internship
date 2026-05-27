

class Bank {

    public String name = "Nabil Bank";
    private int amount = 50000;
    protected int account_number = 1234;

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }

    public void displayname() {
        System.out.println("Name:" + name);
        System.out.println("Amount:" + amount);
        System.out.println("Account Number:" + account_number);
    }
}

class Employee extends Bank {

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Account Number" + account_number);
        System.out.println("Amount" + getamount());
    }

}

public class AccessDemonstration {

    public static void main(String[] args) {
        // Bank b = new Bank();
        // b.displayname();
        Employee e = new Employee();
        e.display();
        e.setamount(10000);
        System.out.println("Updated Amount" + e.getamount());
    }

}

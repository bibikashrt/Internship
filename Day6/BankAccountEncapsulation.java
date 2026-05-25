
class Account {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountEncapsulation {

    public static void main(String[] args) {

        Account a = new Account();

        a.deposit(2000);

        System.out.println("Balance: " + a.getBalance());
    }
}
